public class Quiz {
    private String prompt;
    private String answer;

    public Quiz(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer.trim().toLowerCase();
    }

    public String getPrompt() {
        return prompt;
    }

    public boolean isCorrect(String userAnswer) {
        return userAnswer.trim().toLowerCase().equals(answer);
    }
}

