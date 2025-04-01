public class Solution {

    public String addBinary(String a, String b) {
        int size = Math.max(a.length(), b.length());
        int[] aArr = convertBinary(a, size);
        int[] bArr = convertBinary(b, size);
        
        int[] result = new int[size];
        int carry = 0;
        for (int i = size - 1; i >= 0; i--) {
            int sum = aArr[i] + bArr[i] + carry;
            result[i] = sum % 2;
            carry = sum / 2;
        }
        if (carry == 0) {
            return convertArrayToString(result);
        }
        return carry + convertArrayToString(result);
    }

    private int[] convertBinary(String binary, int size) {
        int[] binaryArr = new int[size];
        for (int i = 0; i < binary.length(); i++) {
            binaryArr[binaryArr.length - 1 - i] = binary.charAt(binary.length() - 1 - i) - '0';

        }
        return binaryArr;
    }

    private String convertArrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        return sb.toString();
    }
}