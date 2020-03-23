package staff.management;

import staff.Employee;


public class Manager extends Employee {

    private String deptName;

    public Manager(String name,int ni,double salary,String deptName){
        super(name,ni,salary);
        this.deptName=deptName;

    }

    //getters
    public String getDeptName(){
        return this.deptName;
    }


}
