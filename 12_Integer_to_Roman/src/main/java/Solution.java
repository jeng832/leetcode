class Solution {
    char[][] ch = {{'I', 'V'}, {'X', 'L'}, {'C', 'D'}, {'M'}};

    private String getRoman(int num, int numAt) {
        numAt--;
        StringBuilder sb = new StringBuilder();
        switch (num) {
            case 1:
            case 2:
            case 3:
                for (int i = 0; i < num; i++) {
                    sb.append(ch[numAt][0]);
                }
                break;
            case 4:
                sb.append(ch[numAt][0]).append(ch[numAt][1]);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                sb.append(ch[numAt][1]);
                for (int i = 0; i < num - 5; i++) {
                    sb.append(ch[numAt][0]);
                }
                break;
            case 9:
                sb.append(ch[numAt][0]).append(ch[numAt + 1][0]);
                break;
            default:
                break;
        }
        return sb.toString();
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        char[] arrNum = String.valueOf(num).toCharArray();

        for (int i = 0; i < arrNum.length; i++) {
            int n = arrNum[i] - '0';
            sb.append(getRoman(n, arrNum.length - i));
        }

        return sb.toString();
    }
}