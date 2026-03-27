import java.util.*;
public class PerfectNumbers{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
  int sum=0;
  for(int i=1;i<num;i++){
    if(num%i==0){
      System.out.println(num+" is divisible by "+i);
      sum=sum+i;
    }
  }
  if(sum==num){
    System.out.println(num+" is a perfect number");
  }
  else{
    System.out.println(sum+" is not equal to "+num);
    System.out.println(num+" is not a perfect number");
  }
}
}
