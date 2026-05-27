import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String result = "";

        for(int i=sentence.length()-1;i>=0; i--) {
            result += sentence.charAt(i);
        }

        System.out.println("Reverse string is " + result);

        }
    }

