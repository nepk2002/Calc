import java.util.Scanner;

public class Calc {

    public void Fulfill(int o) {

        switch (o) {
            case 1: {
                int sumOne = getNumberOne();
                int sumTwo = getNumberTwo();
                System.out.println(sumOne + " + " + sumTwo + " = " + (sumOne + sumTwo)+ "\n");
                break;
            }
            case 2: {
                int subtOne = getNumberOne();
                int subtTwo = getNumberTwo();
                System.out.println(subtOne + " - " + subtTwo + " = " + (subtOne - subtTwo)+ "\n");
                break;
            }
            case 3: {
                int multiOne = getNumberOne();
                int multiTwo = getNumberTwo();
                System.out.println(multiOne + " * " + multiTwo + " = " + (multiOne * multiTwo)+ "\n");
                break;
            }
            case 4: {
                int divOne = getNumberOne();
                int divTwo = getNumberTwo();
                if (divTwo != 0) {
                    System.out.println(divOne + " / " + divTwo + " = " + (double) divOne / divTwo+ "\n");
                    break;
                } else System.out.println("Деление на 0 невозможно"+ "\n");
                break;
            }
            case 5: {
                int degOne = getNumberOne();
                int degTwo = getNumberTwo();
                System.out.println(degOne + " в степени " + degTwo + " = " + Math.pow(degOne, degTwo)+ "\n");
                break;
            }
            case 6: {
                int squOne = getNumberOne();
                int squTwo = getNumberTwo();
                System.out.println("корень" + squTwo + "степени числа " + squOne + " = " + Math.pow(squOne, 1.0 / squTwo)+ "\n");
                break;
            }
            case 7: {
                int sinOne = getNumberOne();
                System.out.println("Sin числа " + sinOne + " = " + Math.sin(sinOne)+ "\n");
                break;
            }
            case 8: {
                int cosOne = getNumberOne();
                System.out.println("Cos числа " + cosOne + " = " + Math.cos(cosOne) + "\n");
                break;
            }
            default:
                System.out.println("Операция не распознана! Повторите ввод.");

        }
    }

    public int getNumberOne(){
        Scanner scanner = new Scanner(System.in);
        Reading n = new Reading();
        System.out.println("Введите число а:");
        int NumberOne = n.setA(scanner.nextInt());
        return NumberOne;
    }

    public int getNumberTwo(){
        Scanner scanner = new Scanner(System.in);
        Reading n = new Reading();
        System.out.println("Введите число b:");
        int NumberTwo = n.setA(scanner.nextInt());
        return NumberTwo;
    }

}
