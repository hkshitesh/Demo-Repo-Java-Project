package pkg1;

public class Calculator {
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public void diff(int a, int b)
	{
		System.out.println(a-b);
	}
	public void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		
		Calculator ob = new Calculator();
		ob.sum(10, 5);
		ob.diff(10, 5);
	}
}
