package com.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CountingTheFrequencyOfThCharacters {

	public static void main(String[] args) {

		String name = "iamawesome";
	
		Map<Character,Integer> map = new LinkedHashMap<> () ;
		char ch[] = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if (map.containsKey(ch[i])) {
				
				map.put(ch[i], map.get(ch[i]) +1) ;
				
			}
			else {
				
			map.put(ch[i], 1) ;
			}
		}
		System.out.println(map);
	map.entrySet();
System.out.println(map.entrySet());
Set<Map.Entry<Character, Integer>> set = map.entrySet();
for (Iterator iterator = set.iterator(); iterator.hasNext();) {
	Entry<Character, Integer> entry = (Entry<Character, Integer>) iterator.next();
	System.out.println(entry);
	
}
for (Map.Entry m : set ) {
	
	System.out.println(   ( m.getKey()) + " " + m.getValue()) ;
}

	

ArrayList<Integer> a = new ArrayList();
a.add(123);
a.add(23);
a.add(24);
a.add(25);
a.add(26);
a.add(27);
List<Integer> z = a.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
System.out.println( z);

System.out.println( "------------------------------------------------------------------ ------");
Collections.sort(a);
for (Iterator iterator = a.iterator(); iterator.hasNext();) {
	Integer integer = (Integer) iterator.next();
	System.out.println(integer);
	
}
// By Stream Method

a.stream().sorted().forEach((j)-> System.out.println(j));
ArrayList<Student> student = new ArrayList();
Student s1 = new Student(1, "mahendra") ;
Student s2 = new Student(2, "shahendra") ;
Student s3 = new Student(57, "vijhendra") ;

Student s4 = new Student(4, "zahendra") ;
Student s5 = new Student(5, "ahendra") ;
Student s6 = new Student(6, "cahendra") ;

student.add(s1);
student.add(s2);
student.add(s3);
student.add(s4);
student.add(s5);
student.add(s6);

Collections.sort(student,(c,d)->   c.getId()-d.getId());
for (Iterator iterator = student.iterator(); iterator.hasNext();) {
	Student integer = (Student) iterator.next();
	System.out.println(integer);
	
} 


 List<Student>student2 = student.stream().sorted(Comparator.comparing((s)->s.getName())).collect(Collectors.toList());

 System.out.println(student2);
 
 Set<Integer> m = new HashSet();
	m.add(123);
	m.add(23);
	m.add(24);
	m.add(25);
	m.add(26);
	m.add(27);
	
	System.out.println("Hi Hello By Bye");
	System.out.println(m.stream().sorted().collect(Collectors.toSet()));
	//System.out.println(m);
	
	
	
	
	Set<Student> student4 = new TreeSet();
	List<Student> student5 = new ArrayList(student4) ;
	
	List<Student> student7 = student.stream().sorted(Comparator.comparing((s)->s.getName())).collect(Collectors.toList());
	
	System.out.println(student7);
	Student s7 = new Student(1, "mahendra") ;
	Student s8 = new Student(2, "shahendra") ;
	Student s9 = new Student(57, "vijhendra") ;

	Student s10 = new Student(4, "zahendra") ;
	Student s11 = new Student(5, "ahendra") ;
	Student s12 = new Student(6, "cahendra") ;

	student4.add(s1);
	student4.add(s2);
	student4.add(s3);
	student4.add(s4);
	student4.add(s5);
	student4.add(s6);
	System.out.println(student4);
	
	Map<Student ,Integer> map4 = new HashMap<> ();
	map4.put( new Student(1, "mahendra"), 1);
	map4.put( new Student(2, "tahendra"), 2);
	map4.put( new Student(77, "aahendra"), 3);
	map4.put( new Student(890, "bahendra"), 4);
	map4.put( new Student(88, "cahendra"), 5);
	map4.put( new Student(9, "dahendra"), 6);
	
	
//map4.entrySet().stream().sorted(Map.Entry.<Student ,Integer>comparingByKey()).forEach((mj)-> System.out.println(mj.getKey() + " "+ mj.getValue()));
System.out.println(map4.entrySet().stream().sorted(Map.Entry.<Student ,Integer>comparingByKey(Comparator.comparing(Student::getId).reversed())).collect(Collectors.toMap((n)-> n.getKey() , (n)-> n.getValue())));
System.out.println (map4.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId).reversed())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(n1 ,n2) -> n1, LinkedHashMap:: new))) ;
map4.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId).reversed())).collect(Collectors.toMap((n3)-> n3.getKey(),(n3) -> n3.getValue(),(n5 ,n6) -> n5, LinkedHashMap:: new));

	}
}

