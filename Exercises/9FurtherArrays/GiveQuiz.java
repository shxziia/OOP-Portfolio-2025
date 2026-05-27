import java.util.Scanner;

public class GiveQuiz {
    private Quiz[] questions;
    private int questionCount;

    public GiveQuiz() {
        questions = new Quiz[25];
        questionCount = 0;
    }

    public void add(Quiz question) {
        if (questionCount >= 25) {
            System.out.println("Quiz already has 25 questions.");
            return;
        }
        questions[questionCount] = question;
        questionCount++;
    }

    public void giveQuiz() {
        Scanner scanner = new Scanner(System.in);
        int correct = 0;

        System.out.println("Starting the quiz...\n");

        for (int i = 0; i < questionCount; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i].getPrompt());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (questions[i].isCorrect(userAnswer)) {
                System.out.println("Correct!\n");
                correct++;
            } else {
                System.out.println("Incorrect.\n");
            }
        }

        System.out.println("Quiz finished! You got " + correct + " out of " + questionCount + " correct.");
    }
}

