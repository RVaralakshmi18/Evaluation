create table user
( user_id int primary key,
name varchar(20),
address varchar(100),
phno int,
emailid varchar(30)
)

create table booking 
(
bid int primary key,
acc_no int,
name varchar(10),
user_id int,
foreign key (user_id) references user(user_id)
)
alter table user 
modify phno bigint

insert into user (user_id,name,address,phno,emailid)
values(1001,'Adam','Chennai',8988998991,'ada@gmail.com'),
(1002,'Eve','Mangalore',1234567890,'eve@yahoo.com'),
(1003,'John','Mumbai',9087654321,'Jo@gmail.com'),
(1004,'Peter','Hyderabad',7867545343,'Peter@yahoo.co.in')

insert into booking (bid,acc_no,name,user_id)
values(1,12312334,'HDFC',1001),
(2,23444434,'SBI',1001),
(3,54556444,'IOB',1002),
(4,45434234,'BOI',1003)

select u.name,u.address from user u
join booking b
on b.name <>'HDFC'