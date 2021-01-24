import java.util.*;
import java.util.stream.Collectors;

class Solution {
    Map<Character, List<Character>> digitAlphabets;
    public Solution() {
        digitAlphabets = new HashMap<>();
        digitAlphabets.put('2', Arrays.asList('a', 'b', 'c'));
        digitAlphabets.put('3', Arrays.asList('d', 'e', 'f'));
        digitAlphabets.put('4', Arrays.asList('g', 'h', 'i'));
        digitAlphabets.put('5', Arrays.asList('j', 'k', 'l'));
        digitAlphabets.put('6', Arrays.asList('m', 'n', 'o'));
        digitAlphabets.put('7', Arrays.asList('p', 'q', 'r', 's'));
        digitAlphabets.put('8', Arrays.asList('t', 'u', 'v'));
        digitAlphabets.put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return Collections.emptyList();
        PriorityQueue<StringBuilder> combinations = new PriorityQueue<>((a, b) -> {
            if (a.length() != b.length()) return a.length() - b.length();
            return String.CASE_INSENSITIVE_ORDER.compare(a.toString(), b.toString());
        });
        for (Character ch : digitAlphabets.get(digits.charAt(0))) {
            combinations.offer(new StringBuilder(String.valueOf(ch)));
        }

        while (combinations.peek().length() < digits.length()) {
            StringBuilder sb = combinations.poll();
            List<Character> characters = digitAlphabets.get(digits.charAt(sb.length()));
            for (Character ch : characters) {
                StringBuilder stringBuilder = new StringBuilder(sb);
                stringBuilder.append(ch);
                combinations.offer(stringBuilder);
            }
        }

        return combinations.stream().map(sb -> sb.toString()).distinct().sorted().collect(Collectors.toList());
    }
}