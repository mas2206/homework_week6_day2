import java.util.*;

public class Photographer {
  
  private String name;
  private ArrayList<Printable> collection;

  public Photographer(String name) {
    this.name = name;
    this.collection = new ArrayList<Printable>();
  }

  public int collectionSize(){
    return collection.size();
  }

  public void addCamera(Printable camera) {
    collection.add(camera);
  }

  public Printable removeCamera() {
    if(collectionSize() > 0){
      return collection.remove(0);
    }
    return null;
  }

  // public String showCollectionDetails() {
  //   return collection.printDetails();
  // }

}