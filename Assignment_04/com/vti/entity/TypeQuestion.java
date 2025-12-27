package com.vti.entity;/*Table 6: com.vti.entity.TypeQuestion
∙ TypeID: định danh của loại câu hỏi (auto increment)
∙ com.vti.entity.TypeName: tên của loại câu hỏi (Essay, Multiple-Choice)*/

public class TypeQuestion {
    private int typeId;
    private TypeName typeName;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }
}
