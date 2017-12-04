import java.lang.*;
class id7{
  public static void main(String[] args) {
    int count = 0;
    while (count >= 1){
      int i=count;
      if(i%2== 0 || i%3== 0 || i%4==0 || i%5==0 || i%6==0 || i%7==0 || i%8==0 || i%9==0 || i%10==0){
        int sqrt = (int) Math.sqrt(i);
        if(sqrt*sqrt == i) {
          continue;
        }
      System.out.println(i);
    }
      else{
        System.out.println(i);
        count++;
      }
    }
  }
}
