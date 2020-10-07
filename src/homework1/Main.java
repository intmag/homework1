package homework1;

import org.omg.CORBA.WStringSeqHelper;

import static homework1.Main.expressionEvaluation;

public class Main {

    public static void main(String[] args) {
        byte byteVal = 127;
        short shortVal = 32000;
        int intVal = 64000;
        long longVal = 128000000;
        float floatVal = 12.1f;
        double doubleVal = 12.1;
        char charVal = 'X';
        boolean booleanVal = true;
        String str = "Евгений";//! На уроке мы строки не проходили !

        System.out.println("Результат вычисления выражения: "+expressionEvaluation(1,3,2,3));
        System.out.println("Проверка суммы двух чисел в диапазон от 10 до 20(вкл): "+chekSum(0,15));
        chekValue(5);
        System.out.println("Результат проверки на отрицательное значение: "+chekOnNegativeValue(-5));
        sayHello(str); //! На уроке мы строки не проходили !
        yearChek(2020);
    }

    public static double expressionEvaluation(double a, double b, double c, double d){
        if (d==0){
            System.out.println("Внимание, в переменной d присвоено нулевое значение. Делить на 0 нельзя!");
            return 0;
        }
        return a*(b+(c/d));
    }
    public static boolean chekSum(double firstNum, double secondNum){
        double sumNum = firstNum + secondNum;
        if (sumNum>=10&&sumNum<=20){
            return true;
        } else {
            return false;
        }
    }
    public static void chekValue(int val){
        if (val>=0){
            System.out.println("Число: положительное");
        }
        else {
            System.out.println("Число: отрицательное");
        }
    }
    public static boolean chekOnNegativeValue(int val){
        boolean chek=false;
        if (val<0){
            chek=true;
        }
        return chek;
    }
    public static void sayHello(String str){
        System.out.println("Привет, "+str+"!");
    }
    public static void yearChek(int year){
        String yearChek="не является";
        if ((year%4==0)&&(year%100!=0)){
            yearChek="является";
        }
        else if (year%400==0){
            yearChek="является";
        }
        System.out.println("Год "+year+" "+yearChek+" высокосным.");
    }
}
