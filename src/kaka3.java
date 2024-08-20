public class kaka3 {public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    int num1 = entrada.nextInt();
    int num2 = entrada.nextInt();

    if (num1 > num2) {
        System.out.printf("%d eh maior", num1);
    } else if (num1 < num2) {
        System.out.printf("%d eh maior", num2);
    } else {
        System.out.println("sao iguais");
    }
}

}
}
