-- Last updated: 7/9/2026, 3:08:54 PM
# Write your MySQL query statement below
UPDATE Salary
SET sex =
CASE
    WHEN sex = 'm' THEN 'f'
    ELSE 'm'
END;