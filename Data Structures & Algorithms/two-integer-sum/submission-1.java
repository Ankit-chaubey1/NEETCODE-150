class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force approach
       /* int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                  return new int[]{i,j};
                }
            }
        }
        return new int[]{};*/
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];
            if(map.containsKey(res)){
                return new int[]{map.get(res),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
