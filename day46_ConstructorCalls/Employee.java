package day46_ConstructorCalls;
/*
class Name: Employee
            instance variables:
                    name, jobTitle, ID, salary
            1st constructor: initialize the name of the employee
            2d constructor: initialize the name, jobTitle of the employee
                            (MUST apply constructor Call)
            3rd Constructor: initialize the name, jobTitle, ID of the employee
                            (MUST apply constructor Call)
            4th Constructor: initialize all the instance of the employee
                                (MUST apply constructor Call)
            Instance methods:
                toString()
 */

public class Employee {
    String name;
    String jobTitle;
    int ID;
    double salary;

    public  Employee (String name){
        this.name=name;//sets the name
    }

    public Employee(String name, String jobTitle){
        this(name); //calling previous constructor. MUST be in a first lane
        this.jobTitle=jobTitle; //sets the jobTitle
    }
    public  Employee(String name,String jobTitle, int ID){
        this(name,jobTitle); //calling previous constructor. MUST be in a first lane
        this.ID=ID; //sets the jobTitle
    }
    public Employee(String name, String jobTitle, int ID, double salary){
        this(name,jobTitle, ID); //calling previous constructor. MUST be in a first lane
        this.salary=salary; //sets the jobTitle
    }
    public String toString() {
        return "Name: " + name +
                "\nJob Title: " + jobTitle +
                "\nID: " + ID+
                "\nSalary: " + salary;
    }


}
