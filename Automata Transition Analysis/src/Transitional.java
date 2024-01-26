import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transitional {
  public static void main(String args[]) {
    int numStates = 0; // Used create power set
    ArrayList<States> NFA = new ArrayList<>(); 
    File inputFileName = new File("src/Test_1.txt");
    try {
      Scanner keyboard = new Scanner(inputFileName);
      while (keyboard.hasNextLine()) {
        String temp = keyboard.nextLine();

        String[] columns = temp.split(","); // Splits state and their links from given file
        for (int i = 2; i < columns.length; i++) {
          columns[1] += "," + columns[i]; // concatenate links, separated by ','
        }
        if (columns[1].charAt(0) == '{') {
          columns[1] = columns[1].replaceAll("[\\p{Ps}\\p{Pe}]", ""); // Removes any form of opening and closing bracket
        }

        String[] links = columns[1].split(","); // After removing brackets, split by ','
        ArrayList<States> holder = new ArrayList(); // Creating a temporary array list, holds the links for current state 
        for (String tempStates : links) {
          States tempState = new States(tempStates);
          holder.add(tempState);
        }

        States state = new States(columns[0]);
        state.setLinks(holder);
        NFA.add(numStates, state);
        numStates++; // increments number of states
      }
      
      System.out.print("State set of the equivalent DFA = {");
      int[] arrayStates = new int[numStates];
      
      for (int i = 0; i < arrayStates.length; i++) {
        arrayStates[i] = i + 1;
      }

      PowerSet tempSet = new PowerSet();

      List<List<Integer>> subsets = tempSet.subsets(arrayStates);

      for (List<Integer> subset : subsets) {
        System.out.print(subset.toString().replace("[", "{").replace("]", "}"));
        System.out.printf(", ");
      }
      System.out.println("}");

      for (States temp : NFA) {
        
        System.out.printf("E(" + temp.getName() + ") = " + temp.getName() + " ");
        temp.displayLinks(NFA);
        System.out.println();
      }
      keyboard.close();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found!");
    }
  }
}