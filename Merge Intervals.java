class Solution {
    public int[][] merge(int[][] intervals) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
        // find the min and max value among all the intervals
		for (int i = 0; i < intervals.length; i++) {
			min = Math.min(min, intervals[i][0]);
			max = Math.max(max, intervals[i][0]);
		}
		
        // calculate range 
		int[] range = new int[max - min + 1];
		for (int i = 0; i < intervals.length; i++) {
          //  For each interval, updates the corresponding entry in the range array with the maximum end value among overlapping intervals.
			range[intervals[i][0] - min] = Math.max(intervals[i][1] - min, range[intervals[i][0] - min]); 
		}
		
		int start = 0, end = 0;
		LinkedList<int[]> result = new LinkedList<>();
		for (int i = 0; i < range.length; i++) {
			if (range[i] == 0) {  // empty interval
				continue;
			}
			if (i <= end) { // start <= end :  interval can be merged
				end = Math.max(range[i], end); // update the end of interval
			} else {
                // add current merged interval in the result
				result.add(new int[] {start + min, end + min});
				start = i;
				end = range[i];
			}
		}
        // add the last merged interval
		result.add(new int[] {start + min, end + min});
		return result.toArray(new int[result.size()][]);
	}
}
