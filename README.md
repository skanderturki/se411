# Introduction
This repository contains source code in support of the SE411 course (software construction) at Prince Sultan University, department of Software Engineering.

# Technical requirements
## Eclipse for Java developers
https://www.eclipse.org/downloads/packages/

## JDK 23 minimum
https://jdk.java.net/

## JavaFX
https://jdk.java.net/javafx23/

# Installation

Install JavaFX SDK (for example in: c:\program files\java\)

Install the eclipse plugin from the eclipse Market Place (minimum version  3.8.0)

Add the JavaFX libraries as a User library in eclipse preferences
Add this line to the VMArguments of your run configuration in eclipse (replace the path with your own JavaFX installation path):
--module-path "C:\Program Files\Java\jdk-23.0.1\javafx-sdk-23.0.1\lib" --add-modules javafx.controls,javafx.fxml
