select customer_id,customer_name,address, phone_no 
from customer
where email_id is not null
order by customer_id