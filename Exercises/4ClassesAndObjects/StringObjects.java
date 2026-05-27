import java.sql.SQLOutput;

public class StringObjects {
    public static void main(String[] args) {
        String college = new String ("Bradford Uni");
        String town = "Bradford, UK"; // part a

        int stringLength;
        String change1, change2, change3;
        stringLength = college.length();
        System.out.println(college + " contains " + stringLength + " characters.");
        change1 = college.substring(0, stringLength).toUpperCase(); // part c
        change2 = college.substring(stringLength); // part d
        change3 = town.concat(college.substring(stringLength)); // part e
        System.out.println("The final string is " + change3);


    }
}
