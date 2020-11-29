Today we will learn
How to set priority for tests in TestNG

Sequence of execution when
When 2 or more tests have same priority
When a class has both prioritized and non-prioritized methods
When a class has no prioritized methods

helpful tips

Priority Parameter

@Test(priority=1)

What if two test methods have same priority
- Will run as per alphabetical order
- If No priority then alphabetical order

What if a class has both prioritised and non-prioritised methods
- First non-prioritised methods will be executed in alphabetical order