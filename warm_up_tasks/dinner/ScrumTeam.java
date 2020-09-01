package warm_up_tasks.dinner;

import java.util.ArrayList;
import java.util.Collections;

public class ScrumTeam {
    public ArrayList<Testers> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public void addTester(Testers tester){
        testers.add(tester);
        System.out.println(tester.name+" been added to testers team");
    }
    public void addTesters(Testers[]testers){
        Collections.addAll(this.testers,testers);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
        System.out.println(developer.name+" been added to testers team");
    }
    public void addDevelopers(Developer[]developers){
        Collections.addAll(this.developers,developers);
    }
    public void  removeTester(long employeeID){
        testers.removeIf(p -> employeeID == p.ID);
    }
    public void  removeDeveloper(long employeeID){
        developers.removeIf(p -> employeeID ==p.ID);
    }


}
