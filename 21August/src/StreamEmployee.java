import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEmployee {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice", "IT","M"));
        list.add(new Employee("Bob", "HR","M"));
        list.add(new Employee("Charlie", "IT","F"));
        list.add(new Employee("Harshal", "IT","M"));
        list.add(new Employee("Happy", "IT","F"));
        list.add(new Employee("XYZ", "HR","F"));
        list.add(new Employee("ABC", "HR","M"));

        Map<String, List<Employee>> collect = list.stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        Map<String, Long> collect1 = list.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

        Map<String, Map<String, Long>> genderCountPerDept = list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.counting()
                        )
                ));

        System.out.println(collect);
        System.out.println(collect1);
        System.out.println(genderCountPerDept);

    }
}
