package warm_up_tasks.dinner;

public class Developer extends Employee {

    public void setInfo(String name, int age, char gender, String jobTitle, long ID, double salary){
        setEmployeeInfo(name, age, gender, jobTitle, ID, salary);
    }
    public void coding(){
        System.out.println(name + " is coding");
    }
    public void fixBug(){
        System.out.println(name+" fixing bugs");
    }
    public String toString(){
        return "Name of Employee: "+name +", Job title: "+jobTitle+", age: "+age+", gender: "+gender+"\nID: "+ID+", salary: "+salary+"$";
    }

}
