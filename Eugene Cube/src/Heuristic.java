import java.util.*;

public class Heuristic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getHeuristicValue();

	}
	
	static void getHeuristicValue()
	{
		int size = 3;
		ArrayList<Integer[]> solutionY = new ArrayList<Integer[]>();
		int max = size*size;
		int[][] solution = {
				new int[]{1,2,3},
				new int[]{4,5,6},
				new int[]{7,8,0}
		};		
		int[][] current = {
				new int[]{8,7,6},
				new int[]{4,5,3},
				new int[]{2,1,0}
		};

		solutionY.add(new Integer[] {size-1,size-1});
		for(int i=0;i<current.length;i++)
		{
			for(int j=0;j<current[i].length;j++)
			{
				solutionY.add(new Integer[] {i,j});
			}
		}
		solutionY.remove(max);
		
		for(int i =0;i<solutionY.size();i++)
		{
			System.out.println("[" + i + "]:" + solutionY.get(i)[0] + ", " + solutionY.get(i)[1]);
		}
		
		for(int i=0;i<solution.length;i++)
		{
			for(int j=0;j<solution[i].length;j++)
			{
				if(current[i][j]==solution[i][j])
				{
					//correct place
				} else
				{
					//incorrect place
					int im = 0;
					int jm = 0;
					
					
				}
			}
		}
	}

}
