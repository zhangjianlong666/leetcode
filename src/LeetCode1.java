/**
 * @作者 zjl
 * @题目描述 两数之和
 * @时间 2020-12-21
 **/

class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;

                }
            }
        }
        return res;
    }
}