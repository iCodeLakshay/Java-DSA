class PalindromicNumberPyramid{

	public static void makePattern(int rows)
	{		
		for(int i=1; i<rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			
			for(int j=1; j<((rows-i)*2)-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=i; j>=1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		makePattern(6);
	}
}

// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321