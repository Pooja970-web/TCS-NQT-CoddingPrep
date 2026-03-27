public class CountDigits{
public static void main(String[] args) {
  int n=90876,count=0;
  while(n>0){
    int digit=n%10;
    count++;
    n=n/10;
  }
System.out.println(count);
}
}