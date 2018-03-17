package com.js.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.js.comparable.Student;

public class ComparableTest {
	public static void main(String[] args) {
		Student[] students = new Student[4];
		students[0] = new Student(12, "john", "BTech", "Usa");
		students[1] = new Student(13, "Smith", "MA", "Austria");
		students[2] = new Student(9, "Mathew", "LLB", "Denmark");
		students[3] = new Student(3, "Riya", "Mtech", "UK");

		Arrays.sort(students);
		System.out.println(Arrays.toString(students));

	}

}
