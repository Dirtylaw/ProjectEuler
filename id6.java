class id6{
  public static void main(String[] args) {
    int one = 1;
    int sum = 0;
    int num = 0;
    while(one<=100){
        num = one*one;
        sum = sum+num;
        one++;
    }
    int two = 1;
    int sum2 = 0;
    int num2 = 0;
    while(two<=100){
      num2 = num2 + two;
      two++;
    }
    sum2 = num2*num2;
    System.out.println(sum2 - sum);

  }
}
