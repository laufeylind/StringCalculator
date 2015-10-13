
#!/bin/bash
if [ ! -d classes ]; then 
  mkdir classes 
fi
javac src/main/is/ru/StringCalculator/*.java -d classes