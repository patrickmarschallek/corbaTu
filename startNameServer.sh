#!/bin/sh
PORT=900
if [ -n "$1" ]
then
	PORT=$1
fi
ns -DOAPort=$PORT
