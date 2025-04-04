import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int[] kArray = convertIntToArray(k);
        return addArrays(num, kArray);
    }

    private int[] convertIntToArray(int k) {
        // 1이상 10000 이하의 정수를 받아서 배열로 변환
        int n = 5;
        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = k % 10;
            k /= 10;
        }
        return result;
    }

    private List<Integer> addArrays(int[] num, int[] kArray) {
        int n = num.length;
        int m = kArray.length;
        int maxLength = Math.max(n, m);
        int[] result = new int[maxLength + 1];

        int carry = 0;
        for (int i = 0; i < result.length; i++) {
            int numValue = num.length -1 - i >= 0 ? num[num.length -1 - i] : 0;
            int kValue = kArray.length -1 - i >= 0 ? kArray[kArray.length -1 - i] : 0;
            int sum = numValue + kValue + carry;
            result[result.length -1 - i] = sum % 10;
            carry = sum / 10;
        }

        LinkedList<Integer> resultList = new LinkedList<>();
        boolean start = false;
        for (int i = 0; i < result.length; i++) {
            if (start) {
                resultList.addLast(result[i]);
            } else if (result[i] != 0) {
                start = true;
                resultList.addLast(result[i]);
            }
        }
        return resultList;

        
    }
}