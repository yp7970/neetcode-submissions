class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int i :nums){
                freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }

        for(int i=0;i<buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }

        int[] result = new int[k];
        int idx = 0;
        for(int i = buckets.length-1;i >=0 && idx<k;i--){
            for(int num :buckets[i]){
                result[idx++] = num;
                if(idx == k) break;
            }
        }
        return result;
    }
}
