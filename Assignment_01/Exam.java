/*Table 10: Exam
∙ ExamID: định danh của đề thi (auto increment)
∙ Code: mã đề thi
∙ Title: tiêu đề của đề thi
∙ CategoryID: định danh của chủ đề thi
∙ Duration: thời gian thi
∙ CreatorID: id của người tạo đề thi
∙ CreateDate: ngày tạo đề thi*/

import java.util.Date;

public class Exam {
    int examId;
    int code;
    String title;
    CategoryQuestion categoryId;
    int duration;
    Account creatorId;
    Date createDate;
}
