//import java.util.Arrays;
//import java.util.Scanner;
//
//public class LabAssignment3_2012547 {
//  public static int[] workingHours(int[][] EmpWorkHours) {
//    int rowsNUM = 8;
//    int columnNum = 7;
//    int[] totalWorkingHours = new int[8];
//    for (int row = 0; row < rowsNUM; row++) {
//      for (int column = 0; column < columnNum; column++) {
//        totalWorkingHours[row] += EmpWorkHours[row][column];
//
//      }
//    }
//    return totalWorkingHours;
//  }
//
//
//  public static void main(String[] args) {
//
//    int rowsNUM = 8;
//    int columnNum = 7;
//
//    int[][] EmpWorkHours = new int[rowsNUM][columnNum];
//    System.out.println("Enter the weekly working hours for each employee");
//    for (int row = 0; row < rowsNUM; row++) {
//      for (int column = 0; column < columnNum; column++) {
//        EmpWorkHours[row][column] = input.nextInt();
//
//      }
//    }
//    for (int[] row : EmpWorkHours) {
//      System.out.println(Arrays.toString(row));
//    }
//    int[] WorkHours = workingHours(EmpWorkHours);
//    for (int i = 0; i < 8; i++) {
//      System.out.println("Employee " + (i + 1) + " : " + WorkHours[i]);
//    }
//
//  }
//}
//
