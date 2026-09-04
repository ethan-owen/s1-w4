public class Name {

   private String myFirst;
   private String myMiddle;
   private String myLast;

   public Name(String first, String middle, String last) {
      myFirst = fixCase(first);
      myMiddle = fixCase(middle);
      myLast = fixCase(last);
   }

   public String lastFirst() {
      return myLast + ", " + myFirst + " " + myMiddle;
   }

   public String fullName() {
      return myFirst + " " + myMiddle + " " + myLast;
   }

   public String fixCase(String np) {
      np = np.toLowerCase().trim();
      np = np.substring(0, 1).toUpperCase() + np.substring(1);
      return np;
   }

   // return first letter of each name
   public String initials() {
      return myFirst.substring(0, 1) + myMiddle.substring(0, 1) + myLast.substring(0, 1);
   }

   // first letter of first name concatenated to
   // first two letters of the last name
   public String nickName() {
      return myFirst.substring(0, 2) + myLast.substring(0, 2);
   }
}