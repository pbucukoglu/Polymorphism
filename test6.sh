#!/bin/bash
javac *.java
java Test 6 > output6.txt
diff output6.txt output-test6.txt
