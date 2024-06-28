class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    // mark the ith row
                    matrix[i][0] = 0;
                    // mark the jth col
                    if(j != 0){
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }

        // Not considering the 1st row and 1st col at first
        // checking for 1 to n and 1 to m 
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][j] != 0){
                    // check for the row and col
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // checking for the first row
        // if the 1st element of the row is 0 entire row will be marked 0 
        if(matrix[0][0] == 0){
            for(int j = 0; j < m; j++){
                matrix[0][j] = 0;
            }
        }

        // checking for the first column
        if(col0 == 0){
            for(int i = 0; i < n; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
