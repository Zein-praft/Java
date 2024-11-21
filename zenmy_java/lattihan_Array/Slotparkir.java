package lattihan_Array;

import java.util.Scanner;

public class Slotparkir {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    boolean[] Slotparkir = new boolean[10];

    Slotparkir[1] = true;
    Slotparkir[4] = true;
    Slotparkir[8] = true;

    System.out.println("Slot parkir : ");
    for (boolean status : Slotparkir) {
      System.out.print(" " + status + " ");
    }
    System.out.println();
  }
}
