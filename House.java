import java.util.ArrayList;


/* This is a stub for the House class */
/** 
   *  Builds a house
   *  @param residents People who live in the house
   * @param hasDiningRoom if there is a dining room in the house  
   */
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  private boolean hasElevator;


  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  public int nResidents(){
    return this.residents.size();
  }
/** 
   *  Updates the resident's list when someone moves in
   *  @param name resident's name
   *  @return the name of the resident that moved in the house  
   */
  public void moveIn(String name){
    this.residents.add(name);
  }

  //overloaded moveIn method
  public int moveIn(int name){ //Change type of parameter to int
    this.residents.add(name, address);
    return name;
  }

/** 
   *  Updates the resident's list when someone moves out
   *  @param name resident's name
   *  @return the name of resident who moved out 
   */
  public String moveOut(String name){
    this.residents.remove(name);
    return name;
  }

//overloaded moveOut method
  public int moveOut(int name){ //Change type of parameter to int
    this.residents.remove(name);
    return name;
  }
  
/** 
   *  Check if a person lives in the house
   *  @param person person who is being checked if their in the house
   *  @return T/F: is the person a resident of the house?  
   */
  public boolean isResident(String person){
    return (residents.contains(person));
  }

  public void showOptions(){
    super.showOptions(); 
    System.out.println("Available options at " + this.name + ":\n + moveIn() \n + moveOut() \n + isResident() \n");
}

  public void goToFloor(int floorNum){
    if (this.hasElevator == true){
      super.goToFloor(floorNum);
    }
  }

  public static void main(String[] args) {
    House Wilder = new House("Wilder House", "1 Mandelle Road Northampton, MA 01063", 4, true);
    System.out.println(Wilder);
  }

}
