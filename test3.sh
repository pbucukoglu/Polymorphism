#!/bin/bash
javac *.java
java Test 3 > output3.txt
diff output3.txt output-test3.txt
