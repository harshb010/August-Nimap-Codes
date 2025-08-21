public class Employee {
    String name;
    String dept;
    String gender;

    public Employee(String name, String dept, String gender) {
        this.name = name;
        this.dept = dept;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' ;
    }
}
