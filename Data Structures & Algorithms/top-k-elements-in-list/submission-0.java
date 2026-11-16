class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            int value = map.getOrDefault(num,0) + 1;
            map.put(num,value);
        }
         return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                 .mapToInt(Map.Entry::getKey)
                 .sorted()
                 .toArray();
    }
}
