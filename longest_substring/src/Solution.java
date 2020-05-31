public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            int[] check = new int[128];
            for (int j = i; j < arr.length; j++) {
                if (check[arr[j]] == 1) {
                    if (count > max) {
                        max = count;
                    }
                    break;
                }
                check[arr[j]]++;
                count++;
            }
            if (count > max) {
                max = count;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int ret = lengthOfLongestSubstring("au");
        System.out.println(ret);
    }
}
