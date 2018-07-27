package student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import student.domain.StudentVO;
import student.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String listAll(Model model) {
		List<StudentVO> students = studentService.getStudents();
		model.addAttribute("students", students);
		
		return "student/list";
	}
	
	@RequestMapping(value="register", method=RequestMethod.GET)
	public String registerGet() {
		return "student/register";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String registerGet(StudentVO studentVO) {
		studentService.registStudent(studentVO);
		
		return "redirect:/student/list";
	}
	
	@RequestMapping(value="read", method=RequestMethod.GET)
	public String read(@RequestParam("id") String id, Model model)
	{
		StudentVO studentVO = studentService.getStudent(id);
		model.addAttribute("student", studentVO);
		
		return "student/read";
		
	}
}
