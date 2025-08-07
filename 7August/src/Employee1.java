import java.util.ArrayList;
import java.util.List;

public class Employee1 {
    int id;
    String name;
    String department;
    List<Incentive>  empList = new ArrayList<>();
    int count = empList.size();

    public Employee1(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public List<Incentive> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Incentive> empList) {
        this.empList = empList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", empList=" + empList +
                ", count=" + count +
                '}';
    }
}
