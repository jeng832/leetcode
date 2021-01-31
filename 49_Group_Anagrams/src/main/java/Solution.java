import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            String base = str.chars().mapToObj(ch -> (char) ch).sorted().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
            if (anagramMap.containsKey(base)) {
                anagramMap.get(base).add(str);
            } else {
                anagramMap.put(base, new ArrayList<>(Collections.singletonList(str)));
            }
        }

        return anagramMap.keySet().stream().map(anagramMap::get).collect(Collectors.toList());
    }
}