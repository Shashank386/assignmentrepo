How to Execute project

Prerequisite : 
Java Check :  Check Java is installed 
Execute below command
java -version

if command prompt java not found then please install java8 jdk from internet
once java is installed . Please configure JAVA_HOME environment variable

Maven Check : Check Maven is installed
Execute below command
mvn --version

if command prompt maven not found, Please install Maven and set M2_HOME and MAVEN_HOME environment variable

Execution Steps:

To run Testcase: 
mvn clean test -Dsurefire.suiteXmlFiles=runTests.xml

in case you want to add new word to test. please add words in dictionary.txt file. then add data in data provider