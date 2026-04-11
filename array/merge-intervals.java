class Solution {
    public int[][] merge(int[][] intervals) {
        
        // TC->O(N logN)
        // SC->O(N)

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        List<int[]> ans = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1 ;i<intervals.length ;i++){
            int s = intervals[i][0];
            int e = intervals[i][1];

            if(s <= end){
                // If overlap then change the end
                end = Math.max(end,e);
            }else{
                // No overlap add the previous interval and proceed
                ans.add(new int[]{start,end});
                start =s;
                end =e;
            }
        }
        // if the last intervals are not overlapping then add all remaning;
        ans.add(new int[]{start,end});

        return ans.toArray(new int[ans.size()][]);

    }
}