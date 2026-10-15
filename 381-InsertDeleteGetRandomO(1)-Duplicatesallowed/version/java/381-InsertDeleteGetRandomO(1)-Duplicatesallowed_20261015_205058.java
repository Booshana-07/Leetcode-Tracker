// Last updated: 10/15/2026, 8:50:58 PM
1
2import java.util.*;
3
4class RandomizedCollection {
5    ArrayList<Integer> list;
6    HashMap<Integer, HashSet<Integer>> map;
7    Random random;
8
9    public RandomizedCollection() {
10        list = new ArrayList<>();
11        map = new HashMap<>();
12        random = new Random();
13    }
14
15    public boolean insert(int val) {
16        boolean result = !map.containsKey(val);
17
18        map.putIfAbsent(val, new HashSet<>());
19        map.get(val).add(list.size());
20        list.add(val);
21
22        return result;
23    }
24
25    public boolean remove(int val) {
26        if (!map.containsKey(val) || map.get(val).isEmpty()) {
27            return false;
28        }
29
30        int index = map.get(val).iterator().next();
31        int lastIndex = list.size() - 1;
32        int lastVal = list.get(lastIndex);
33
34        map.get(val).remove(index);
35
36        if (index != lastIndex) {
37            list.set(index, lastVal);
38
39            map.get(lastVal).remove(lastIndex);
40            map.get(lastVal).add(index);
41        }
42
43        list.remove(lastIndex);
44
45        if (map.get(val).isEmpty()) {
46            map.remove(val);
47        }
48
49        return true;
50    }
51
52    public int getRandom() {
53        return list.get(random.nextInt(list.size()));
54    }
55}
56