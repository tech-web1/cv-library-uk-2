@Regression
Feature: Login Test
  As user I want to login into Cv library website

 @smoke
 Scenario Outline: verifyJobSearchResultUsingDifferentDataSet
   Given  I am on homepage
   When   I enter job title "<jTitle>"
   And    I enter location "<cityLocation>"
   And    I enter distance  "<distance>"
   And    I click on more search option link
   And    I enter salaryMin "<minSalary>"
   And    I enter salaryMax  "<maxSalary>"
   And    I select salary type "<sType>"
   And    I select job type  "<jobType>"
   And    I click on find job button
   Then   I should see the result message "<expected>"

   Examples:
   |jTitle |cityLocation|distance|minSalary|maxSalary|sType|jobType|expected|
   |Tester |Harrow      |up to 5 miles |30000|500000|Per annum| Permanent|Permanent Tester jobs in Harrow on the Hill|
   |Devloper|Coventry   |up to 10 miles|20000|550000|per annum| permanent|permanent Tester jobs in Coventry |
   |Analyst |London     |up to 2 miles |200  |400   |per week |Contract  |Analyst jobs in london            |
   |Project Assistance |Manchester|up to 1 mile |30|40|per hour|permannet |permanent Project Manager jobs  in Manchester|
   |Sales Executive    |Leeds     |up to 25 miles |250|350|per day |Temorary|Temorary sales Executive job in leeds      |
   