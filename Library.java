import java.util.Hashtable;
import java.util.Set;
/* This is a stub for the Library class */
/** 
   *  Builds a library
   *  @param collection the books in the library 
   */
public class Library extends Building {
  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }
/** 
   *  Adds a book
   *  @param title title of the book 
   */
    public void addTitle(String title){
      this.collection.put(title,true);
    }
/** 
   *  Removes a book
   *  @param title
   *  @return title of the book that was removed
   */
    public String removeTitle(String title){
      this.collection.remove(title);
      return title;
      
    }
    /** 
   *  Changes the availability of the book to false from true once the book is given
   *  @param title title of the book 
   */
    public void CheckOut(String title){
      this.collection.replace(title,true,false);
    }
/** 
   *  Changes the availability of the book to true from false once the book is returned
   *  @param title title of the book
   */
    public void returnBook(String title){
      this.collection.replace(title, false, true);
    }
/** 
   *  See if the book is in the library's collection
   *  @param title title of the book
   * @return T/F: Is the book in the library's collection?
   */
    public boolean containsTitle(String title){
      return this.collection.containsKey(title);
      }
/** 
   *  See if the library book is available
   *  @param title title of the book
   * @return T/F: Is the book available?
   */
    public boolean isAvailable(String title){
      return this.collection.get(title);
    }
    
    //overloaded isAvailable method
    //public boolean isAvailable(int title){ //parameter from string to int
      //return this.collection.get(title);
    //}

/** 
   *  Prints the collection
   *  @return printed version of the collection of books
   */
    public void printCollection(){
      System.out.println("My collection");
      Set <String> title = collection.keySet();
      for (String key : title){
        if (collection.get(key)== true){
          System.out.println("The book"+ key +"is available");
        }else{
          System.out.println("The book"+ key+"is unavailable");
        }
      }
    }

    public void showOptions(){
      super.showOptions(); 
      System.out.println("addTitle \n + removeTitle() \n + checkOut() \n + returnBook()\n + containsTitle() \n + isAvailable() \n + printCollection() \n  ");
  }

  public void goToFloor(int floorNum){
      super.goToFloor(floorNum);
  }
  
    public static void main(String[] args) {
      Library NL = new Library("Neilson","7 Neilson Drive, Northampton, MA 01063",4);
      System.out.println(NL);
    }
  
  }
