package utilities;

import java.util.Arrays;
import java.util.Random;

public class SwimmingGroupNameGenerator {
  
  protected String[] positions = { "Dolphin", "Seals", "Turtles" };
  private static int[] count;

  public SwimmingGroupNameGenerator() {
    count = new int[3];
    Arrays.fill(count, 1);
  }

  /**
   * Generates a random name using firstnames and surnames
   * 
   * @return the name as a String
   */

  Random r = new Random();

  public String getRandomName() {

    int value = r.nextInt(positions.length);
    String position = this.positions[value] + count[value++];
    
    return position;

  }
}
