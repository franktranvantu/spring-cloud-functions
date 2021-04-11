package com.franktran.springcloudfunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class CustomSupplier implements Supplier<StudentData> {

  @Override
  public StudentData get() {
    List<Student> students = Arrays.asList(
        new Student(1, "Frank", "frank@gmail.com"),
        new Student(2, "Henry", "henry@gmail.com"),
        new Student(3, "Bean", "bean@gmail.com")
    );
    StudentData studentData = new StudentData();
    studentData.setStudents(students);
    return studentData;
  }
}
