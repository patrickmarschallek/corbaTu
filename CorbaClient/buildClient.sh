#!/bin/sh
DIR=$(pwd)
mkdir -p $DIR/bin/
javac -cp $JACORB_HOME/../lib/jacorb.jar:$JACORB_HOME/../lib/slf4j-api-1.6.4.jar:$JACORB_HOME/../lib/slf4j-jdk14-1.6.4.jar$DIR/bin -d $DIR/bin -sourcepath src $DIR/src/CorbaClient.java
javac -d $DIR/bin -sourcepath test -cp $DIR/lib/junit4-4.8.2.jar:$DIR/bin/ $DIR/test/CorbaClientTest.java
