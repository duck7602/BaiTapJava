import java.util.Random;
import java.util.Scanner;

public class Assignment_03_EX1 {
    public static void main(String[] args) {
        /*Exercise 1: Datatype Casting

        Question 1:
        Khai báo 2 số lương có kiểu dữ liệu là float.
        Khởi tạo Lương của Account 1 là 5240.5 $
        Khởi tạo Lương của Account 2 là 10970.055$
        Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
        Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra   */

        float salary1;
        float salary2;
        salary1 = 5240.5f;
        salary2 = 10970.055f;
        int number1 = (int)salary1;
        int number2 = (int)salary2;
        System.out.println(number2);
        System.out.println(number1);

     /*   Question 2:
        Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)*/

        Random random = new Random();
        int number = random.nextInt(99999);
        String sNumber = "";
        if (number < 10) {
            sNumber = "0000" + String.valueOf(number);
        } else if (number > 9 && number < 100) {
            sNumber = "000" + String.valueOf(number);
        } else if (number > 99 && number < 1000) {
            sNumber = "00" + String.valueOf(number);
        } else if (number > 999 && number < 10000) {
            sNumber = "0" + String.valueOf(number);
        } else {
            sNumber = String.valueOf(number);
        }
        System.out.println(sNumber);

        /*Question 3:
        Lấy 2 số cuối của số ở Question 2 và in ra.
        Gợi ý:
        Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
        Cách 2: chia lấy dư số đó cho 100*/

        // C1:
        char[] arrNumber = sNumber.toCharArray();
        char[] newArrNumber = {arrNumber[3],arrNumber[4]};
        String newNumber = new String(newArrNumber);
        System.out.println(newNumber);

        // C2:
        Integer sToNumber = Integer.valueOf(sNumber);
        sToNumber %= 100;
        System.out.println(sToNumber);

        /*Question 4:
        Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng.*/
        returnTrade();
    }
    public static void returnTrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = scanner.nextInt();
        a /= b;
        System.out.println("Thương của a và b là: "+a);

    }
}
