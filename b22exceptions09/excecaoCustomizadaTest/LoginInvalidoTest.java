package br.com.cursojava.b22exceptions09.excecaoCustomizadaTest;


import br.com.cursojava.b22exceptions09.excecaoCustomizadaDominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest {

    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        //simulando
        Scanner entradaTeclado = new Scanner(System.in);
        String username01BancoDeDados = "Messi";
        String senha01BancoDeDados = "argentina123";

        System.out.println("Digite o usuário: ");
        String usuarioDigitado = entradaTeclado.nextLine();
        System.out.println("Digite a senha: ");
        String senhaDigitada = entradaTeclado.nextLine();

        if (!username01BancoDeDados.equals(usuarioDigitado) || !senha01BancoDeDados.equals(senhaDigitada)) {
            throw new LoginInvalidoException("USUARIO OU SENHA INVÁLIDOS!");
        }

        System.out.println("Usuário logado!");

    }



}
