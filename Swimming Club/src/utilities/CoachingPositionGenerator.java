package utilities;

import java.util.Random;

public class CoachingPositionGenerator {

  protected String[] positions = { "Assistant Coach", "Swim Teacher"};

  public CoachingPositionGenerator() {
  }

  /**
   * Generates a random name using firstnames and surnames
   * 
   * @return the name as a String
   */
  public String getRandomCoachPosition() {

    Random r = new Random();

    String position = this.positions[r.nextInt(positions.length)];

    return position;

  }

}