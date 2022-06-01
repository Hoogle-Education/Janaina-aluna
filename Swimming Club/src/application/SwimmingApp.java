package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.staff.ClubStaff;
import entities.staff.CoachingStaff;
import entities.swim.SwimmingGroup;

public class SwimmingApp {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    List<ClubStaff> staffs = new ArrayList<>();
    staffs.add( new ClubStaff() );
    staffs.add( new ClubStaff() );
    staffs.add( new ClubStaff() );
    staffs.add( new ClubStaff() );
    staffs.add( new CoachingStaff() );
    staffs.add( new CoachingStaff() );
    staffs.add( new CoachingStaff() );

    SwimmingGroup group1 = new SwimmingGroup(10);
    SwimmingGroup group2 = new SwimmingGroup(10);
    SwimmingGroup group3 = new SwimmingGroup(10);
    
    CoachingStaff coach = (CoachingStaff) staffs.get(4);
    coach.addGroup(group1);
    
    int option;
    do {
      menu();
      option = sc.nextInt();
      System.out.println();

      switch (option) {
        case 1:
          option1(staffs);
          break;
        case 2:
          option2(staffs);
          break;
      }

    } while(option != 0);

  }

  public static void menu(){
    System.out.print("\n------------------- MENU -------------------\n"
                     + "1 - to List all staffs\n"
                     + "2 - to List staffs in a particular category\n"
                     + "3 - to List all groups showing the coach and number of swimmers\n"
                     + "0 - to exit\n"
                     + "--------------------------------------------\n"
                     + "Insert your option: ");
  }

  public static void option1(List<ClubStaff> staffs){
    for(ClubStaff staff : staffs){
      if(staff instanceof CoachingStaff) System.out.println((CoachingStaff) staff);
      else System.out.println(staff);
    }
  }

  public static void option2(List<ClubStaff> staffs) {
	  for(ClubStaff staff : staffs) {
		  if(staff instanceof CoachingStaff) {
			  System.out.println(staff);
			  
			  for(SwimmingGroup group : ((CoachingStaff)staff).getGroups() ) {
				  System.out.println(group);
			  }
		  }
	  }
  }
  
}
