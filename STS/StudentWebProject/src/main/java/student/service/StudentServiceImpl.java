package student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.domain.StudentVO;
import student.persistence.StudentDAO;

@Service
//StudentService실제 구현 클래스
//StudentDAO에 의존함
public class StudentServiceImpl implements StudentService {

	private StudentDAO studentDAO;
	
	//생성자를 이용한 StudentDAO주입
	//DI : Dependency Injection(의존성주입)
	@Autowired
	public StudentServiceImpl(StudentDAO studentDAO) {
		super();
		this.studentDAO = studentDAO;
	}

	@Override
	public void registStudent(StudentVO studentVO) {
		// TODO Auto-generated method stub
		StudentVO student = studentDAO.selectById(studentVO.getId());
		
		//새로 등록하려는 학생이 이미 데이터베이스에 존재할 경우
		if(student!=null) {
			throw new AlreadyExistingStudentException();
		}
		
		//DAO를 이용해 studentVO내용을 DB에 저장
		//즉 studentDAO에게 위임
		studentDAO.create(studentVO);
	}

	@Override
	public StudentVO getStudent(String id) {
		// TODO Auto-generated method stub
		
		StudentVO student = studentDAO.selectById(id);
		if(student==null){
			throw new StudentNotFoundException();
		}
		return student;
	}

	@Override
	public void changeStudent(StudentVO studentVO) {
		// TODO Auto-generated method stub
		StudentVO student= studentDAO.selectById(studentVO.getId());
		
		if(student==null) {
			throw new StudentNotFoundException();
		}
		//studentDAO에게 DB처리 위임
		studentDAO.update(studentVO);
	}

	@Override
	public void removeStudent(String id) {
		// TODO Auto-generated method stub
		StudentVO student= studentDAO.selectById(id);
		
		if(student==null) {
			throw new StudentNotFoundException();
		}
		studentDAO.delete(id);
	}

	@Override
	public List<StudentVO> getStudents() {
		// TODO Auto-generated method stub
		return studentDAO.selectAll();
	}

}
