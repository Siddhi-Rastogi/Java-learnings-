public class Kunalfindinmountainarr {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 2, 1};
        int target = 4;

        int peak = findPeak(nums);

        int firstTry = orderAgnosticBS(nums, target, 0, peak);
        if (firstTry != -1) {
            System.out.println(firstTry);
        } else {
            System.out.println(orderAgnosticBS(nums, target, peak + 1, nums.length - 1));
        }
    }

    // Find peak index
    static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; // peak index
    }

    // Order Agnostic Binary Search
    static int orderAgnosticBS(int[] nums, int target, int start, int end) {

        boolean isAsc = nums[start] < nums[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
