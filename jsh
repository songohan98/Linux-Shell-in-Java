#!/bin/bash

JSH_ROOT="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

JSH_JAR="$JSH_ROOT/target/jsh-1.0-SNAPSHOT.jar"

if [ ! -f "$JSH_JAR" ]; then
    ( cd "$JSH_ROOT" && mvn package ) || exit 1
fi

java -cp "$JSH_JAR":/jsh/lib/java-cup-11b-runtime.jar:/workspaces/jsh-team-14/lib/java-cup-11b-runtime.jar uk.ac.ucl.jsh.Jsh "$@"