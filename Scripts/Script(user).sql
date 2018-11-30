show tables;
select * from courses;


select * from students;

select stud_id as studid, name, email, dob, phone
from students
where stud_id=1;

INSERT INTO students (stud_id, NAME, EMAIL, PHONE, DOB)
VALUES(4, 'dlcjsgml', 'dlcjsgml@naver.com', '010-2002-2002', '1993-10-12');

select stud_id as studid, name, email, dob, phone, s.ADDR_ID as addrId, STREET, CITY, STATE, ZIP, COUNTRY
from students as s join addresses as a on s.ADDR_ID = a.ADDR_ID
where stud_id = 1;