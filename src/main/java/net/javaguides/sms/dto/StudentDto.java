package net.javaguides.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class StudentDto {
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
}
