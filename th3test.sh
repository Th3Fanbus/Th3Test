#!/bin/bash
push() {
    cd bin
    jar cvf th3test.jar .
    cd ..
    mv bin/th3test.jar th3test.jar
    echo "Uploading to GitHub..."
    label="commit-"$(date +%Y-%m-%d_%H.%M.%S)"-push"
    git add . && git commit -m $label && git push origin master
    echo "Done."
}

loc=$(pwd)
cd $(dirname $(readlink -f "$0"))
$1
cd $loc

