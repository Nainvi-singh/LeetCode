# Write your MySQL query statement below
select Visits.customer_id, count(Visits.visit_id)as count_no_trans
from visits
left join Transactions on Visits.visit_id = Transactions.visit_id
WHERE Transactions.transaction_id IS NULL 
GROUP BY Visits.customer_id; 