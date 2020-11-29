##Selenium Begin in Java
- STEP1: create maven proj
- STEP2: add dependency to pom
    - selenium-java
    - selenium-chrome-driver
    - selenium-firefox-driver
- STEP3: download webdriver to local
    - chromedriver:http://chromedriver.storage.googleapis.com/index.html
    - geckodriver:https://github.com/mozilla/geckodriver/releases
- STEP4: config PATH: add driver path
- STEP5: setProperty before use driver
    - System.setProperty("webdriver.chrome.driver", "C:/Software/Webdriver/chromedriver.exe");
    - System.setProperty("webdriver.gecko.driver", "C:/Software/Webdriver/geckodriver.exe");
    
    
- NOTED1: setProperty before use driver
- NOTED2: driver match version of  browser