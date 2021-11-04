package com.epam.mjc;


import com.epam.mjc.exceptions.StudentNotFoundException;

public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws StudentNotFoundException {
    if(Student.getValueOf(studentID) != null)
    {
      return Student.getValueOf(studentID);
    }
    else {
      throw new StudentNotFoundException(studentID);
    }
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
      Student student = manager.find(IDs[i]);
      System.out.println("Student name " + student.getName());
    }

  }
}