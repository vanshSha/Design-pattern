package com.basic.UML;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

public class AggregationEx {
    public static void main(String[] args) {

        Professor pro1 = new Professor("Dr Mac");
        Professor pro2 = new Professor("Dr Epic");

        List<Professor> professors = Arrays.asList(pro1, pro2);
        Department department = new Department("Computer Science", professors);

        department.showProfessor();

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Professor {

    private String name;

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Department {

    private String name;

    private List<Professor> professors;

    public void showProfessor(){
        System.out.println("Department " + name);
        for(Professor prof : professors){
            System.out.println(prof.getName());
        }
    }

}