







Selenium_java_project
Problem Statement:
To print the name as well as the price of the product(Titan wrist watch ) by applying few filters:
Display- Analogue
Brand Material- Leather,
Brands-Titan
Discounts- 25% or more:

Files and software required:

1.JDK

2.eclipse

3.selenium jar file

4.driver executable file

5.browser

6.apache poi jar file

Steps:

1.Download the driver executable files and selenium jar file 

2.Go to required driver(say f://) and unzip the file.

3.launch the eclipse through the unzipped folder.

4.Under existing package create two folders and name them as jar

5.copy paste the driver executable file in the package.

6.Expand jar folder and right click on the selenium jar file .Go to build path and select "add to build path"

7.click on add external jars button and add the jar files.


Automation Steps:

1.User will be deciding in which browser the application must be opened.

2.Navigate to "https://amazon.in".

3.Search for "wrist watches" in the search box and click enter.

4.Scrolling the window by (0,700) for the webelement analouge check box.

5.Created a actions class to perform mouse hover action.

6.moved to the webelement" analouge" and performed click action.

7.Scrolling the window by (0,400) for the webelement leather_check_box.

8.Moved to the webelement"leather" and performed click action.

9.Scrolling the window by (0,500) for the webelement discount.

10.Moved to the webelement"discount" and performed click action.

11.Scrolling the window by (0,400) for the element "See_More".

12.Moved to the "see_More" element and performed click action.

13.Scrolling the window by (0,1000) for the element "titan".

14.Moved to the "titan" element and performed click action.

15.Method to store the product_name and product_price into the excel sheet.


