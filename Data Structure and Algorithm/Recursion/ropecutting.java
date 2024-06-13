import java.util.Scanner;

public class ropecutting {
    public static int maxpieces(int n,int a,int b,int c){
        if(n==0)return 0;
        if(n<0)return -1;
        int res=Math.max(Math.max(maxpieces(n-a, a, b, c),maxpieces(n-b, a, b, c)),maxpieces(n-c, a, b, c));
        if(res==-1)return -1;
        return res+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int cut=maxpieces(n,a,b,c);
        System.out.println(cut);
    }
      
}
