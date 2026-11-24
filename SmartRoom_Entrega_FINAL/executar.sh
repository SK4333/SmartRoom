#!/bin/sh
set -e
mkdir -p out
find src -name "*.java" -print0 | xargs -0 javac -encoding UTF-8 -d out
echo
echo "Executando o SmartRoom..."
echo
java -cp out smartroom.Main
