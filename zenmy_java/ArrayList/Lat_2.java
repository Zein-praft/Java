package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Lat_2 {
  public static void main(String[] args) {
    ArrayList<String> motor = new ArrayList<>();
    Scanner input_motor = new Scanner(System.in);

    System.out.print("Masukkan jumlah motor : ");
    int jum = input_motor.nextInt();
    input_motor.nextLine();

    for (int m = 0; m < jum; m++) {
      System.out.print("Masukkan data motor " + (m + 1) + " : ");
      motor.add(input_motor.nextLine());
    }

    int x = 0;
    for (String i : motor) {
      System.out.println("Index ke " + (x + 1) + " : " + i);
      x++;
    }
    System.out.println("Jumlah index : " + motor.size());
  }
}
