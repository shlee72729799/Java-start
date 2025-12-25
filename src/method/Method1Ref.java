package method;

public class Method1Ref {

    public static void main(String[] args) {

        int sum1=add(5,3);
        System.out.println("결과1 출력:"+sum1);

        int sum2=minus(25,20);
        System.out.println("결과2 출력:"+sum2);


    }




    //add method
    public static int add(int a,int b) {
        System.out.println(a + " + " + b + " 연산수행 ");
        int sum = a+b;
        return  sum;

    }

    public static int minus (int a, int b){

        System.out.println(a+"-"+b+"연산수행");
        int sum2= a-b;


        return sum2;
    }



}


