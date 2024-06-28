class Solution {
    public List<List<Integer>> generate(int numRows) {

        // creating an arraylist to store the result
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        // Base case
        if(numRows <= 0) return result;

        // creating an arraylist prev to store the prev sum
        ArrayList<Integer> prev = new ArrayList<>();
        prev.add(1);
        result.add(prev);

        // iterating through rest of the elements and storing result in a curr array
        for(int i = 2; i<= numRows; i++){
            ArrayList<Integer> curr = new ArrayList<Integer>();
            curr.add(1); // first
            for(int j = 0; j < prev.size() - 1; j++){
                curr.add(prev.get(j) + prev.get(j + 1)); // middle
            }  
            curr.add(1); // last
            result.add(curr);
            prev = curr;
        }
        return result;
    }
}


SOlution 2
  class Solution {
    public List<List<Integer>> generate(int numRows) {

        // creating an arraylist to store the result
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        // Base case
        if(numRows <= 0) return result;

        // creating an arraylist prev to store the prev sum
        ArrayList<Integer> prev = new ArrayList<>();
        prev.add(1);
        result.add(prev);

        // iterating through rest of the elements and storing result in a curr array
        for(int i = 2; i<= numRows; i++){
            ArrayList<Integer> curr = new ArrayList<Integer>();
            curr.add(1); // first
            for(int j = 0; j < prev.size() - 1; j++){
                curr.add(prev.get(j) + prev.get(j + 1)); // middle
            }  
            curr.add(1); // last
            result.add(curr);
            prev = curr;
        }
        return result;
    }
}
