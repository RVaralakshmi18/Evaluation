create table department(
department_id int primary key,
department_name varchar(30),
department_block_number int);

create table student(
student_id int primary key,
student_name varchar(30),
address varchar(40),
city varchar(30),
department_id int, 
foreign key (department_id) references department(department_id)
);

create table staffs(
staff_id int primary key,
staff_name varchar(30),
department_id int, 
 foreign key(department_id) references department(department_id)
)
create table mark (
value int,
subject_id int primary key,
student_id int,
 foreign key (student_id)references student(student_id),
 foreign key (subject_id)references Subjects(subject_id)
)
create table Subjects( 
subject_id int primary key,
subject_name varchar(30),
subject_code varchar(10),
staff_id int,
foreign key(staff_id) references staffs(staff_id)
)
