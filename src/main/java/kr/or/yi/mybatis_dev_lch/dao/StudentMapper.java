package kr.or.yi.mybatis_dev_lch.dao;

import java.util.List;

import kr.or.yi.mybatis_dev_lch.dto.Student;

public interface StudentMapper {
	Student selectStudentByNo(Student student);

	List<Student> selectStudentByAll();
	
	int insertStudent(Student student);
	
	int deleteStudent(int studId);
	
	int updateStudent(Student student);
}
