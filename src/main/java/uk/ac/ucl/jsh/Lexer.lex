import java_cup.runtime.*;
import java.lang.Integer;
import java.util.Stack;

%%

%class Lexer
%unicode
%cup
%column
%line

%{
  Stack<Integer> stack = new Stack<Integer>();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

NonNewlineAndNonSingleQuote                = [^\n']+
DoubleQuoteContent                         = [^\n\"`]+
WhiteSpace                                 = [\t ]+
Unquoted                                   = [^\t \"'`;|<>\n]+

%state SINGLEQUOTED, DOUBLEQUOTED, BACKQUOTED

%%

<YYINITIAL, BACKQUOTED> {
  ">"                            { return symbol(sym.GREATER); }
  "<"                            { return symbol(sym.LESS); }
  ";"                            { return symbol(sym.SEMI); }
  "|"                            { return symbol(sym.PIPE); }

  {WhiteSpace}                   { return symbol(sym.WHITESPACE); }
  {Unquoted}                     { return symbol(sym.UNQUOTED, yytext()); }
}

<YYINITIAL> {
  \"                             { stack.push(YYINITIAL); yybegin(DOUBLEQUOTED); return symbol(sym.DOUBLEQUOTE); }
  "'"                            { stack.push(YYINITIAL); yybegin(SINGLEQUOTED); return symbol(sym.SINGLEQUOTE); }
  "`"                            { stack.push(YYINITIAL); yybegin(BACKQUOTED); return symbol(sym.BACKQUOTE); }
}

<SINGLEQUOTED>{
  "'"                            { yybegin(stack.pop()); return symbol(sym.SINGLEQUOTE); }
  {NonNewlineAndNonSingleQuote}  { return symbol(sym.NON_NEWLINE_NON_SINGLE_QUOTE, yytext()); }
}

<DOUBLEQUOTED> {
   \"                            { yybegin(stack.pop()); return symbol(sym.DOUBLEQUOTE); }
   "`"                           { stack.push(DOUBLEQUOTED); yybegin(BACKQUOTED); return symbol(sym.BACKQUOTE); }
   {DoubleQuoteContent}          { return symbol(sym.DOUBLEQUOTECONTENT, yytext()); }
}

<BACKQUOTED> {
   \"                            { stack.push(BACKQUOTED); yybegin(DOUBLEQUOTED); return symbol(sym.DOUBLEQUOTE); }
   "'"                           { stack.push(BACKQUOTED); yybegin(SINGLEQUOTED); return symbol(sym.SINGLEQUOTE); }
   "`"                           { yybegin(stack.pop()); return symbol(sym.BACKQUOTE); }
}



/* error fallback */
[^]                              { throw new Error("Illegal character <" + yytext() + ">"); }
