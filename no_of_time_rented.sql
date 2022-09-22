-- Inserted the data twice to get more records
select car_id, count(car_id) as NO_OF_TRIPS
from rentals
order by car_id 