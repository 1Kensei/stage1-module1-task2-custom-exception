package com.epam.mjc.exceptions;

public class StudentNotFoundException  extends IllegalArgumentException{

    public StudentNotFoundException(long id){
        super(String.format("Could not find student with ID %d", id));
    }
}
