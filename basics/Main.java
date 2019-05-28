import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    pluralize("dog", 0);
    pluralize("cat", 1);
    pluralize("turtle", 2);
    flipNHeads(4);
    clock();
    
  }
  
  public static void pluralize(String word, int count) {
    
    if (count > 1 || count == 0){
      System.out.println("I own " + count + " " + word + "s") ;
    }else {
      System.out.println("I own " + count + " " + word) ;
    }
  }
  
  public static void flipNHeads(int n){
    int flips = 0;
    int heads = 0;
    do{
      double i = Math.random();
      
      if (i < .5){
        System.out.println("tails");
        flips ++;
        heads = 0;
      } else {
        System.out.println("heads");
        flips ++;
        heads++;
      }
      
    } while (heads < n);
    System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
    
  }

  public static void clock(){
    LocalDateTime now = LocalDateTime.now();

    while(true){
      if (now.getSecond() != LocalDateTime.now().getSecond()){
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        now = LocalDateTime.now();
      }
    }
  }
}