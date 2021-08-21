package java8CodingProgramsPackage;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8ProgramToGroupEmployessByDeptNo {

	public static void main(String[] args) {
		
StudentDetails studentDetails1 = new StudentDetails(1, "mahendra" , 1  ,5000 ,"airoli");
StudentDetails studentDetails2 = new StudentDetails(1, "sahendra" , 1  ,15000 ,"viroli");
StudentDetails studentDetails3 = new StudentDetails(1, "dahendra" , 2  ,25000 ,"miroli");
StudentDetails studentDetails4 = new StudentDetails(1, "bahendra" , 2  ,35000 ,"diroli");
StudentDetails studentDetails5 = new StudentDetails(1, "zahendra" , 3  ,65000 ,"domiroli");

List <StudentDetails> studentList =new ArrayList<> ();
studentList.add(studentDetails1);
studentList.add(studentDetails2);
studentList.add(studentDetails3);
studentList.add(studentDetails4);
studentList.add(studentDetails5);
//to print the employee details based on the department

Map <Long ,List<StudentDetails>> map = studentList.stream().collect(Collectors.groupingBy((student)-> student.getDeptId(),Collectors.toList()));

System.out.println("the employee details based on the department are" + map);
Set<Entry<Long, List<StudentDetails>>> entries =  map.entrySet();
for( Entry<Long, List<StudentDetails>> entry : entries) {
	
	System.out.println("The employee details based on the department are" + entry.getKey() + "\t" +  entry.getValue());
	
}

//to print the employee count  based on the department
Map <Long , Long> map1 = studentList.stream().collect(Collectors.groupingBy((student)-> student.getDeptId(),Collectors.counting()));

Set <Entry<Long , Long>> entries1 =  map1.entrySet();
for( Entry<Long, Long> entry : entries1) {
	
	System.out.println("The employee count based on the department are" + "for Departmment Id =" +  entry.getKey() + "\t" +  entry.getValue());
	
}

//to print the maximum salary of an  employee  

Optional<StudentDetails> maxSalaryStudent = studentList.stream().max((e1 ,e2)-> (int)e1.getSalary() - (int)e2.getSalary());

System.out.println("The maximum salary of an  employee  is " + maxSalaryStudent.get().getName() + " " + maxSalaryStudent.get().getSalary());



//to print the minimum salary of an  employee  

Optional<StudentDetails> minSalaryStudent = studentList.stream().min((e1 ,e2)-> (int)e1.getSalary() - (int)e2.getSalary());

System.out.println("The minimum salary of an  employee  is " + minSalaryStudent.get().getName() + " " + minSalaryStudent.get().getSalary());



LocalDate localDate = LocalDate.now();
System.out.println( " " + localDate.getDayOfWeek() )   ;
Clock clock =  Clock.systemDefaultZone() ;
LocalDate localDate1 = LocalDate.now(clock);
System.out.println( " " + localDate1.getDayOfMonth() )   ;
ZoneId zoneId =  ZoneId.systemDefault();
LocalDate localDate2 = LocalDate.now(zoneId).plusDays(2);
System.out.println( " " + localDate2 )   ;

LocalDateTime localDate312 = LocalDateTime.now();
System.out.println( " " + localDate312 )   ;
System.out.println( " " + localDate2.isLeapYear() )   ;
LocalDate localDate3 = LocalDate.of(2021 ,07,31);
System.out.println( " " + localDate3.isLeapYear() )   ;

System.out.println( " " + Period.between(localDate, localDate2).getDays() )   ;

LocalDate localDate4 = LocalDate.parse("2021-07-31" );
System.out.println( " " + localDate4 )   ;

LocalTime localTime = LocalTime.now();
System.out.println( " " + localTime )   ;

Clock clock1 =  Clock.systemDefaultZone() ;
LocalTime localTime1 = LocalTime.now(clock1);
System.out.println( " " + localTime1 )   ;
ZoneId zoneId1 =  ZoneId.systemDefault();
LocalTime localTime2 = LocalTime.now(zoneId1);
System.out.println( " " + localTime2 )   ;

LocalTime localTime3 = LocalTime.of(23 ,07,31 ,900000);
System.out.println( " " + localTime3 )   ;

LocalTime localTime4 = LocalTime.parse("20:07:31.98");
System.out.println( " " + localTime4 )   ;

IntStream.range(2, 5).forEach((n)-> System.out.println(n));

IntStream.iterate(1, (i) -> i +1).filter((i) -> isPrime(i)).peek(System.out::println);
//.limit(10).forEach(System.out::println);

	}
private static boolean isPrime(int number) {
	
	return number >=1 && IntStream.range(2, number).noneMatch((n) -> number % 2== 0 );
	
}
	
}
