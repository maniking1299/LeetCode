class NumArray {

    // TC->O(log N)
    // SC->O(log N)
    
    int[] nums;
    static int[] tree;

    public NumArray(int[] nums) {
        this.nums = nums;
        tree = new int[nums.length * 4];
        buildSegmentTree(nums, 0, 0, nums.length - 1);
    }

    public void update(int index, int val) {
        int diff = val - nums[index];
        nums[index] = val;
        update(0, 0, nums.length - 1, index, diff);
    }

    public int sumRange(int left, int right) {
        return getSum(0,0,nums.length-1,left,right);
    }

// Helper to make Segement tree.
    public void buildSegmentTree(int[] nums, int treeIdx, int si, int ei) {
        if (si == ei) {
            tree[treeIdx] = nums[si];
            return;
        }

        int mid = si + (ei - si) / 2;

        buildSegmentTree(nums, 2 * treeIdx + 1, si, mid);
        buildSegmentTree(nums, 2 * treeIdx + 2, mid + 1, ei);

        tree[treeIdx] = tree[2 * treeIdx + 1] + tree[2 * treeIdx + 2];

    }
// Helper to update the value in segment tree.
    static void update(int treeIdx, int si, int ei, int pos, int diff) {
        if (si > pos || ei < pos) {
            return;
        }

        tree[treeIdx] += diff;

        if (si != ei) {
            int mid = si + (ei - si) / 2;

            update(2 * treeIdx + 1, si, mid, pos, diff);
            update(2 * treeIdx + 2, mid + 1, ei, pos, diff);
        }

    }
// Helper to get sum in range from l to r 
    static int getSum(int treeIdx , int si ,int ei , int l , int r){

        // Total Overlap
        if(l<=si && r>=ei){
            return tree[treeIdx];
        }

        // No overlap
        if(ei<l || si>r ){
            return 0;
        }

        // Partial overLap

        int mid = si+(ei-si)/2;
        return getSum(2*treeIdx+1,si,mid,l,r)+getSum(2*treeIdx+2,mid+1,ei,l,r);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */