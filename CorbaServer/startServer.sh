#!/bin/sh
java -Dorg.omg.CORBA.ORBClass=org.jacorb.orb.ORB \
     -Dorg.omg.CORBA.ORBSingletonClass=org.jacorb.orb.ORBSingleton \
 -cp ./bin:./lib/junit4-4.8.2.jar:./lib:$JACORB_HOME/../lib/jacorb.jar:$JACORB_HOME/../lib/slf4j-api-1.6.4.jar:$JACORB_HOME/../lib/slf4j-jdk14-1.6.4.jar CorbaServer
