package com.vti.entity.Assignment_01;/*Table 5: com.vti.entity.Assignment_01.GroupAccount
∙ GroupID: định danh của nhóm
∙ AccountID: định danh của User
∙ JoinDate: Ngày user tham gia vào nhóm*/

import java.util.Date;

public class GroupAccount {
    private Group groupId;
    private Account accountId;
    private Date joinDate;

    public Group getGroupId() {
        return groupId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
