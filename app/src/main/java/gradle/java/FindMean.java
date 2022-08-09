package gradle.java;


public class FindMean {
    public static int findmean(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }
}
