// Last updated: 7/9/2026, 3:10:50 PM
import java.util.*;

class Solution {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        List<List<String>> ans = new ArrayList<>();

        Set<String> dict = new HashSet<>(wordList);

        if (!dict.contains(endWord))
            return ans;

        Map<String, List<String>> parent = new HashMap<>();

        Set<String> current = new HashSet<>();
        current.add(beginWord);

        boolean found = false;

        while (!current.isEmpty() && !found) {

            for (String word : current)
                dict.remove(word);

            Set<String> next = new HashSet<>();

            for (String word : current) {

                char[] arr = word.toCharArray();

                for (int i = 0; i < arr.length; i++) {

                    char old = arr[i];

                    for (char c = 'a'; c <= 'z'; c++) {

                        arr[i] = c;

                        String newWord = new String(arr);

                        if (!dict.contains(newWord))
                            continue;

                        next.add(newWord);

                        parent.computeIfAbsent(newWord, k -> new ArrayList<>()).add(word);

                        if (newWord.equals(endWord))
                            found = true;
                    }

                    arr[i] = old;
                }
            }

            current = next;
        }

        if (!found)
            return ans;

        List<String> path = new ArrayList<>();
        path.add(endWord);

        dfs(endWord, beginWord, parent, path, ans);

        return ans;
    }

    private void dfs(String word,
                     String beginWord,
                     Map<String, List<String>> parent,
                     List<String> path,
                     List<List<String>> ans) {

        if (word.equals(beginWord)) {

            List<String> temp = new ArrayList<>(path);
            Collections.reverse(temp);
            ans.add(temp);
            return;
        }

        if (!parent.containsKey(word))
            return;

        for (String p : parent.get(word)) {

            path.add(p);
            dfs(p, beginWord, parent, path, ans);
            path.remove(path.size() - 1);
        }
    }
}