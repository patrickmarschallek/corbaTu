#!/bin/sh
mkdir -p ./bin/
javac -cp $JACORB_HOME/../lib/jacorb.jar:$JACORB_HOME/../lib/slf4j-api-1.6.4.jar:$JACORB_HOME/../lib/slf4j-jdk14-1.6.4.jar -d ./bin -sourcepath src ./src/CorbaClient.java
javac -d ./bin -sourcepath test -cp ./lib/junit4-4.8.2.jar:./bin/ ./test/CorbaClientTest.java
