public class Employee {
    int id;
    String name;
    String department;
    Incentive incentive;

    public Employee(int id, String name, String department, Incentive incentive) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.incentive = incentive;
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

    public Incentive getIncentive() {
        return incentive;
    }

    public void setIncentive(Incentive incentive) {
        this.incentive = incentive;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", incentive=" + incentive +
                '}';
    }
}
