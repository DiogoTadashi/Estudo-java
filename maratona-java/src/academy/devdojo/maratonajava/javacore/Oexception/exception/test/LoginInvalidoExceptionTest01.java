package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String user = "admin";
        String password = "admin";
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        if(!user.equals(nome) || !password.equals(senha)){
            throw new LoginInvalidoException("User ou Senha Invalido");
        }

        System.out.println("Login efetuado com sucesso");
    }
}
