/*Table 4: Group
∙ GroupID: định danh của nhóm (auto increment)
∙ GroupName: tên nhóm
∙ CreatorID: id của người tạo group
∙ CreateDate: ngày tạo group*/

import java.util.Date;

public class Group {
    int groupId;
    String groupName;
    Account creatorId;
    Date createDate;
}
