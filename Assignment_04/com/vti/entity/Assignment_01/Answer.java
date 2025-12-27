package com.vti.entity.Assignment_01;/*Table 9: com.vti.entity.Assignment_01.Answer
∙ AnswerID: định danh của câu trả lời (auto increment)
∙ Content: nội dung của câu trả lời
∙ QuestionID: định danh của câu hỏi
∙ isCorrect: câu trả lời này đúng hay sai*/

public class Answer {
    private int answerId;
    private String content;
    private Question questionId;
    private boolean isCorrect;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Question getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Question questionId) {
        this.questionId = questionId;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
}
