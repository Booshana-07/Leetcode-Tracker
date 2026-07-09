-- Last updated: 7/9/2026, 3:10:15 PM
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;