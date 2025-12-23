/*Table 9: Answer
∙ AnswerID: định danh của câu trả lời (auto increment)
∙ Content: nội dung của câu trả lời
∙ QuestionID: định danh của câu hỏi
∙ isCorrect: câu trả lời này đúng hay sai*/

public class Answer {
    int answerId;
    String content;
    Question questionId;
    boolean isCorrect;
}
