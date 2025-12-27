package com.vti.entity;/*Table 10: com.vti.entity.Exam
∙ ExamID: định danh của đề thi (auto increment)
∙ Code: mã đề thi
∙ Title: tiêu đề của đề thi
∙ CategoryID: định danh của chủ đề thi
∙ Duration: thời gian thi
∙ CreatorID: id của người tạo đề thi
∙ CreateDate: ngày tạo đề thi*/

import java.util.Date;

public class Exam {
    private int examId;
    private int code;
    private String title;
    private CategoryQuestion categoryId;
    private int duration;
    private Account creatorId;
    private Date createDate;

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryQuestion getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryQuestion categoryId) {
        this.categoryId = categoryId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Account getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Account creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
