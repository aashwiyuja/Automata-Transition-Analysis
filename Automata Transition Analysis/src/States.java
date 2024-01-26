import java.util.ArrayList;

public class States {
  private String name;
  private ArrayList<States> links = new ArrayList();
  int i = 1;
  int count = 0;

  public States() {
    this.name = "empty";
  }

  public States(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setLinks(ArrayList<States> links) {
    this.links = links;
  }

  public ArrayList<States> getLinks() {
    return this.links;
  }

  public void displayLinks(ArrayList<States> tempStates) {
    

    for (int i = 0; i < this.getLinks().size(); i++) {

      if (this.getLinks().size() == 0) {
        this.getLinks().get(i).displayLinks(tempStates);
        System.out.print(this.getLinks().get(i).getName() + " ");
      }

      if (this.getLinks().get(i).getName().equalsIgnoreCase("empty")) {
        
        break;
      } else {
        
        this.getLinks().get(i).displayLinks(tempStates);
        System.out.print(this.getLinks().get(i).getName() + " ");
      }
      continue;
    }

    
  }
}
