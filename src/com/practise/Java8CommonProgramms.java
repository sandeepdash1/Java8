package com.practise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CommonProgramms {

	public static void main(String[] args) {
		List<Student> studentList = Stream.of(
						new Student(1, "Alice", 20, "Female", "Computer Science", "New York", 1,
								Arrays.asList("1234567890", "alice@email.com")),
						new Student(2, "Bob", 21, "Male", "Mechanical", "Los Angeles", 2,
								Arrays.asList("2234567890", "bob@email.com")),
						new Student(3, "Charlie", 22, "Male", "Electrical", "Chicago", 3,
								Arrays.asList("3234567890", "charlie@email.com")),
						new Student(4, "Diana", 20, "Female", "Civil", "Houston", 4,
								Arrays.asList("4234567890", "diana@email.com")),
						new Student(5, "Ethan", 23, "Male", "Information Tech", "Phoenix", 5,
								Arrays.asList("5234567890", "ethan@email.com")),
						new Student(6, "Fiona", 21, "Female", "Electronics", "Phoenix", 6,
								Arrays.asList("6234567890", "fiona@email.com")),
						new Student(7, "George", 24, "Male", "Biotech", "San Antonio", 7,
								Arrays.asList("7234567890", "george@email.com")),
						new Student(8, "Hannah", 22, "Female", "Chemical", "San Diego", 8,
								Arrays.asList("8234567890", "hannah@email.com")),
						new Student(9, "Ian", 21, "Male", "Computer Science", "Phoenix", 9,
								Arrays.asList("9234567890", "ian@email.com")),
						new Student(10, "Jenny", 23, "Female", "Mechanical", "San Jose", 10,
								Arrays.asList("1034567890", "jenny@email.com")))
				.collect(Collectors.toList());

		// 1. find the list of student whose rank is in between 5 and 10

		List<Student> students = studentList.stream().filter(student -> student.getRank() > 5 && student.getRank() < 10)
				.collect(Collectors.toList());

		// System.out.println(students);

		// 2. Find the Students who stays in Phoenix and sort by their name.

		List<Student> studentsByCity = studentList.stream().filter(student -> student.getCity().equals("Phoenix"))
				.sorted(Comparator.comparing(Student::getFirstName,Comparator.reverseOrder())).collect(Collectors.toList());
		//System.out.println(studentsByCity);

		// 3. Find all the Dept Names

		List<String> deptNmaes = studentList.stream().map(Student :: getDept)
				.distinct() // used for unique result.
				.collect(Collectors.toList());
		//System.out.println(deptNmaes);

		//4. Find all the contact numbers

		List<String> contacts = studentList.stream()
				.flatMap(student -> student.getContacts().stream())
				.distinct()
				.collect(Collectors.toList());
		//System.out.println(contacts);

		/* so when you gor for one to one always use map and when you are going with one to many go with flat map */

		// 5. Fetch the student by Deptartment Name

		Map<String, List<Student>> studentMap = studentList.stream()
				.collect(Collectors.groupingBy(Student::getDept));
		//System.out.println(studentMap);
		/*i need count*/
		Map.Entry<String, Long> studentMapCount = studentList.stream()
				.collect(Collectors.groupingBy(Student::getDept,Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		//System.out.println(studentMapCount);

		//7. Find the average age of male and female students

		Map<String, Double> avgStudent = studentList.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
		//System.out.println(avgStudent);

		//7. Find the highest rank in each dept

		Map<String, Optional<Student>> stdMap = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))));
		//System.out.println(stdMap);

		//8. Find the Student who has second rank
		Student student = studentList.stream().sorted(Comparator.comparing(Student::getRank))
				.skip(1).findFirst().get();

		System.out.println(student);
	}
}
