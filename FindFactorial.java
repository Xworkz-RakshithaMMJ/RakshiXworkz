class FindFactorial
{
	public static void main(String a[])
	{
	myFact(89);
	}
	static void myFact(double nm)
	{
		double fact=1;
		for(int i=1;i<=nm;i++)
		{
		fact=fact * i;
		
		//return fact;
		}
		System.out.println(fact);
	}
}