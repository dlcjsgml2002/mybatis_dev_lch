show tables;
select * from courses;

select * from students;

insert into students (stud_id, name, email, phone, dob)
values(5, '이쫘니', 'yohoho@naver.com', '010-8282-6969', '2018-11-30');

select stud_id, name, email, phone, dob from students where stud_id = 2;