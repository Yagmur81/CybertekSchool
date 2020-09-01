package warm_up_tasks.dinner;

public class Employee extends Person {

    public String jobTitle;
    public long ID;
    public double salary;

    public void setEmployeeInfo(String name, int age, char gender, String jobTitle, long ID, double salary ){
        setPersonInfo(name, age, gender);
        this.ID = ID;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    public void work(){
        System.out.println(name+" is working as "+jobTitle);
    }


}
