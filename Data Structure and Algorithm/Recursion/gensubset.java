import java.util.Scanner;

public class gensubset {
    public static void subset(int i,String str,String curr){
        if(i==str.length()){
            System.out.println(curr);

            return ;
        } 

        subset(i+1,str,curr);

        subset(i+1,str,curr+str.charAt(i));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int index=0;
        String curr="";
        subset(index,str,curr);
    }
}
