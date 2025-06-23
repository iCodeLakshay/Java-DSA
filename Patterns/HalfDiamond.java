class HalfDiamond{

	public static void makePattern(int rows){
		
		for(int i=0; i < rows; i++)
		{
			for(int j = 0; j <= i; j++)
				System.out.print("*");
			
			System.out.println();
		}
	
		for(int i=rows; i > 0; i--)
		{
			for(int j = i-1; j > 0; j--)
				System.out.print("*");
			
			System.out.println();
		}
		
	}

	public static void main(String args[]){
		makePattern(4);
	
	}
}
// Code for tilted pyramid star pattern

// *
// **
// ***
// ****
// ***
// **
// *