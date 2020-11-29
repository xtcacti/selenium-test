Syntax change in Selenium 4 - instead of
WebDriverWait wait = new WebDriverWait(driver, 10);
Use
WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(10)); 
Free Courses - https://automationstepbystep.com/
Today we will learn
1 Why we use waits in Selenium
2 What is implicit wait | Implementation
3 What is explicit wait | Implementation

Why we use waits

The elements load time on a web page can vary

Not all the elements are loaded at the same time

In applications developed using Ajax, Javascript etc, objects on web page may load at different time

To handle this, we need to use waits in Selenium

With the help of waits, we can enable the script to wait for sometime before throwing No Such Element exception

What is implicit wait

Is used to define a time (period) until when webdriver should wait before throwing No Such Element exception

Syntax : 
driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);

note:
By default it is set to 0
Implicit wait is applicable for the entire session of browser

What is explicit wait

Explicit waits can be set for specific elements

Can be set for a specific condition
E.g. wait until element is clickable

Syntax : 

WebDriverWait wait = new WebDriverWait(driver, 10);

WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abc")));

You can set an implicit wait for entire session and
Explicit wait for certain elements where you think it needs more time or you want to wait until some specific condition is try


--------------------------------------------------------------
Today we will learn
1 What is fluent wait
2 How to use fluent wait
Free Courses - https://automationstepbystep.com/

What is fluent wait
Fluent Wait - a class in Selenium api

When you want to:
apply wait to specific element
set max wait time period
set polling frequency
set to ignore specific exceptions

Syntax :
 
  Wait wait = new FluentWait(driver)
    .withTimeout(30, SECONDS)
    .pollingEvery(5, SECONDS)
    .ignoring(NoSuchElementException.class);

Syntax for Selenium 4:
Wait＜WebDriver＞ wait = new FluentWait＜WebDriver＞(driver)
                       .withTimeout(Duration.ofSeconds(30))
                       .pollingEvery(Duration.ofSeconds(5))
                       .ignoring(NoSuchElementException.class);

Why we use waits
The elements load time on a web page can vary

Not all the elements are loaded at the same time

In applications developed using Ajax, Javascript etc, objects on web page may load at different time

To handle this, we need to use waits in Selenium

With the help of waits, we can enable the script to wait for sometime before throwing No Such Element exception