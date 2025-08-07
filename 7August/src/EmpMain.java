import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public class EmpMain {
    public static void main(String[] args) {

        List<Employee1> empList = new ArrayList<>();
        empList.add(new Employee1(1, "Harshal","IT"));
        empList.add(new Employee1(2, "Venk","Account"));
        empList.add(new Employee1(3, "Harsh","IT"));

        List<Incentive> incentiveList = new ArrayList<>();
        incentiveList.add(new Incentive(1,"Lunch","IT"));
        incentiveList.add(new Incentive(2,"Medical","Account"));
        incentiveList.add(new Incentive(3, "Travel","IT"));


        List<Employee1> list = empList.stream()
                .map(emp -> {
                    if (emp.getDepartment().equals("IT")) {
                        emp.setEmpList(incentiveList.stream().filter(inc -> inc.getType().equals("IT")).toList());
                        emp.setCount(emp.getEmpList().size());
                    } else if (emp.getDepartment().equals("Account")) {
                        emp.setEmpList(incentiveList.stream().filter(inc -> inc.getType().equals("Account")).toList());
                        emp.setCount(emp.getEmpList().size());
                    }
                    return emp;
                }).toList();

        for(Employee1 emp: list)
        {
            System.out.println(emp);
        }
    }

}