import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(new File("input.txt"));
    //Scanner scan = new Scanner(System.in);
    while(scan.hasNext()){
      int num = scan.nextInt();
      if(num == 0){
        break;
      }else{
        int[] ratings = new int[num];
        int total = 0;
        for(int i=0; i<num; i++){
          ratings[i] = scan.nextInt();
          total += ratings[i];
        }
      }
    }
  }
}

