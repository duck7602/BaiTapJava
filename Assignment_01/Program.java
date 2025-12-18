import java.util.Date;

public class Program {
    public static void main(String[] args) {
        // 1. Department:
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";

        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Media";

        System.out.println("Department 1: "+department1);
        System.out.println("Department 2 (Name): "+department2.departmentName+ "\n");

        // 2. Position:
        Position position1 = new Position();
        position1.positionId = 1;
        position1.positionName = PositionName.Dev;

        Position position2 = new Position();
        position2.positionId = 2;
        position2.positionName = PositionName.Test;

        Position position3 = new Position();
        position3.positionId = 3;
        position3.positionName = PositionName.PM;

        System.out.println("Position 1: "+position1+ "\n");

        // 3. Account:
        Account account1 = new Account();
        account1.accountId = 1;
        account1.email = "duc1@gmail.com";
        account1.userName = "Duc";
        account1.fullName = "Nguyen Ba Minh Duc";
        account1.departmentId = department1;
        account1.positionId = position1;
        account1.creatDate = new Date("2025/12/18");

        Account account2 = new Account();
        account2.accountId = 2;
        account2.email = "tam1@gmail.com";
        account2.userName = "Tam";
        account2.fullName = "Nguyen My Minh Tam";
        account2.departmentId = department2;
        account2.positionId = position2;
        account2.creatDate = new Date("2025/12/18");

        Account account3 = new Account();
        account3.accountId = 3;
        account3.email = "tai1@gmail.com";
        account3.userName = "Tai";
        account3.fullName = "Nguyen Ba Minh Tai";
        account3.departmentId = department3;
        account3.positionId = position3;
        account3.creatDate = new Date("2025/12/18");

        System.out.println("Account 3: "+account3+ "\n");

        // 4. Group:
        Group group1 = new Group();
        group1.groupId = 1;
        group1.groupName = "Group 1";
        group1.creatorId = account1;
        group1.createDate = new Date("2003/02/03");

        Group group2 = new Group();
        group2.groupId = 2;
        group2.groupName = "Group 2";
        group2.creatorId = account2;
        group2.createDate = new Date("2003/05/03");

        Group group3 = new Group();
        group3.groupId = 3;
        group3.groupName = "Group 3";
        group3.creatorId = account3;
        group3.createDate = new Date("2005/02/03");

        System.out.println("Group 3: "+group3+ "\n");

        // 5. GroupAccount:
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.groupId = group1;
        groupAccount1.accountId = account1;
        groupAccount1.joinDate = new Date("2007/04/02");

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.groupId = group2;
        groupAccount2.accountId = account2;
        groupAccount2.joinDate = new Date("2003/04/02");

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.groupId = group3;
        groupAccount3.accountId = account3;
        groupAccount3.joinDate = new Date("2007/04/02");

        System.out.println("Group Account 3: "+groupAccount3+ "\n");

        // 6. TypeQuesion:
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.typeId = 1;
        typeQuestion1.typeName = TypeName.Essay;

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.typeId = 2;
        typeQuestion2.typeName = TypeName.Essay;

        TypeQuestion typeQuestion3 = new TypeQuestion();
        typeQuestion3.typeId = 3;
        typeQuestion3.typeName = TypeName.Multiple_Choice;

        System.out.println("Type Question 3: "+typeQuestion3+ "\n");

        // 7. CategoryQuestion:
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.categoryId = 1;
        categoryQuestion1.categoryName = "Java";

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.categoryId = 2;
        categoryQuestion2.categoryName = "Python";

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.categoryId = 3;
        categoryQuestion3.categoryName = "Ruby";

        System.out.println("Category Question 3: "+categoryQuestion3+ "\n");

        // 8. Question:
        Question question1 = new Question();
        question1.questionId = 1;
        question1.content = "Content1";
        question1.categoryId = categoryQuestion1;
        question1.typeId = typeQuestion1;
        question1.creatorId = account1;
        question1.createDate = new Date("2020/01/01");

        Question question2 = new Question();
        question2.questionId = 2;
        question2.content = "Content2";
        question2.categoryId = categoryQuestion2;
        question2.typeId = typeQuestion2;
        question2.creatorId = account2;
        question2.createDate = new Date("2020/01/08");

        Question question3 = new Question();
        question3.questionId = 3;
        question3.content = "Content3";
        question3.categoryId = categoryQuestion3;
        question3.typeId = typeQuestion3;
        question3.creatorId = account3;
        question3.createDate = new Date("2023/01/01");

        System.out.println("Question 3: "+question3+ "\n");

        // 9. Answer:
        Answer answer1 = new Answer();
        answer1.answerId = 1;
        answer1.content = "Content1";
        answer1.questionId = question1;
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.answerId = 2;
        answer2.content = "Content2";
        answer2.questionId = question2;
        answer2.isCorrect = true;

        Answer answer3 = new Answer();
        answer3.answerId = 3;
        answer3.content = "Content3";
        answer3.questionId = question3;
        answer3.isCorrect = false;

        System.out.println("Answer 3: "+answer3+ "\n");

        // 10. Exam:
        Exam exam1 = new Exam();
        exam1.examId = 1;
        exam1.code = 1;
        exam1.title = "Title1";
        exam1.categoryId = categoryQuestion1;
        exam1.duration = 60;
        exam1.creatorId = account1;
        exam1.createDate = new Date("2003/03/02");

        Exam exam2 = new Exam();
        exam2.examId = 2;
        exam2.code = 2;
        exam2.title = "Title2";
        exam2.categoryId = categoryQuestion2;
        exam2.duration = 60;
        exam2.creatorId = account2;
        exam2.createDate = new Date("2003/03/02");

        Exam exam3 = new Exam();
        exam3.examId = 3;
        exam3.code = 3;
        exam3.title = "Title3";
        exam3.categoryId = categoryQuestion3;
        exam3.duration = 60;
        exam3.creatorId = account3;
        exam3.createDate = new Date("2003/03/02");

        System.out.println("Exam 3: "+exam3+ "\n");

        // 11.ExamQuestion:
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.examId = exam1;
        examQuestion1.questionId = question1;

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.examId = exam2;
        examQuestion2.questionId = question2;

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.examId = exam3;
        examQuestion3.questionId = question3;

        System.out.println("Exam Question 3: "+examQuestion3+ "\n");

    }
    }
