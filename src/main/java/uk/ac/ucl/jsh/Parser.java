
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------
package uk.ac.ucl.jsh;

import java_cup.runtime.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\003\000\002\002\004\000\002\002" +
    "\003\000\002\002\003\000\002\003\005\000\002\003\005" +
    "\000\002\021\002\000\002\004\006\000\002\005\007\000" +
    "\002\020\005\000\002\020\002\000\002\017\005\000\002" +
    "\017\002\000\002\012\003\000\002\012\003\000\002\013" +
    "\003\000\002\013\003\000\002\014\005\000\002\014\005" +
    "\000\002\015\003\000\002\015\002\000\002\006\003\000" +
    "\002\006\003\000\002\006\003\000\002\007\005\000\002" +
    "\010\005\000\002\011\005\000\002\016\004\000\002\016" +
    "\004\000\002\016\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\020\004\uffed\005\uffed\006\uffed\007\uffed\010" +
    "\uffed\013\010\014\uffed\001\002\000\006\002\uffff\011\uffff" +
    "\001\002\000\010\002\001\011\001\012\060\001\002\000" +
    "\016\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7\014\ufff7" +
    "\001\002\000\010\002\ufffe\011\ufffe\012\016\001\002\000" +
    "\016\004\uffee\005\uffee\006\uffee\007\uffee\010\uffee\014\uffee" +
    "\001\002\000\006\002\013\011\012\001\002\000\020\004" +
    "\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb\013\ufffb\014\ufffb" +
    "\001\002\000\004\002\000\001\002\000\020\004\uffed\005" +
    "\uffed\006\uffed\007\uffed\010\uffed\013\010\014\uffed\001\002" +
    "\000\004\002\ufffa\001\002\000\020\004\uffed\005\uffed\006" +
    "\uffed\007\uffed\010\uffed\013\010\014\uffed\001\002\000\010" +
    "\002\ufffd\011\ufffd\012\ufffd\001\002\000\016\004\031\005" +
    "\026\006\034\007\025\010\030\014\022\001\002\000\014" +
    "\002\ufff5\006\ufff5\011\ufff5\012\ufff5\013\ufff5\001\002\000" +
    "\014\002\ufff1\006\ufff1\011\ufff1\012\ufff1\013\ufff1\001\002" +
    "\000\014\002\ufff2\006\ufff2\011\ufff2\012\ufff2\013\ufff2\001" +
    "\002\000\004\013\051\001\002\000\014\004\uffed\005\uffed" +
    "\006\uffed\013\010\014\uffed\001\002\000\004\015\045\001" +
    "\002\000\014\002\uffeb\006\uffeb\011\uffeb\012\uffeb\013\uffeb" +
    "\001\002\000\014\004\uffed\005\uffed\006\uffed\013\010\014" +
    "\uffed\001\002\000\010\004\uffe4\006\uffe4\016\uffe4\001\002" +
    "\000\014\002\uffea\006\uffea\011\uffea\012\uffea\013\uffea\001" +
    "\002\000\014\002\uffec\006\uffec\011\uffec\012\uffec\013\uffec" +
    "\001\002\000\020\004\uffed\005\uffed\006\uffed\007\uffed\010" +
    "\uffed\013\010\014\uffed\001\002\000\004\006\036\001\002" +
    "\000\020\002\uffe8\004\uffe8\006\uffe8\011\uffe8\012\uffe8\013" +
    "\uffe8\016\uffe8\001\002\000\010\004\040\006\034\016\041" +
    "\001\002\000\014\002\uffe7\006\uffe7\011\uffe7\012\uffe7\013" +
    "\uffe7\001\002\000\010\004\uffe5\006\uffe5\016\uffe5\001\002" +
    "\000\010\004\uffe6\006\uffe6\016\uffe6\001\002\000\012\004" +
    "\031\005\026\006\034\014\022\001\002\000\014\002\ufff0" +
    "\006\ufff0\011\ufff0\012\ufff0\013\ufff0\001\002\000\004\005" +
    "\046\001\002\000\014\002\uffe9\006\uffe9\011\uffe9\012\uffe9" +
    "\013\uffe9\001\002\000\012\004\031\005\026\006\034\014" +
    "\022\001\002\000\014\002\uffef\006\uffef\011\uffef\012\uffef" +
    "\013\uffef\001\002\000\016\004\ufff8\005\ufff8\006\ufff8\007" +
    "\ufff8\010\ufff8\014\ufff8\001\002\000\014\002\uffed\006\uffed" +
    "\011\uffed\012\uffed\013\054\001\002\000\012\002\ufff9\006" +
    "\ufff9\011\ufff9\012\ufff9\001\002\000\024\002\uffee\004\031" +
    "\005\026\006\034\007\025\010\030\011\uffee\012\uffee\014" +
    "\022\001\002\000\014\002\ufff3\006\ufff3\011\ufff3\012\ufff3" +
    "\013\ufff3\001\002\000\014\002\ufff4\006\ufff4\011\ufff4\012" +
    "\ufff4\013\ufff4\001\002\000\014\002\ufff6\006\ufff6\011\ufff6" +
    "\012\ufff6\013\ufff6\001\002\000\020\004\uffed\005\uffed\006" +
    "\uffed\007\uffed\010\uffed\013\010\014\uffed\001\002\000\010" +
    "\002\ufffc\011\ufffc\012\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\014\002\010\003\004\004\003\005\006\015" +
    "\005\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\020\017\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\021\013\001\001\000\002\001\001" +
    "\000\014\002\014\003\004\004\003\005\006\015\005\001" +
    "\001\000\002\001\001\000\006\005\016\015\005\001\001" +
    "\000\002\001\001\000\016\006\022\007\032\010\031\011" +
    "\026\013\020\014\023\001\001\000\004\017\051\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\015\046\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\015\042\001\001\000\004\016\036\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\005\034\015\005" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\010" +
    "\041\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\006\022\007\032\010\031\011\026\013" +
    "\043\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\006\022\007\032\010\031\011\026\013" +
    "\047\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\015\052\001\001\000\002\001\001\000\020\006\022\007" +
    "\032\010\031\011\026\012\056\013\054\014\055\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\005\060\015\005\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return lexer.next_token(); 
    }

 

  private Lexer lexer;
  private ArrayList<String> args;
  private AppFactory factory;
  public Boolean syntaxErrors;

  public Parser(Lexer lex) {
    super(lex);
    lexer = lex;
    syntaxErrors = false;
    args = new ArrayList<String>();
    factory = AppFactory.getInstance();
  }

  /* Add method syntax_error so it will display the line 
     and column of where the error occurred in the input */ 

  public void syntax_error(Symbol current_token) {
    syntaxErrors = true;
    report_error("Syntax error at line " + (current_token.left+1) + ", column " + current_token.right + ". ", null);
  }

  public void syscall() {
    factory.getApp(args.remove(0)).exec(args, Environment.getOutput());
  }

  public void tryToExpand(String unquoted) {
    if (unquoted.indexOf('*') == -1) {
        args.add(unquoted);
    } else {
        ArrayList<String> paths = Globber.glob(unquoted);
        if (paths.isEmpty()) {
            args.add(unquoted);
        } else {
            args.addAll(paths);
        }
    }
  }

  public void resetArgs() {
    args = new ArrayList<String>();
  }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // command ::= pipe 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("command",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= command EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // command ::= seq 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("command",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // command ::= call 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("command",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // pipe ::= call PIPE call 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("pipe",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // pipe ::= pipe PIPE call 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("pipe",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NT$0 ::= 
            {
              Object RESULT =null;
 resetArgs(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NT$0",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // seq ::= command SEMI NT$0 command 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("seq",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // call ::= optional_whitespace redirection_whitespace_kleene argument whitespace_atom_kleene optional_whitespace 
            {
              Object RESULT =null;
		 syscall(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("call",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // redirection_whitespace_kleene ::= redirection_whitespace_kleene redirection WHITESPACE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("redirection_whitespace_kleene",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // redirection_whitespace_kleene ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("redirection_whitespace_kleene",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // whitespace_atom_kleene ::= whitespace_atom_kleene WHITESPACE atom 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("whitespace_atom_kleene",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // whitespace_atom_kleene ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("whitespace_atom_kleene",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // atom ::= redirection 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("atom",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // atom ::= argument 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("atom",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // argument ::= quoted 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("argument",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // argument ::= UNQUOTED 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 tryToExpand(s); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("argument",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // redirection ::= LESS optional_whitespace argument 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("redirection",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // redirection ::= GREATER optional_whitespace argument 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("redirection",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // optional_whitespace ::= WHITESPACE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("optional_whitespace",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // optional_whitespace ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("optional_whitespace",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // quoted ::= singlequoted 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("quoted",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // quoted ::= doublequoted 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("quoted",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // quoted ::= backquoted 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("quoted",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // singlequoted ::= SINGLEQUOTE NON_NEWLINE_NON_SINGLE_QUOTE SINGLEQUOTE 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 args.add(s); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("singlequoted",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // backquoted ::= BACKQUOTE call BACKQUOTE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("backquoted",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // doublequoted ::= DOUBLEQUOTE backquoted_or_double_quote_content_kleene DOUBLEQUOTE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("doublequoted",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // backquoted_or_double_quote_content_kleene ::= backquoted_or_double_quote_content_kleene backquoted 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("backquoted_or_double_quote_content_kleene",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // backquoted_or_double_quote_content_kleene ::= backquoted_or_double_quote_content_kleene DOUBLEQUOTECONTENT 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 args.add(s); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("backquoted_or_double_quote_content_kleene",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // backquoted_or_double_quote_content_kleene ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("backquoted_or_double_quote_content_kleene",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}