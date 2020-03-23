package staff.management;

public class Director extends Manager{

    private double budget;

    public Director(String name,int ni,double salary,String deptName,double budget){
        super(name,ni,salary,deptName);
        this.budget=budget;
    }

    //getters
    public double getBudget(){
        return this.budget;
    }

//    public double payBonus(){
//        return salary*0.02;
//    }

}
