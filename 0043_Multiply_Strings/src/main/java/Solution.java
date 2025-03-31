class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int[] num1AsInt = convertStringToIntArray(num1);
        int[] num2AsInt = convertStringToIntArray(num2);
        return multiplyIntArray(num1AsInt, num2AsInt);
    }

    private int[] convertStringToIntArray(String num) {
        int len = num.length();
        int[] intArray = new int[len];
        for (int i = 0; i < len; i++) {
            intArray[len - (i + 1)] = num.charAt(i) - '0';
        }
        return intArray;
    }

    private String multiplyIntArray(int[] num1, int[] num2) {
        int[][] multiply = new int[num2.length][num1.length + num2.length];

        for (int i = 0; i < num2.length; i++) {
            int digit1 = num2[i];
            int carry = 0;
            for (int j = 0; j < num1.length; j++) {
                int digit2 = num1[j];
                int subMul = digit1 * digit2;
                multiply[i][j + i] = (subMul + carry) % 10;
                carry = (subMul + carry) / 10;
            }
            if (carry != 0) {
                multiply[i][num1.length + i] = carry;
            }
        }
        int[] result = new int[num1.length + num2.length];
        int carry = 0;
        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < num2.length; j++) {
                result[i] = result[i] + multiply[j][i];
            }
            int digit = result[i];
            result[i] = (digit + carry) % 10;
            carry = (digit + carry) / 10;
        }


        StringBuilder sb = new StringBuilder();
        boolean start = false;
        carry = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            if (!start && result[i] == 0) continue;
            start = true;
            if (result[i] > 9) {
                sb.append((result[i] % 10) + carry);
                carry = result[i] / 10;
            } else {
                sb.append(result[i] + carry);
                carry = 0;
            }

        }

        return sb.toString();
    }
}