/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segovia_3_challenge0;

/**
 *
 * @author TheInnerNerd
 */
public class Segovia_3_Challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for( int i=0; i<=500 ; i++ ){
       if (isDivisibleByFive(i) && isDivisibleByEleven(i)) {
               if (isDivisibleByFive(i)) {
                   System.out.println("Animate This!");
        }
        }else if (isDivisibleByThree(i) && isDivisibleByEleven(i)){
            System.out.println("Herr Direktor");
        }else if (isDivisibleByTwo(i) && isDivisibleByEleven(i)){
            System.out.println("ninja");
        }else if (isDivisibleByTwo(i) && isDivisibleByThree(i) && isDivisibleByTwo(i)){
            System.out.println("Team Building");
        }else if (isDivisibleByThree(i) && isDivisibleByFive(i)){
            System.out.println("Old School");
         }else if (isDivisibleByTwo(i) && isDivisibleByThree(i)){
            System.out.println("chisme");   
        }else if (isDivisibleByFive(i)){
            System.out.println("Vidal");
        }else if (isDivisibleByThree(i)){
            System.out.println("Claughton");
        }else if (isDivisibleByTwo(i)){
            System.out.println("Davis");
        }
        else {
                System.out.println((i));
    }
        }
}
 static boolean isDivisibleByTwo (int number){
        return(number % 2 == 0);
      }
 
 static boolean isDivisibleByThree (int number){
        return(number % 3 == 0);
      }
 
 static boolean isDivisibleByFive (int number){
        return(number % 5 == 0);
      }
 
 static boolean isDivisibleByEleven (int number){
        return(number % 11 == 0);
      }
 



}   