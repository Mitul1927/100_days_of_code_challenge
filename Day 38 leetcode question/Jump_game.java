class Solution {
    public boolean canJump(int[] nums) {
        int currMaximum=0;
        int checker = 0;
        if(nums.length==1){
            return true;
        }
        for(int i =0;i<nums.length-1;i++){
            currMaximum= Math.max(currMaximum,nums[i]+i);
            if(checker ==i){
                checker = currMaximum;
            }
            if(currMaximum>=nums.length-1){
                return true;
            }
            if(nums[checker]==0 && i==checker){
                return false;
            }
        }
        return true;
    }
}
