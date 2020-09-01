package day48_Inheritance.EmployeeTask;

public class Developer extends Employee{
    public Developer(double salary,String name,long id,String jobTitle,char gender){
        setEmployee(salary,name,id,jobTitle,gender);
    }
    public void fixingBugs(){
        System.out.println(name+" fixing bugs");
    }
    public String toString(){
        return "Name: "+ name+ " Job Title: "+jobTitle+" ID: "+id+" salary: "+salary+" gender: "+gender;
    }
}
