package com.vti.entity.Assignment_01;/*Table 4: com.vti.entity.Assignment_01.Group
∙ GroupID: định danh của nhóm (auto increment)
∙ GroupName: tên nhóm
∙ CreatorID: id của người tạo group
∙ CreateDate: ngày tạo group*/

import java.util.Date;

public class Group {
    private int groupId;
    private String groupName;
    private Account creatorId;
    private Account[] accounts;
    private Date createDate;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Account getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Account creatorId) {
        this.creatorId = creatorId;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /*com.vti.entity.Assignment_01.Question 3:
    Tạo constructor cho com.vti.entity.Assignment_01.Group:
    a) Không có parameters
    b) Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
    c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
    Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các thông tin còn lại = null).
    Khởi tạo 1 Object với mỗi constructor ở trên.*/

    // a)
    public Group() {
    }

    // b)
    public Group(String groupName, Account creatorId, Account[] accounts, Date createDate) {
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    // c)
    public Group(String groupName, Account creatorId, String[] usernames, Date createDate) {
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.createDate = createDate;
        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            Account acc = new Account();
            acc.setUserName(usernames[i]);
            this.accounts[i] = acc;
        }
    }
}
