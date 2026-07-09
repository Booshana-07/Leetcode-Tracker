-- Last updated: 7/9/2026, 3:08:29 PM
# Write your MySQL query statement below
SELECT 
    ROUND(
        100 * AVG(order_date = customer_pref_delivery_date),
        2
    ) AS immediate_percentage
FROM Delivery
WHERE (customer_id, order_date) IN (
    SELECT customer_id, MIN(order_date)
    FROM Delivery
    GROUP BY customer_id
);