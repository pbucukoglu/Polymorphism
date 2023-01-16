#!/bin/bash
javac *.java
java Test 4 > output4.txt
diff output4.txt output-test4.txt
