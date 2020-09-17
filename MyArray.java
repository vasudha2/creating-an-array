import java.util.Scanner;
public class MyArray{
    public static void main(String args[]){
        int a[];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("enter values into arrays");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The array values are");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
