import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Oper o = new Oper();
            System.out.println("Введите операцию: " +
                    "\n" + "1 - сложение;" +
                    "\n" + "2 - вычитание; " +
                    "\n" + "3 - умножение; " +
                    "\n" + "4 - деление;" +
                    "\n" + "5 - возведение числа a в степень b;" +
                    "\n" + "6 - корень числа а степени b;" +
                    "\n" + "7 - sin(a);" +
                    "\n" + "8 - cos(a);" +
                    "\n" + "0 - выход");
            o.setO(scanner.nextInt());
            o.getO();

            if (o.getO() == 0){
                break;
            }

            Calc operacion = new Calc();
            operacion.Fulfill(o.getO());
        }
    }
}