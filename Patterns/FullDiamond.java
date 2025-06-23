class FullDiamond{

	public static void makePattern(int rows){
		
		for(int i=0; i < rows; i++)
		{
			for(int j = 0; j <= (rows-i-1); j++)
				System.out.print(" ");
			
			for(int k=0; k < (2 * i)+1; k++)
				System.out.print("*");
			
			System.out.println();
		}
	
		for(int i=0; i <= rows; i++)
		{
			for(int j = 0; j < i; j++)
				System.out.print(" ");
			
			for(int k=0; k < ((rows - i)*2)+1; k++)
				System.out.print("*");
			
			System.out.println();
		}
		
	}

	public static void main(String args[]){
		makePattern(4);
	
	}
}
// Code for this diamond pattern

    // *
   // ***
  // *****
 // *******
// *********
 // *******
  // *****
   // ***
    // *