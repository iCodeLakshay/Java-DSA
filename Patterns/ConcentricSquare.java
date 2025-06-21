class ConcentricSquare{

	public static void makePattern(int n)
	{	
		int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
				int top = i;
				int left = j;
				int right = (2*n - 2) - j;
				int down = (2*n - 2) - i;
                int min = Math.min(Math.min(top, down), Math.min(left, right));
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
	}
	public static void main(String args[]){
		makePattern(4);
	}
}

// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4