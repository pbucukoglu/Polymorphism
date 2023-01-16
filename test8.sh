#!/bin/bash
javac *.java
java Test 8 > output8.txt
diff output8.txt output-test8.txt
