package Staff.Management;


public class Director extends Manager {

    private int budget;

    public Director (String name, String nationalInsurance, int salary, String deptName, int budget){
        super(name, nationalInsurance, salary, deptName);
        this.budget = budget;
    }

    public int getBudget(){
        return this.budget;
    }

//    Override the payBonus in director to return 2% of their salary.
    public double payBonus(){
        return this.getSalary() * 0.02;
    }

}
