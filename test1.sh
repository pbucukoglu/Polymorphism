#!/bin/bash
javac *.java
java Test 1 > output1.txt
diff output1.txt output-test1.txt
