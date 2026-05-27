public class Punctuation {
    public static void main(String[] args) {
        int countcomma = 0;
        int countperiod = 0;
        int countdash = 0;

        String str = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            {

                if (currentChar == ',') {
                    countcomma++;
                }
                else if (currentChar == '.'){
                    countperiod++;
                }
                else if (currentChar == '-'){
                    countdash++;
                }

                System.out.println("Punctuation Mark   |  Count ");
                System.out.println("------------------ | --------");
                System.out.printf("      ,           |   %d\n", countcomma);
                System.out.printf("      .           |   %d\n", countperiod);
                System.out.printf("      -          |   %d\n", countdash);

                }
            }
        }
    }
