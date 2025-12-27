package com.vti.entity;/*Table 8: com.vti.entity.Question
∙ QuestionID: định danh của câu hỏi (auto increment)
∙ Content: nội dung của câu hỏi
∙ CategoryID: định danh của chủ đề câu hỏi
∙ TypeID: định danh của loại câu hỏi
∙ CreatorID: id của người tạo câu hỏi
∙ CreateDate: ngày tạo câu hỏi*/

import java.util.Date;

public class Question {
    private int questionId;
    private String content;
    private CategoryQuestion categoryId;
    private TypeQuestion typeId;
    private Account creatorId;
    private Date createDate;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CategoryQuestion getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryQuestion categoryId) {
        this.categoryId = categoryId;
    }

    public TypeQuestion getTypeId() {
        return typeId;
    }

    public void setTypeId(TypeQuestion typeId) {
        this.typeId = typeId;
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
