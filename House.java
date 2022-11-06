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
  

  public House(ArrayList<String> residents, boolean hasDiningRoom) {
    super(residents, hasDiningRoom);
    residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  public boolean getHasDiningRoom(){
    return this.hasDiningRoom;
  }

  public ArrayList<String> nResidents(){
    return this.residents;
  }
/** 
   *  Updates the resident's list when someone moves in
   *  @param name resident's name
   *  @return the name of the resident that moved in the house  
   */
  public void moveIn(String name){
    residents.add(name);
    System.out.println(name);
  }
/** 
   *  Updates the resident's list when someone moves out
   *  @param name resident's name
   *  @return the name of resident who moved out 
   */
  public String moveOut(String name){
    residents.remove(name);
    return name;
  }
/** 
   *  Check if a person lives in the house
   *  @param person person who is being checked if their in the house
   *  @return T/F: is the person a resident of the house?  
   */
  public boolean isResident(String person){
    if (residents.contains(person)){
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args) {
    new House();
  }

}
