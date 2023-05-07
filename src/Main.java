import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usuario = "Gerente2023";
        String senha = "Gerente_2023*%";
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o usuario: ");
        String usuarioDigitado = sc.nextLine();
        System.out.print("Digite a senha:");
        String senhaDigitada = sc.nextLine();
        if (!usuarioDigitado.equals(usuario) && !senhaDigitada.equals(senha)) {
            System.out.println("Usuário ou senha invalido!");
        } else {
            try {
                LocalDateTime horarioLogin = LocalDateTime.now();
                FileWriter fileWriter = new FileWriter("loginHorario.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(String.valueOf(horarioLogin) + "\n");
                bufferedWriter.close();
                System.out.println("Login realizado com Sucesso");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}