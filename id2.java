
class id2{
  public static void main(String[] args) {
    int x=1;
    int y=2;
    int sum=0;
    while (x <= 4000000){

      if(x%2==0){
       sum += x;
      }
      int z = y+x;
      x = y;
      y = z;
    }
    System.out.println(sum);

  }
}
