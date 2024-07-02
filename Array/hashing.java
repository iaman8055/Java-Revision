package Array;

import java.util.Scanner;

public class hashing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        int hash[]=new int[26];
        for(int i=0;i<hash.length;i++){
            hash[i]=0; 
        }
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        int q=sc.nextInt();
        
      for(int i=0;i<q;i++){
        char c=sc.charAt(0);
        System.out.println(hash[c-'a']+" ");
      }
    }
}
