package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String nationaInsurance, int salary, String deptName){
        super(name, nationaInsurance, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
