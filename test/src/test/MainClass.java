package test;

public class MainClass {
	static int i = 1;
	
	static 
	{
		i = i-- + --i;
	}
	{	
		i = i++ - ++i;
	}
	
	int methodOfTest()
	{
		return i + i - i * i / i;
	}
}
