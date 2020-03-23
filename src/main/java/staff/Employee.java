package staff;

public abstract class Employee {
    private String name;
    private int ni;
    private double salary;

    public Employee(String name,int ni,double salary){
        this.name=name;
        this.ni=ni;
        this.salary=salary;
    }

    //getters

    public String getName() {
        return name;
    }

    public int getNi() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }

    //methods

    public double raiseSalary(double increment){
        salary=salary*increment;
        return salary;
    }

    public double payBonus(){
        return salary*0.01;
    }

    public void setName(String newName){ //tested in Developer class
        String nextName=newName;
        if(nextName!=null){
            this.name=nextName;
        }
    }
}
