class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int difference = target - nums[i];
            if(numsMap.containsKey(difference)){
                return new int[]{numsMap.get(difference), i};
            }
            else{
                numsMap.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
