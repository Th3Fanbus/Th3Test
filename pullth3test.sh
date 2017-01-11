#!/bin/bash
loc=$(pwd)
cd $(dirname $(readlink -f "$0"))
cd bin
jar cvf th3test.jar .
cd ..
git add . && git commit -m 'Pushing from local...' && git push origin master
cd $loc
