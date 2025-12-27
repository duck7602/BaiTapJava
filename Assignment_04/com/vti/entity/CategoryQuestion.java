package com.vti.entity;/*Table 7: com.vti.entity.CategoryQuestion
∙ CategoryID: định danh của chủ đề câu hỏi (auto increment)
∙ CategoryName: tên của chủ đề câu hỏi (Java, .NET, SQL, Postman, Ruby,…)*/

public class CategoryQuestion {
    private int categoryId;
    private String categoryName;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
