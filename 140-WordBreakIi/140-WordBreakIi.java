// Last updated: 7/9/2026, 3:10:44 PM
import java.util.*;

class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {
        return dfs(s, new HashSet<>(wordDict), new HashMap<>());
    }

    private List<String> dfs(String s, Set<String> dict,
                             Map<String, List<String>> memo) {

        if (memo.containsKey(s))
            return memo.get(s);

        List<String> result = new ArrayList<>();

        if (s.length() == 0) {
            result.add("");
            return result;
        }

        for (String word : dict) {

            if (s.startsWith(word)) {

                List<String> list =
                        dfs(s.substring(word.length()), dict, memo);

                for (String str : list) {

                    result.add(word +
                            (str.equals("") ? "" : " " + str));
                }
            }
        }

        memo.put(s, result);

        return result;
    }
}