package utilities;

import java.util.Random;

public class WeekDayGenerator {
  
  String[] weekdays = {"Sunday", "Monday", "Tuesday",
       "Wednesday", "Thursday", "Friday", "Saturday"};
  /**
   * Generates a random name using firstnames and surnames
   * 
   * @return the name as a String
   */
  public String getRandomDay() {

    Random r = new Random();

    // pick a firstname and surname based on length of array
    String day = this.weekdays[r.nextInt(weekdays.length)];
    return day;

  }


}
