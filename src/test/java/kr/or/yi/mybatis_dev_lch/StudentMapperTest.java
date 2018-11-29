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
	private StudentMapper dao = new StudentMapperImpl();
	
	@Test
	public void test01selectStudentByNo() {
		log.debug("test01selectStudentByNo()");
		Student searchStd = new Student();
		searchStd.setStudId(1);
		
		Student searchedStd = dao.selectStudentByNo(searchStd);
		Assert.assertNotNull(searchedStd);
	}
	
	@Test
	public void test02selectStudentByAll() {
		log.debug("test02selectStudentByAll()");
		List<Student> list = dao.selectStudentByAll();
		Assert.assertNotNull(list);
	}
	
	@Test
	public void test03InsertStudent() {
		log.debug("test03InsertStudent()");
		Calendar newDate = GregorianCalendar.getInstance();
		Student student = new Student();
		student.setStudId(5);
		student.setName("이춰니");
		student.setEmail("hah@aha.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-0070-4444"));
		int res = dao.insertStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test04UpdateStudent() {
		log.debug("test03InsertStudent()");
		Calendar newDate = GregorianCalendar.getInstance();
		Student student = new Student();
		student.setStudId(4);
		student.setName("이춰니");
		student.setEmail("hah@aha.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-0070-4444"));
		int res = dao.updateStudent(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void test05DeleteStudent() {
		log.debug("test04DeleteStudent()");
		int deleteStudent = dao.deleteStudent(5);
		Assert.assertSame(1, deleteStudent);
	}
}
