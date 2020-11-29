learn from Raghav - headless browser

Today we will learn01:
-------------------------------
1. What are Headless Browsers
2. Why should we use Headless Browsers
3. When should we NOT use Headless Browsers
4. Examples of Headless Browsers

helpful tips

Html Unit browser
PhantomJS
TrifleJS
SlimmerJS
ZombieJS

References:
Headless Browsers list - https://gist.github.com/evandrix/3694955
Xvfb wikipedia - https://en.wikipedia.org/wiki/Xvfb
Xvfb Jenkins Plugin - https://wiki.jenkins-ci.org/display/J...
Stack Overflow - http://stackoverflow.com/questions/31...


Today we will learn02:
-------------------------------
1. What is HtmlUnit Driver

2. How to run test with HtmlUnit Driver

HtmlUnitDriver driver = new HtmlUnitDriver();
driver.get("http://seleniumhq.org/"); 

3. How to emulate other browsers

 HtmlUnitDriver driver = new HtmlUnitDriver ( BrowserVersion.CHROME );

_______________________________________________________________

Helpful Tips:
-------------------
How to confirm and validate that your test ran on some specific browser

WebClient webClient = (WebClient) get(driver, "webClient");

private static Object get(Object object, String field) throws Exception {
  Field f = object.getClass().getDeclaredField(field);
  f.setAccessible(true);
  return f.get(object);
 }