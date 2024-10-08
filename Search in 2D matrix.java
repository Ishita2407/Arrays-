class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        // 2 pointers low and high
        int low = 0, high = n * m -1;

        while(low <= high){
            int mid = (low + high)/2;
            int row = mid / m;
            int col = mid % m;

            // eliminate halves based on idx mid
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                // eliminate left half
                low = mid + 1;
            }else{
                // eliminate right half
                high = mid - 1;
            }
        }
        return false;
    }
}
