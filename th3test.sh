#!/bin/bash
push() {
    cd bin
    jar cvf th3test.jar .
    cd ..
    mv bin/th3test.jar th3test.jar
    echo "Uploading to GitHub..."
    git add . && git commit -m 'Pushing from local.' && git push origin master
    echo "Done."
}

loc=$(pwd)
cd $(dirname $(readlink -f "$0"))
$1
cd $loc

