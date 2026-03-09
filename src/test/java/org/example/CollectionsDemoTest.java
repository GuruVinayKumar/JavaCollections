package org.example;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


public class CollectionsDemoTest {
    @Test
    void testStudentList() {
        List<Student> students = CollectionsDemo.manageStudentList();
        assertTrue(students.contains(new Student(1, "Alice")));
        assertFalse(students.contains(new Student(2, "Bob"))); // removed
    }

    @Test
    void testStudentSet() {
        Set<Student> students = CollectionsDemo.manageStudentSet();
        assertTrue(students.contains(new Student(1, "Alice")));
        assertFalse(students.contains(new Student(3, "Charlie"))); // removed
    }

    @Test
    void testStudentMap() {
        Map<Integer, Student> studentMap = CollectionsDemo.manageStudentMap();
        assertTrue(studentMap.containsKey(101));
        assertFalse(studentMap.containsKey(102));
    }
}
