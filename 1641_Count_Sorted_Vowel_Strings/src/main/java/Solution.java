import java.util.HashSet;
import java.util.Set;

class Solution {
    private char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    public int countVowelStrings(int n) {
        Set<String> strings = new HashSet<>();

        for (int i = 0; i < vowels.length; i++) {
            backTrack(n, i, 1, String.valueOf(vowels[i]), strings);
        }
        return strings.size();
    }

    private void backTrack(int len, int index, int strLen, String str, Set<String> strings) {
        // System.out.println("str: " + str + ", strings: " + strings);
        if (strLen == len) {
            strings.add(str);
            return;
        }

        for (int i = index; i < vowels.length; i++) {
            String newStr = str + vowels[i];
            //if (strings.contains(newStr)) continue;
            if (vowels[index] - vowels[i] > 0) continue;
            backTrack(len, i, strLen + 1, newStr, strings);
        }
    }

}