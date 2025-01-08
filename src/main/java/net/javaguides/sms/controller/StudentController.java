package net.javaguides.sms.controller;

import java.util.List;
import net.javaguides.sms.dto.StudentDto;
import net.javaguides.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

  private StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/students")
  public String students(Model model) {
    List<StudentDto> studentDtos = studentService.getAllStudents();
    model.addAttribute("students", studentDtos);
    return "students";
  }
}
