Space optimized Dynamic programming
class Solution {
    public int uniquePaths(int m, int n) {
        // Space optimized dynamic programming solution
        
        int prev[] = new int[n];

        for(int i = 0; i < m; i++){
            int temp[] = new int[n];
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0){
                    temp[j] = 1;
                    continue;
                }
                int up = 0;
                int left = 0;
                if(i > 0) up = prev[j];
                if(j > 0) left = temp[j - 1];

                temp[j] = up + left;
            }
            prev = temp;
        }
        return prev[n - 1];
    }
}


Solution 2
  class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i==0||j==0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = grid[i][j-1] + grid[i-1][j];
            }
        }
        return grid[m-1][n-1];
    }
}
