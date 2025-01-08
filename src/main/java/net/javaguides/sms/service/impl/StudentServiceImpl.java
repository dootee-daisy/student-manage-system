package net.javaguides.sms.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import net.javaguides.sms.dto.StudentDto;
import net.javaguides.sms.repository.StudentRepository;
import net.javaguides.sms.service.StudentService;
import net.javaguides.sms.service.mapper.StudentMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  private final StudentRepository studentRepository;

  public StudentServiceImpl(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Override
  public List<StudentDto> getAllStudents() {
    return studentRepository.findAll().stream().map(StudentMapper::mapToStudentDto).collect(
        Collectors.toList());
  }
}
