class matrix_multiply
{
	public static void main(String args[])
	{
		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int res[][] = new int [3][3];
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				a[i][j] = i+j;
				b[i][j] = i+j;
			}
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				for(int k=0; k<a.length; k++)
				{
					sum += a[i][k]*b[k][j];
				}
				res[i][j] = sum;
				sum = 0;
			}
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
}