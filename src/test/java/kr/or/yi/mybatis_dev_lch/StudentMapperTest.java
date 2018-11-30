package kr.or.yi.mybatis_dev_lch;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.mybatis_dev_lch.dao.StudentMapper;
import kr.or.yi.mybatis_dev_lch.dao.StudentMapperImpl;
import kr.or.yi.mybatis_dev_lch.dto.PhoneNumber;
import kr.or.yi.mybatis_dev_lch.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentMapperTest extends AbstractTest {
	private static StudentMapper dao = new StudentMapperImpl();

	@Test
	public void test01selectStudentById() {
		log.debug("selectStudentById()");
		Student newStd = new Student();
		newStd.setStudId(2);

		Student searchStd = dao.selectStudentById(newStd);
		Assert.assertEquals(newStd.getStudId(), searchStd.getStudId());
	}

	@Test
	public void test02selectStudentByAll() {
		log.debug("selectStudentByAll()");
		List<Student> lists = dao.selectStudentByAll();
		Assert.assertNotNull(lists);
	}

	@Test
	public void test03insertStudent() {
		log.debug("updateStudent()");
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1993, 10, 12);

		Student student = new Student();
		student.setStudId(5);
		student.setName("이춰니");
		student.setEmail("chunee@gmail.com");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-0070-6969"));

		int res = dao.insertStudent(student);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test04updateStudent() {
		log.debug("insertStudent()");
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(2022, 2, 22);

		Student student = new Student(5, "이쫘니", "zzani@nate.com", new PhoneNumber("010-2020-0022"), newDate.getTime());

		int res = dao.insertStudent(student);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test05deleteStudent() {
		log.debug("deleteStudent()");
		int res = dao.deleteStudent(5);
		Assert.assertEquals(1, res);
	}
}
