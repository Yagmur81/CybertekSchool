package day48_Inheritance.EmployeeTask;

public class Employee {
    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    public void setEmployee(double salary, String name, long id, String jobTitle, char gender) {
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }


    public String toString() {
        return "Name: "+ name+ " Job Title: "+jobTitle+" ID: "+id+" salary: "+salary+" gender: "+gender;
    }
}
