package entities.staff;

import java.util.ArrayList;
import java.util.List;

import entities.swim.SwimmingGroup;
import utilities.CoachingPositionGenerator;

public class CoachingStaff extends ClubStaff {

  private CoachingPositionGenerator coachingGenrator = new CoachingPositionGenerator();

  private int qualificationLevel;
  private List <SwimmingGroup> groups;

  public CoachingStaff(){
    super();
    groups = new ArrayList<>();
    qualificationLevel = random.nextInt(5) + 1;
    this.position = (qualificationLevel == 5) ? 
                    "Head Coach" :
                    coachingGenrator.getRandomCoachPosition(); 
  }
  
  public List<SwimmingGroup> getGroups() {
		 return groups;
	 }

  public void addGroup(SwimmingGroup group){
    groups.add(group);
  }

  @Override
  public String toString() {
    String aux =  "CoachingStaff [" + "id= " + id 
            + ", name=" + name 
            + ", position=" + position 
            + ", qualificationLevel=" + qualificationLevel + "]";    
    return aux;
  }
  

}
