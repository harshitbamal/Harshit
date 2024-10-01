import java.util.*;

public class Anagram {
        public static boolean isAnagram(String s, String t) {
            if(s.length ()!=t.length()){
                return false;
            }
            char count []=new char[26];
            for( char ch : s.toCharArray())
                count[ch-97]++;

            for( char ch : t.toCharArray())
                count[ch-97]--;
            for( int var : count )
                if(var!=0)  return false;
            return true;
        }


    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Pyare pehla number do");
            String s=sc.next();
        System.out.println("pyare dusra bhi number do");
            String t=sc.next();
            boolean rel=isAnagram(s,t);
            if(rel==true){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

    }
}