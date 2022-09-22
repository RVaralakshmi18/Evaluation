select customer_id,customer_name,phone_no, 
case
	when address =NULL then (select email, case when email =NULL then 'NA' else (select email from customer) from customer)
end as contact_details
from customer

