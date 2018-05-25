class Numbers
	{
		int No1 = 10;
		int No2 = 10;
		int Result;

		public int Addition()
		{
			Result = No1 + No2;
			//System.out.println("Addition Result : " + Result);
			return Result; //20
		}
	}
class Operations extends Numbers
	{
		int Sub;
		public void Subtraction()
		{
			Sub = Addition() - 5; //Sub = 20 - 5;
			System.out.println("Subtraction Result : " + Sub);
		}
	}
class SingleInheritanceAddition
	{
		public static void main(String[] args)
		{
			Operations op = new Operations();
			//op.Addition();
			System.out.println("Addition result : " + op.Addition());
			op.Subtraction();
		}
	}
