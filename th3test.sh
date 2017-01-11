#!/bin/bash
push() {
    cd bin
    jar cvf th3test.jar .
    cd ..
    echo "Uploading to GitHub..."
    git add . && git commit -m 'Pushing from local.' && git push origin master
    echo "Done."
}

loc=$(pwd)
cd $(dirname $(readlink -f "$0"))
$1
cd $loc

