@echo off
chcp 65001 >nul
if not exist out mkdir out
javac -encoding UTF-8 -d out designbook\chapter4\Deck.java designbook\solutions4\Exercise09.java && java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -cp out designbook.solutions4.Exercise09