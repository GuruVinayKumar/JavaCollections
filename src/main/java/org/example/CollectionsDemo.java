package org.example;

import java.util.*;

public class CollectionsDemo {
    public static List<Student> manageStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Charlie"));
        students.add(new Student(1, "Alice")); // duplicates allowed

        students.remove(new Student(2, "Bob")); // remove by object
        return students;
    }

    public static Set<Student> manageStudentSet() {
        Set<Student> students = new HashSet<>();
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Charlie"));
        students.add(new Student(1, "Alice")); // duplicate ignored

        students.remove(new Student(3, "Charlie"));
        return students;
    }

    public static Map<Integer, Student> manageStudentMap() {
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(101, new Student(1, "Alice"));
        studentMap.put(102, new Student(2, "Bob"));
        studentMap.put(103, new Student(3, "Charlie"));

        studentMap.remove(102);
        return studentMap;
    }

    public static void main(String[] args) {
        System.out.println("Student List: " + manageStudentList());
        System.out.println("Student Set: " + manageStudentSet());
        System.out.println("Student Map: " + manageStudentMap());
    }
}
