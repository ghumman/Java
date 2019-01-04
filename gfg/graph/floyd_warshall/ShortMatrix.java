import java.util.*; 
import java.lang.*; 
import java.io.*; 


class ShortMatrix
{
	public static void main(String args[])
	{
		// Integer.MAX_VALUE 
		// Input
		    int graph[][] = { {0,   5,  Integer.MAX_VALUE, Integer.MAX_VALUE},
                    {Integer.MAX_VALUE,  0,  3,  Integer.MAX_VALUE},
                    {Integer.MAX_VALUE, Integer.MAX_VALUE, 0,   1},
                    {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0} };
		System.out.println("Value of input: ");
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<4; j++)
				System.out.print( graph[i][j] + "\t\t");
				
			System.out.println();
		}

		// see if you can go from one to another
		boolean[][] test = new boolean [4][4];
		Integer [][] dist = new Integer [4][4];
		System.out.println("After Processing");
		for (int i=0; i<4; i++)
			for (int j=0; j<4; j++)
				System.out.print(test[i][j] + "\t");
		System.out.println();

		for (int i=0; i<4; i++)
		{
			for (int j=0; j<4; j++)
			{
				if (i != j)
				{
					if (graph[i][j] != Integer.MAX_VALUE)
						test[i][j] = true;
						dist[i][j] = graph[i][j]
					else if (graph[i][j] == Integer.MAX_VALUE)
					{
						// how many values it has which are not zero not infinity
						// 2
						// go to index of first first element i.e. graph[j][j] has values or not
						for (int k=0; k<4; k++)
						{
							if ((graph[i][k] != 0) && (graph[i][k] !=Integer.MAX_VALUE))
								if (graph[k][j] != Integer.MAX_VALUE)
									test[i][j] = true;
 
						} 
					}
				}
			}
		}
		System.out.println("After Processing");
		for (int i=0; i<4; i++)
			for (int j=0; j<4; j++)
				System.out.print(test[i][j] + "\t");
		System.out.println();
	}

} 
