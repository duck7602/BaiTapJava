package com.vti.entity.Assignment_01;/*Table 6: com.vti.entity.Assignment_01.TypeQuestion
∙ TypeID: định danh của loại câu hỏi (auto increment)
∙ com.vti.entity.Assignment_01.TypeName: tên của loại câu hỏi (Essay, Multiple-Choice)*/

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
