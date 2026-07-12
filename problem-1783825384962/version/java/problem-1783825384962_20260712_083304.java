// Last updated: 7/12/2026, 8:33:04 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        String[] start = startTime.split(":");
4        String[] end = endTime.split(":");
5        int s1 = Integer.parseInt(start[0]) * 3600 + Integer.parseInt(start[1]) * 60 + Integer.parseInt(start[2]);
6        int s2 = Integer.parseInt(end[0]) * 3600 + Integer.parseInt(end[1]) * 60 + Integer.parseInt(end[2]);
7        return s2-s1;
8    }
9}