package kr.or.yi.mybatis_dev_lch;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
	
	@Test
	public void test06selectStudentByAllForResultMap() {
		log.debug("selectStudentByAllForResultMap()");
		List<Student> list = dao.selectStudentByAllForResultMap();
		Assert.assertNotNull(list);
	}
	
	@Test 
	public void test07selectStudentByAllForHashMap() {
		log.debug("selectStudentByAllForHashMap()");
		List<Map<String, Object>> list = dao.selectStudentByAllForHashMap();
		System.out.println("list.size() => " + list.size());
		for (int i = 0; i < list.size(); i++) {
			Map<String, Object> m = list.get(i);
			Iterator<String> it = m.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println("key = " + key + " value = " + m.get(key));
			}
		}
		for (Map<String, Object> m : list) {
			for (Entry<String, Object> e : m.entrySet()) {
				log.debug(String.format("\tkey(%s)-value(%s)", e.getKey(), e.getValue()));
			}
		}
	}
	
	@Test
	public void test08selectStudentByNoForResultMapExtends() {
		log.debug("selectStudentByNoForResultMapExtends()");
		Student searchStd = new Student();
		searchStd.setStudId(1);
		Student searchedStd = dao.selectStudentByNoForResultMapExtends(searchStd);
		Assert.assertNotNull(searchedStd);
	}
	
	@Test
	public void test09selectStudentByNoForResultMapExtends2() {
		log.debug("selectStudentByNoForResultMapExtends2()");
		Student searchedStd = dao.selectStudentByNoForResultMapExtends2(1);
		Assert.assertNotNull(searchedStd);
	}
}
