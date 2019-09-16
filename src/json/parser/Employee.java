package json.parser;

public class Employee {

    private String empEmail;
    private String empName;
    private String salary;
    private String department;

    public Employee() {
    }

    public static void main(String[] args) {

    }

    public Employee(String empEmail, String empName, String salary, String department) {
        this.empEmail = empEmail;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    public String getEmpEmail() {
        String email = "khoyer@.......";
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpName() {
        String name = "khoyer";
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSalary() {
        String salary = "$8000";
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        String Department = "30-34,56st";
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;

    }
}









/*public Employee(String empEmail, String empName, String salary, String department) {
        this.empEmail = empEmail;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}*/
