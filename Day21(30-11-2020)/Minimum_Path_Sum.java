package day13;

public class Minimum_Path_Sum {
	public static int minPathSum(int[][] grid) {
		System.out.println(dfs(0,0,grid));
	    return dfs(0,0,grid);
	}
	 
	public static int dfs(int i, int j, int[][] grid){
	    if(i==grid.length-1 && j==grid[0].length-1){
	    	System.out.println(grid[i][j]);
	        return grid[i][j];
	    }
	 
	    if(i<grid.length-1 && j<grid[0].length-1){
	        int r1 = grid[i][j] + dfs(i+1, j, grid);
	        int r2 = grid[i][j] + dfs(i, j+1, grid);
	        System.out.println(Math.min(r1,r2));
	        return Math.min(r1,r2);
	    }
	 
	    if(i<grid.length-1){
	    	System.out.println(grid[i][j] + dfs(i+1, j, grid));
	        return grid[i][j] + dfs(i+1, j, grid);
	    }
	 
	    if(j<grid[0].length-1){
	    	System.out.println(grid[i][j] + dfs(i, j+1, grid));
	        return grid[i][j] + dfs(i, j+1, grid);
	    }
	 System.out.println(0);
	    return 0;
	}
	public static void main(String[] args) {
	int [] [] g = {{1,2,},{3,4}};
	minPathSum(g);
	}

}
