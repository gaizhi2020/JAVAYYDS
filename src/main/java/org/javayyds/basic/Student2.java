package org.javayyds.basic;

import lombok.Data;

import java.util.Comparator;

@Data
public class Student2 {

    private int age;

    public Student2(int age) {
        this.age = age;
    }
}

class BijiaoXuesheng implements Comparator<Student2> {

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getAge() - o2.getAge();
    }
}

class StudentCompare2 {

    public static void main(StringTest[] args) {
        Student2 s1 = new Student2(10);
        Student2 s2 = new Student2(28);
        Comparator comparator = new BijiaoXuesheng();
        System.out.println(comparator.compare(s1, s2));
    }
}
