#!/bin/bash
javac *.java
java Test 7 > output7.txt
diff output7.txt output-test7.txt
