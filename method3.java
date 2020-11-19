class FindGreatestNumber
	{
		public static void main(String a[])
		{
			int finalValue=maxOfTwoNumber(420,840);
			System.out.println(finalValue);
		}
		static int maxOfTwoNumber(int firstNumber,int secondNumber)
		{
			if(firstNumber > secondNumber)
				return firstNumber;
			else
				return secondNumber;
		}
}
