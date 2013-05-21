#!/bin/sh
BASEDIR=$(dirname $0)
echo $BASEDIR
DIR=$(pwd)
echo $DIR
mkdir -p $DIR/bin/
javac -cp $JACORB_HOME/../lib/jacorb.jar:$JACORB_HOME/../lib/slf4j-api-1.6.4.jar:$JACORB_HOME/../lib/slf4j-jdk14-1.6.4.jar -d $DIR/bin -sourcepath src $DIR/src/CorbaServer.java
