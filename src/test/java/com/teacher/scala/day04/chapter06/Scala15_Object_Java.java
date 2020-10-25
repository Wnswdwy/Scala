package com.teacher.scala.day04.chapter06;

public class Scala15_Object_Java {
    public static void main(String[] args) {

        final Class<Student> studentClass = Student.class;
    }
    class Student {
        public int id;
        @Override
        public boolean equals(Object obj) {
            if ( obj instanceof Student ) {
                Student otherStudent = (Student)obj;
                return otherStudent.id == this.id;
            } else {
                return false;
            }
        }
    }
}
