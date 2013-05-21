#!/bin/sh
if [ -n "$1" ] 
then
	sh startNameServer.sh $1 &
fi
cd CorbaServer
sh ./buildServer.sh
sh ./startServer.sh &
cd ../CorbaClient
echo $(pwd)
sh ./buildClient.sh
sh ./startClient.sh 1
sh ./startClient.sh 1 b
sh ./startClient.sh 1 c
sh ./startClient.sh 1 d
sh ./testClient.sh
cd ..
