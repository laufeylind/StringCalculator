#!/bin/bash
if [ ! -d classes ]; then
  mkdir classes
fi

#on linux
javac -classpath "classes:lib/junit-4.12.jar" src/test/is/ru/StringCalculator/*.java -d classes
#on windows
#javac -classpath "classes;lib\junit-4.12.jar" src/test/is/ru/StringCalculator/*.java -d classes