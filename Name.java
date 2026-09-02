public class Name {

    private String myFirst;
    private String myMiddle;
    private String myLast;
    
    public Name (String first, String middle, String last) {
       myFirst = first;
       myMiddle = middle;
       myLast = last;
       fixCase (myFirst);
       fixCase (myMiddle);
       fixCase (myLast);
    }
    
    public String lastFirst ( ) {
       return myLast + ", " + myFirst + " " + myMiddle;
    }
    
    public String fullName ( ) {
       return myFirst + " " + myMiddle + " " + myLast;
    }
    
    public void fixCase(String np){
      np = np.toLowerCase().trim();
      np = np.substring(0,1).toUpperCase() + np.substring(1);
    }
 }