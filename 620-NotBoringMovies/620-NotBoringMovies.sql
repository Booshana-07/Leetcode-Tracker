-- Last updated: 7/9/2026, 3:08:58 PM
# Write your MySQL query statement below
SELECT *
FROM Cinema
WHERE id % 2 = 1
AND description != 'boring'
ORDER BY rating DESC;