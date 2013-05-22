#!/bin/sh
DIR=$(pwd)
mkdir -p $DIR/bin/
javac -cp ../lib/*:$DIR/bin -d $DIR/bin -sourcepath src $DIR/src/CorbaClient.java
javac -cp ../lib/*:$DIR/bin -d $DIR/bin -sourcepath test $DIR/test/CorbaClientTest.java
