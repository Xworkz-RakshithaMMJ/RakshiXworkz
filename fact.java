class Fact
{
	public static void main(String a[])
	{
		int f=myFact(3);
		int g=myFact(2);
		int r=myFact(1);
		int finalOutput = f/(g*r);
		System.out.println(finalOutput);
		double total = FinalAvg.avg(23.4,24.6,21.7);
		System.out.println(total);
	}
	static int myFact(int nm)
	{
		int fact=1;
		for(int i=1;i<=nm;i++)
		{
		fact=fact * i;
		

		}
		return fact;
	}
}