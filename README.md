# JDI Light project template - parallel execution
Template for running tests based on JDI framework in a multy-threaded mode
To run new UI test automation just download and open this project
Powered by [JDI Light](https://github.com/jdi-testing/jdi-light) and Selenium

# Instruction:
1. Download template and unpack in an appropriate folder

2. Open project in an IDE of your choice (for example IntelliJIdea)

3. To run demo test just use "mvn clean install" command
http://pix.my/o/fkSH1s?1547398376
or run via IDE by click on "example" folder in src/test and select "Run tests"
http://pix.my/o/SJtkya?1547398292

4. Logs: Check test execution results in the Console log
http://pix.my/o/CEtiOQ?1547398216

5. Reporting: After running tests copy paste **allure-results** folder into the target folder. Run **allure:serve** in maven plugins
http://pix.my/o/5KPsyr?1547398089

6. Use as a template for your own project: 
* just remove all content from **src/main/.../example** folder, add your Page Objects
* replace tests in **src/test/.../example** folder with your tests

7. TestNg Retry and before after listeners: You can also modify retrying tests rules (now it is set as 1 retry for each test) and actions before/after all tests (now it prints out test name and result) in the **org.mytests.tests.testng** folder
