package com.project.smis.dao;
import java.util.Map;
import com.project.smis.domain.Student;

public interface IStudentDAO {

	void add(Student student);
	void update(Student student);
	void delete(Long id);
	Map<Long,Student> select();
}
