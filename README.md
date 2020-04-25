# This testing framework is intended to perform a search for a product in www.amazon.com.mx

1.-In order to run this framework, first you need to clone into you computer using GIT.

2.-Once it's cloned in your computer run as maven project with the following commands "clean install -f pom.xml":

In IntelliJ go to Run/Edit Configurations/ click on "+" Select Maven,
then chose a name and put the command line mentioned above
 "clean install -f pom.xml" without parenthesis.

 --------------------------------------------------------------------------------------------------------------------
**Framework Details**

You can see the steps to execute in the following .feature file "src\main\resources\features\"

Within SearchForItem_Switch.feature you can edit the parameters  to change the test execution
I.E in the statement:

    -When I enter "Nintendo Switch console" as search criteria

I can change Nintendo switch console for X Box console and now the test would search for a X Box.

    -When I enter "X Box console" as search criteria

Now this test procedure is going to search for a x box console

To check the execution reports go to target/surefire-reports search for:
index.html or emailable-report.html and open in any web browser

