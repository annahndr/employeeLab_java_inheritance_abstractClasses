package Staff;

public abstract class Employee {

    private String name;
    private String nationalInsurance;
    private int salary;

//    constructor
    public Employee (String name, String nationalInsurance, int salary){
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

//    methods cannot be tested as cannot create and object from an abstract class
//    add getters for all properties
    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name != null)
        this.name = name;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public int getSalary() {
        return salary;
    }

//    Add a method named raiseSalary with takes in a parameter of type double to increment the salary.
    public void raiseSalary(double raise){
        if(raise > 0) {
            this.salary *= raise;
        }
    }

//    Add a method called payBonus which returns 1% of the employees salary.
    public double payBonus(){
        return this.salary * 0.01;
    }


}
