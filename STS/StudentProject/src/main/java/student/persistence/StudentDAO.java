package student.persistence;

import java.util.List;

import student.domain.*;
//영속성 관리 => 파일처리나 DB처리
//DAO : Data Access Object
public interface StudentDAO {
	
	public void create(StudentVO studentVO);
	
	public StudentVO selectById(String id);
	
	public void update(StudentVO studentVO);
	
	public void delete(String id);
	
	public List<StudentVO> selectAll();
}
