public class QuizTime {
    public static void main(String[] args) {
        GiveQuiz quiz = new GiveQuiz();

        quiz.add(new Quiz("How is a Variable declared?", "By specifying its name and type of information that it will hold"));
        quiz.add(new Quiz("How many Primitive Data types represent integers?", "4"));
        quiz.add(new Quiz("Java was developed by which company?", "Sun Microsystems"));
        quiz.add(new Quiz("Is HTML considered a programming language? (yes/no)", "no"));

        quiz.giveQuiz();
    }
}

