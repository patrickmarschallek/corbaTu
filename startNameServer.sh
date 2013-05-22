#!/bin/sh
PORT=900
installPath="/opt/jacorb"
if [ -n "$1" ]
then
	installPath=$1
fi

if [ -n "$2" ]
then
	PORT=$2
fi

JACORB_HOME=$installPath/jacorb-3.2/bin/
export JACORB_HOME="$installPath/jacorb-3.2/bin"
export PATH="$JACORB_HOME:$PATH"

ns -DOAPort=$PORT
