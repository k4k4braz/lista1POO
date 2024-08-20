public class kaka5 {public static void main(String[] args) {

    char[] nome = new char[4];

    nome[0] = 'k';
    nome[1] = 'a';
    nome[2] = 'u';
    nome[3] = 'e';

    for (int index = 0; index < nome.length; index++) {
        System.out.print(nome[index]);
    }

    for (int index = nome.length - 1; index >= 0; index--) {
        System.out.print(nome[index]);
    }
    System.out.println("\n");
    for (int index = nome.length - 1; index >= 0; index--) {
        System.out.print(nome[index]);
    }
    System.out.println("\n");
    System.out.println("while");
    while (true)

        if (count == nome.length){
            break;
        }
    System.out.print(nome[count]);
    count++;
}
    System.out.println("\nfor infinito");
    count = 0;
    for (;;)

    {
        if (count == nome.length) {
            break;
        }
        System.out.print(nome[count]);
        count++;
    }
}
}
