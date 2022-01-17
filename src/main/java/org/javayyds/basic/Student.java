package org.javayyds.basic;

import lombok.Data;

@Data
public class Student implements Comparable<Student> {

    private int age;

    public Student(int age) {
        this.age = age;
    }

    /**
     * 重写比较逻辑
     * @param o
     * @return
     */
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}

class StudentCompare {

    public static void main(StringTest[] args) {
        Student s1 = new Student(10);
        Student s2 = new Student(28);
        System.out.println(s1.compareTo(s2));
    }
}
