import java.util.Scanner;
public class Cricket {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter n");
    int n=sc.nextInt();
    int a[];
    a=new int[n];
    for(int i=0;i<n;i++){
      System.out.println("a["+i+"]="+a[i]);
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      System.out.println("a["+i+"]="+a[i]);

    }
    
    }
}