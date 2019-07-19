package modelView;

import java.util.*;

import modelView.HigherLowerGame.Result;

public class HigerhLowerConsole {

   public static void main(String[] args) {
      HigherLowerGame game = new HigherLowerGame(10); // >=0 en <=10
      Scanner scanner = new Scanner(System.in);
      HigherLowerGame.Result result = null;
      int value = 0 ;
      while (result == null || result != Result.EQUAL){
    	boolean verder =  true;
    	while (verder){
    	System.out.println("Enter a number between 0 and 10");
    	try{
    	value = scanner.nextInt();
    	while( value <0 || value >10){
    		  System.out.println("ongeldige waarde");
    		  value = scanner.nextInt();
    	}
    	verder =  false;
    	}catch(Exception e){
    		System.out.println("je hebt geen getal ingegeven");
    		scanner.nextLine();
    	}
      }
    	result = game.guess(value);
    	switch (result) {
    	  case LOWER:
            System.out.println("Lower!");
            break;
          case HIGHER:
            System.out.println("Higher!");
            break;
          case EQUAL:
            System.out.println("Correct!");
            break;
        }
      }
      scanner.close();
   }
}
