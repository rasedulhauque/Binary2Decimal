/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary2decimal;
import java.util.*;
/**
 *
 * @author rased
 */
public class Binary2Decimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input_scan=new Scanner(System.in);
      System.out.print("Enter your Binary Number: ");
      String binary=input_scan.nextLine();
      System.out.println("Decimal is : "+toDecimal(binary));
  }  
  public static int toDecimal(String binary){
      int decimal=0;
      int power=binary.length()-1;
      for(int i=0;i<binary.length();i++){
          int _convert=Character.getNumericValue(binary.charAt(i));
          decimal+=_convert*Math.pow(2, power);
          power--;
      }
      return decimal;
    }
    
}
