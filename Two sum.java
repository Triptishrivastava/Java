class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp=target-nums[i];
                if(nums[j]==temp){
                    return new int[] {i,j};
                 }
            
             }
         }  
        return null;
        
     }
}