package utilities;

import java.util.Random;

public class NameGenerator {

  protected String[] firstNames = { "Ken", "Tom", "Sally", "Pavel", "Priscilla", "Claudia", "Steffany" };

  protected String[] surnames = { "Murphy", "Silva", "Smith", "Jones", "Carvalho", "Ernst" };

  public NameGenerator() {

    // nothing here - deliberate

  }

  /**
   * Generates a random name using firstnames and surnames
   * 
   * @return the name as a String
   */
  public String getRandomName() {

    Random r = new Random();

    // pick a firstname and surname based on length of array
    String fname = this.firstNames[r.nextInt(firstNames.length)];
    String sname = this.surnames[r.nextInt(surnames.length)];

    return (fname + " " + sname);

  }

}