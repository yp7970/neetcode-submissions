class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> sFreqMap = strToMap(s);
        Map<Character,Integer> tFreqMap = strToMap(t);
        return sFreqMap.equals(tFreqMap);
        

    }

    public Map<Character,Integer> strToMap(String s){
        Map<Character,Integer> freqMap = new HashMap<>();
        for(char c : s.toCharArray()){
            if(freqMap.containsKey(c)){
                freqMap.put(c,freqMap.get(c)+1);
            }else{
                freqMap.put(c,1);
            }

        }
        return freqMap;
    }
}
