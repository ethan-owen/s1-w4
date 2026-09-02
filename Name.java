public class Name {

    private String myFirst;
    private String myMiddle;
    private String myLast;
    
    public Name (String first, String middle, String last) {
       myFirst = fixCase(first);
       myMiddle = fixCase(middle);
       myLast = fixCase(last);
    }
    
    public String lastFirst ( ) {
       return myLast + ", " + myFirst + " " + myMiddle;
    }
    
    public String fullName ( ) {
       return myFirst + " " + myMiddle + " " + myLast;
    }
    
    public String fixCase(String np){
      np = np.toLowerCase().trim();
      np = np.substring(0,1).toUpperCase() + np.substring(1);
      return np;
    }
 }