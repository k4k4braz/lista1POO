public class kaka {
    public static int somar (int a, int b){
        return a + b;
    }
    public static double dividir(int a, int b){
        return a / b;
    }
    public static void main(String[] args){
        int resultado = somar(10, 3);
        System.out.println(resultado);

        double resultdiv = dividir(1,0);
        System.out.println(resultdiv);

    }
}
