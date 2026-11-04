class Solution {
    public int[] twoSum(int[] nums, int target) {
        var result = new HashMap<Integer, Integer>();
        for (var i = 0; i < nums.length; i++) {
            var complement = target - nums[i];
            if (result.containsKey(complement)) {
                return new int[]{result.get(complement), i};
            }
            result.put(nums[i], i);
        }
        return null;
    }
}
