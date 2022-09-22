select h.hostel_id,h.hostel_name,h.hostel_type from hostel_details h
join orders o 
on o.hostel_id=h.hostel_id and o.order_date  not between '2019-05-01' and '2019-05-31'