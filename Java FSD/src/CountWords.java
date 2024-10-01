import java.util.*;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==' '){
                count++;
            }

        }
        System.out.println("count of word is: "+ (count+1));

    }

}

//Another method
public static void main(String[] args) {
    Scanner sc = new Scanner("This is class room");
    int c = 0;
    while (sc.hasNext()){
          sc.next();
          c++;
    }
    System.out.println(c);
}

