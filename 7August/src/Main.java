import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Harshal","IT",null));
        empList.add(new Employee(2, "Venk","Account",null));
        empList.add(new Employee(3, "Harsh","IT",null));

        List<Incentive> incentiveList = new ArrayList<>();
        incentiveList.add(new Incentive(1,"Lunch","IT"));
        incentiveList.add(new Incentive(2,"Medical","Account"));


        List<Employee> list = empList.stream()
                .map(emp -> {
                    if (emp.getDepartment().equals("IT")) {
                        emp.setIncentive(incentiveList.stream().filter(inc -> inc.getType().equals("IT")).findFirst().orElse(null));
                    } else if (emp.getDepartment().equals("Account")) {
                        emp.setIncentive(incentiveList.stream().filter(inc -> inc.getType().equals("Account")).findFirst().orElse(null));
                    }

                    return emp;
                }).toList();

        for(Employee emp: list)
        {
            System.out.println(emp);
        }
    }

}