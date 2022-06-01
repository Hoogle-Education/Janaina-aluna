package entities.swim;

import java.util.Random;

import utilities.NameGenerator;

public class Swimmer {
  
  private NameGenerator nameGenerator = new NameGenerator();
  Random random = new Random();
  
  private String name;
  private int age;
  
  public Swimmer() {
    this.name = nameGenerator.getRandomName();
    this.age = random.nextInt(50) + 5;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Swimmer [age=" + age + ", name=" + name + "]";
  }

}
