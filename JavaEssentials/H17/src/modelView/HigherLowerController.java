package modelView;


public class HigherLowerController {
   private HigherLowerFrame view;
   private HigherLowerGame model;

   public HigherLowerController() {
      init();
   }

   private void init() {
      view = new HigherLowerFrame(this); // koppeling met view
      model = new HigherLowerGame(100); // koppeling met model
      reset();
   }

   public void reset() {
      model.reset();
      view.setDisplayText("Enter number between 0 and 100.\n");
   }

   public void guess() {
      String resultText = view.getDisplayText();
      int value;
      HigherLowerGame.Result result;
      try {
         value = Integer.parseInt(view.getInputText());
         result = model.guess(value);
         switch (result) {
         case LOWER:
            resultText += value + " : lower!\n";
            break;
         case HIGHER:
            resultText += value + " : higher!\n";
            break;
         case EQUAL:
            resultText += value + " : correct!\n";
            break;
         }
      } catch (NumberFormatException ex) {
         resultText += "Invalid!\n";
      }
      view.setDisplayText(resultText);
      view.setInputText("");
   }
}
