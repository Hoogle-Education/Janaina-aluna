package entities.staff;

import java.util.Random;

import utilities.NameGenerator;
import utilities.StaffPositionGenerator;

public class ClubStaff {

  // unique number generator
  protected static boolean[] usedNumbers = new boolean[10000];

  // random generators
  protected Random random = new Random();
  private NameGenerator nameGenerator = new NameGenerator();
  private StaffPositionGenerator positionGenerator = new StaffPositionGenerator();

  // atributes
  protected int id;
  protected String name;
  protected String position;

  public ClubStaff(){
    int id;
    do {
      id = random.nextInt(10000);
    } while(usedNumbers[id] != false);

    this.id = id;
    position = positionGenerator.getRandomPosition();
    name = nameGenerator.getRandomName();
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "ClubStaff [id=" + id + ", name=" + name + ", position=" + position + "]";
  }



}
