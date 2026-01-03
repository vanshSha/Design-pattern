package com.basic.UML;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class AssociationEx {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Miss Neha");
        Student student = new Student("Vansh");

        teacher.teach(student);
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Teacher {

    private String name;

    public void teach(Student student) {
        System.out.println(name + "is teaching " + student.getName());
    }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {

    private String name;

}
