class AlphabetInvertedRightTriangle{

	public static void makePattern(int rows)
	{	
		
		for(int i=1; i<=rows; i++)
		{
			char ch = 'A';
			for(int j=rows; j >= i; j--)
			{
				System.out.print(ch++);
			}
			
			System.out.println();
		}
	}
	public static void main(String args[]){
		makePattern(6);
	}
}

// ABCDEF
// ABCDE
// ABCD
// ABC
// AB
// A