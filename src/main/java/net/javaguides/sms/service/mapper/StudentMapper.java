package net.javaguides.sms.service.mapper;

import net.javaguides.sms.dto.StudentDto;
import net.javaguides.sms.model.Student;

public class StudentMapper {
  public static StudentDto mapToStudentDto(Student student) {
    return new StudentDto(
        student.getId(),
        student.getFirstName(),
        student.getLastName(),
        student.getEmail()
    );
  }

  public static Student mapToStudent(StudentDto studentDto) {
    return new Student(
        studentDto.getId(),
        studentDto.getFirstName(),
        studentDto.getLastName(),
        studentDto.getEmail()
    );
  }
}
