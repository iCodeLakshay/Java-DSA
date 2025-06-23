class HollowSquare{

	public static void makePattern(int rows)
	{	
		for(int i=1; i<=rows; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int x = 1; x<=rows-2; x++){
			for(int j=1; j<=rows; j++){
				if(j == 1 || j == rows)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1; i<=rows; i++)
		{
			System.out.print("*");
		}
	}
	public static void main(String args[]){
		makePattern(10);
	}
}

// **********
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// **********