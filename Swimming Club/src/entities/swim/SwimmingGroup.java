package entities.swim;

import java.util.ArrayList;
import java.util.List;

import utilities.SwimmingGroupNameGenerator;
import utilities.WeekDayGenerator;

public class SwimmingGroup {
  
  private WeekDayGenerator dayGenerator = new WeekDayGenerator();
  private SwimmingGroupNameGenerator groupNameGenerator = new SwimmingGroupNameGenerator();

  private String groupName;
  private int numberOfSwimmers;
  private List<Swimmer> swimmers;
  private String trainDay;

  public SwimmingGroup(int numberOfSwimmers){
    this.groupName = groupNameGenerator.getRandomName();
    swimmers = new ArrayList<>(numberOfSwimmers);
    this.numberOfSwimmers = numberOfSwimmers;
    trainDay = dayGenerator.getRandomDay();     
    
    for(int i=0; i<numberOfSwimmers; i++) swimmers.add(new Swimmer()); 
  }

  public String getGroupName() {
    return groupName;
  }

  public int getNumberOfSwimmers() {
    return numberOfSwimmers;
  }

  public List<Swimmer> getSwimmers() {
    return swimmers;
  }

  public String getTrainDay() {
    return trainDay;
  }

  @Override
  public String toString() {
    String aux = "SwimmingGroup [groupName=" + groupName + ", numberOfSwimmers=" + numberOfSwimmers + ", trainDay=" + trainDay + "]\n";
    
    for(Swimmer swimmer : swimmers) aux += swimmer.toString() + "\n";
    
    return aux;    
  }


}
