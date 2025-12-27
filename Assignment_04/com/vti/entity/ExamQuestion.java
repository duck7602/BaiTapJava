package com.vti.entity;/*Table 11: com.vti.entity.ExamQuestion
∙ ExamID: định danh của đề thi
∙ QuestionID: định danh của câu hỏi*/

public class ExamQuestion {
    private Exam examId;
    private Question questionId;

    public Exam getExamId() {
        return examId;
    }

    public void setExamId(Exam examId) {
        this.examId = examId;
    }

    public Question getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Question questionId) {
        this.questionId = questionId;
    }
}
