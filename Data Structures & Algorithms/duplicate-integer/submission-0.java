class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        for(int i : nums){
            if(!numsMap.containsKey(i)){
            numsMap.put(i,1);
            }else{
                return true;
            }
        }

        return false;
    }
}