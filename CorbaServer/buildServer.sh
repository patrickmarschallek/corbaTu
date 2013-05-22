#!/bin/sh
DIR=$(pwd)
mkdir -p $DIR/bin/
javac -cp ../lib/*:$DIR/bin -d $DIR/bin -sourcepath src $DIR/src/CorbaServer.java
