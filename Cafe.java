/* This is a stub for the Cafe class */

/** 
   *  Builds a Cafe
   *  @param nCoffeeOunces the amount of ounces of coffee in inventory 
   * @param nSugarPackets the amount of sugar packets in inventory
   * @param nCreams the amount of cream left in inventory 
   * @param ncups the amount of cups left in inventory
   */
public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int ncups;

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.ncups = 50;
        System.out.println("You have built a cafe: ☕");
    }

    // overloaded constructor with nSugarPackets and nCreams
/** 
   *  updates inventory when a cup of coffee is sold and when there needs to be a resotck
   *  @param nCoffeeOunces the amount of ounces of coffee in inventory 
   * @param nSugarPackets the amount of sugar packets in inventory
   * @param nCreams the amount of cream left in inventory 
   * @param ncups the amount of cups left in inventory
   */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(this.nCoffeeOunces == 0 || this.nSugarPackets == 0 || this.nCreams == 0 || this.ncups == 0){
            restock(10,10,10,10);
        }
        this.nCoffeeOunces =- size;
        this.nSugarPackets =- nSugarPackets;
        this.nCreams =- nCreams;
        this.ncups =- 1;
    
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int ncups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
       this.nCreams += nCreams;
        this.ncups += ncups;
            
    }

    public void showOptions(){
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + restock() \n + sellCoffee() \n ");  
    }

    public void goToFloor(int floorNum) {
        if (this.activeFloor == 1) {
            throw new RuntimeException("You can't go to any other floor using the elevator as it for storage and accessible to only employess.");
        }
    }
    public static void main(String[] args) {
        Cafe compass =new Cafe("compass", "1 Chapin Way 01063", 1);
        System.out.println(compass);


    }
    
}
