create database review;
use review;
create table student_info(
id int(20) not null unique primary key,
username varchar(50),
phonenumber varchar(15)
);
select*from student_info;
insert into student_info
value(55,"sandhiya",7604951322,"eie");
ALTER TABLE student_info MODIFY phonenumber VARCHAR(15);
alter table student_info rename column username To student_name;
alter table student_info add department varchar(18);
truncate table student_info;
drop table student_info;
update student_info set department ="cse" where id=55; 


