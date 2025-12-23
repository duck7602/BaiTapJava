/*Table 1:Department
∙ DepartmentID: định danh của phòng ban (auto increment)
∙ DepartmentName: tên đầy đủ của phòng ban (VD: sale, marketing, …)*/

public class Department{
    int departmentId;
    String departmentName;

    /*Question 1:
    In ra thông tin của phòng ban thứ 1 (sử dụng toString())*/

    @Override
    public String toString(){
         return "Thông tin của phòng ban là:\n"+"ID: "+departmentId+"\n"+"Name: "+departmentName;

   /* Question 2:
    In ra thông tin của tất cả phòng ban (sử dụng toString())*/


    }
}
