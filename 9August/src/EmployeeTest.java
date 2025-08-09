import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandrum", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

//        Question 1: Grouping Employees by City
        Map<String, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getCity));

        collect.forEach((city, employees) -> {
            System.out.println("City: " + city);
            employees.forEach(emp -> System.out.println(emp));
        });

//        Question 2: Grouping Employees by Age

        Map<Integer, List<Employee>> collect1 = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
        collect1.forEach((age, employees) -> {
            System.out.println("Age : " + age);
            employees.forEach(emp -> System.out.println(emp));
        });

//        Question 3: Finding the Count of Male and Female Employees

        Map<String, Long> collect2 = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect2);

//        Question 4: Printing Names of All Departments

        empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

//        Question 5: Printing Employee Details by Age Criteria

        empList.stream().filter(e -> e.getAge() > 28).forEach(System.out::println);

//        Question 6: Finding Maximum Age of Employee

        OptionalInt max = empList.stream().mapToInt(Employee::getAge).max();
        System.out.println(max);

//        Question 7: Printing Average Age of Male and Female Employees

        Map<String, Double> collect3 = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
        System.out.println(collect3);

//        Question 8: Printing the Number of Employees in Each Department

        Map<String, Long> collect4 = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
        System.out.println(collect4);

//        Question 9: Finding the Oldest Employee

        Optional<Employee> max1 = empList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        System.out.println(max1);

//        Question 10: Finding the Youngest Female Employee

        Optional<Employee> min = empList.stream().filter(e -> e.getGender().equals("F")).min(Comparator.comparingInt(Employee::getAge));
        System.out.println(min);

    }
}
