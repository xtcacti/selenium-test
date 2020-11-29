Today we will learn
1 How to parameterize tests
2 How to run tests with parameters
3 How to make parameters Optional

helpful tips

@Parameters annotation can be placed on any method that already has following annotations

@Test
@Before/After
@Factory


@Parameters annotation can also be placed class constructor
In testng.xml you can put parameters under suite or test tag


If two parameters have the same name, it's the one defined in test that has precedence. 
This is convenient if you need to specify a parameter applicable to all your tests and override its value only for certain tests.