import java.util.Scanner;

public class HelloWord {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Usuário, digite seu nome: ");
        String usuario = entrada.next();

        System.out.print("Bem vindo " + usuario);
    }
}
