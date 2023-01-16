#!/bin/bash
javac *.java
java Test 2 > output2.txt
diff output2.txt output-test2.txt
