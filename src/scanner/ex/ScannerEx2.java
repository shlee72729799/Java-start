package scanner.ex;
import java.util.Scanner;


public class ScannerEx2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("숫자를 입력 하시오:");

        int num= scanner.nextInt();

        if(num%2==1){
            System.out.print("입력한 숫자는 홀수입니다.");
        }else{
            System.out.print("입력한 숫자는 짝수입니다.");
        }


    }

}
