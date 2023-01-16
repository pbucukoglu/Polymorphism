#!/bin/bash
javac *.java
java Test 5 > output5.txt
diff output5.txt output-test5.txt
