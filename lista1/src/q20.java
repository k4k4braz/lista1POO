import java.util.Scanner;

public class q20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("quanto vc ganha por hora de trabalho? ");
        double ganhohora = input.nextDouble();
        System.out.print("quanto horas vc trabalha no mes? ");
        double horast = input.nextDouble();
        double salarariobruto = ganhohora * horast;
        System.out.printf("%.2f\n", salarariobruto);
        double ir = salarariobruto * 0.11;
        salarariobruto -= ir;
        System.out.printf("%.2f\n", ir);
        double inss = salarariobruto * 0.08;
        salarariobruto -= inss;
        System.out.printf("%.2f\n", inss);
        double sindi = salarariobruto * 0.05;
        salarariobruto -= sindi;
        System.out.printf("%.2f\n", sindi);
        System.out.printf("%.2f\n", salarariobruto);
    }
}
