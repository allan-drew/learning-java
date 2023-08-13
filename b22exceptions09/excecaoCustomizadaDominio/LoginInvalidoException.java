package br.com.cursojava.b22exceptions09.excecaoCustomizadaDominio;


// Podemos criar excecoes customizadas
// O tratamento dessas excecoes customizadas pode ser definido de acordo com a lógica de negócio do sistema

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        System.out.println("Login inválido!");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }

}
