/*Table 3: Account
∙ AccountID: định danh của User (auto increment)
∙ Email:
∙ Username:
∙ FullName:
∙ DepartmentID: phòng ban của user trong hệ thống
∙ PositionID: chức vụ của User
∙ CreateDate: ngày tạo tài khoản*/

import java.util.Date;

public class Account {
    int accountId;
    String email;
    String userName;
    String fullName;
    Department departmentId;
    Position positionId;
    Date creatDate;
}
