select s.student_name from student s
join department d
on d.department_id=s.department_id and s.city='Coimbatore'
 order by s.student_name