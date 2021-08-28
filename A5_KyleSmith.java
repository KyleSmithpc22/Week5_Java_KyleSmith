public class App {
	
  public static void main(String[] args) {
    AsteriskLogger AL = new AsteriskLogger();
    AL.Log("Hello");
    System.out.println(); 
    AL.Error("Hello"); 
    System.out.println();

    SpaceLogger SL = new SpaceLogger();
    SL.Log("Hello");
    System.out.println();
    SL.Error("Hello");
    System.out.println();
  }
}


interface Logger {
  void Log(String str);
  void Error(String str);
}

class AsteriskLogger implements Logger {
  public void Log(String str) {
    System.out.println("***" + str + "***"); 
  }
  
  public void Error(String str) {
    String res = "***" + "Error: " + str + "***"; 
    

    String stars = "";
    for (int i = 0; i < res.length(); i++) stars += "*"; 

    System.out.println( 
        stars + 
        "\n" + res +
        "\n" + stars 
        );
  }
}

class SpaceLogger implements Logger {
  public void Log(String str){
    for (int i = 0; i < str.length(); i++){ 
      char curr = str.charAt(i); 
      System.out.print(curr + " "); 
    }
    System.out.println();
  }
  
  public void Error(String str){
    System.out.print("Error: "); 
    for (int i = 0; i < str.length(); i++){ 
      char curr = str.charAt(i);
      System.out.print(curr + " ");
    }
    System.out.println();
  }
}