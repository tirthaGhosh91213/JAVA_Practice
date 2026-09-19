class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxCount = 0;
        int answer = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                answer = num;
            }
        }

        return answer;
    }
}