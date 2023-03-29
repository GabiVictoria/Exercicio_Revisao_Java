import java.util.Scanner;
public class exerciciov {
    static double m[][] = new double[4][4];
    static double v[][] = new double[4][4];
    static Scanner ler = new Scanner(System.in);
    static int i, j, opcao;
    static String []nomes = new String[3];
    public static void main(String[] args) {
        for (i = 0; i < 3; i++) {
            System.out.println("Escreva o " + (i+1) + "° nome:");
            nomes[i] = ler.nextLine();
        }
        nome();
        for (i=0;i<4;i++){
        System.out.println("Digite um valor inteiro de opcao");
        opcao = ler.nextInt();
        verifica();
        }
        for (i = 1; i <= 3; i++) {
            System.out.println("Escreva o " + i + "° numero:");
            v[i][i] = ler.nextInt();
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (i == 0 && j != 0) {
                    m[i][j] = v[j][j];
                } else if (j == 0 && i != 0) {
                    m[i][j] = v[i][i];
                } else if (i != j) {
                    m[i][j] = v[i][i] - v[j][j];
                }else if (i==j && i!=0){
                    m[i][j] = v[i][i] * v[j][j];
                }
                    else {
                    m[0][0] = 0.0;
                }
            }
        }
        matriz();
    }
    private static void nome (){
        System.out.println(" Os nomes digitados foram:");
        for (i = 0; i < 3; i++) {
            System.out.print(nomes[i] + " ");
        }
        System.out.println();
    }
    public static void verifica(){
        if (opcao==0){
            System.out.println("Opcao invalida!");
        }
        else if (opcao==1){
            System.out.println(nomes[0]);
        }
        else if ((opcao>1) && (opcao<=10) ){
            System.out.println(nomes[1]);
        }
        else {
            System.out.println(nomes[2]);
        }
    }
    public static void matriz(){
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(m [i][j] + " ");
            }
            System.out.println();
        }
    }
}
