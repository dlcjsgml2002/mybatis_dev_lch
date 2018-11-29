show tables;
select * from courses;


select * from students;

select stud_id as studid, name, email, dob, phone
from students
where stud_id=1;

INSERT INTO students (stud_id, NAME, EMAIL, PHONE, DOB)
VALUES(4, 'dlcjsgml', 'dlcjsgml@naver.com', '010-2002-2002', '1993-10-12');

