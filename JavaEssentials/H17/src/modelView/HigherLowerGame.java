package modelView;

import java.util.*;


public class HigherLowerGame {
   public enum Result {
      LOWER,EQUAL,HIGHER;
   }
   private int value;
   private int max;
   private Random rand;
   
   public HigherLowerGame(int max) {
      this.max = max;
      rand = new Random();
      reset();
   }
   
   public void reset() {
      value = rand.nextInt(max +1);
   }
   
   public Result guess(int guessValue) {
      if(guessValue < value ) {
         return Result.HIGHER;
      }
      else if (guessValue > value) {
         return Result.LOWER;
      }
      else {
         return Result.EQUAL;
      }
   }   
}
