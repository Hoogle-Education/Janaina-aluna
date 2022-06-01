package utilities;

import java.util.Random;

public class StaffPositionGenerator {

  protected String[] positions = { "Recepcionist", "Cleaner", "Caretaker" };

  public StaffPositionGenerator() {
  }

  /**
   * Generates a random name using firstnames and surnames
   * 
   * @return the name as a String
   */
  public String getRandomPosition() {

    Random r = new Random();

    String position = this.positions[r.nextInt(positions.length)];

    return position;

  }

}