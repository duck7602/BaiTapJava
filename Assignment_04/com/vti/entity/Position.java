package com.vti.entity;/*Table 2: com.vti.entity.Position
∙ PositionID: định danh của chức vụ (auto increment)
∙ com.vti.entity.PositionName: tên chức vụ (Dev, Test, Scrum Master, PM)*/

public class Position {
    private int positionId;
    private PositionName positionName;

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public PositionName getPositionName() {
        return positionName;
    }

    public void setPositionName(PositionName positionName) {
        this.positionName = positionName;
    }
}
