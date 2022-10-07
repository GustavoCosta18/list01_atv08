import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com seu valor/hora: ");
        int valor_hora = sc.nextInt();
        System.out.println("");
        System.out.print("Entre com a quantidade de horas trabalhadas no mês: ");
        int horas_mes = sc.nextInt();
        sc.close();

        int salario_mes = valor_hora * horas_mes;
        System.out.println("O valor do seu salário esse mês é: " + salario_mes);
    }
}