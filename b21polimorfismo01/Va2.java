package br.com.cursojava.b21polimorfismo01;

public class Va2 extends Va1 {

    // Um método estático pertence à classe e não ao objeto. Portanto, não pode ser herdado!

    /* Quando a classe filha escreve um método com a mesma assinatura que a classe pai, o que está acontecendo é shadowing (sombreamento) e não herança.
    Shadowing permite que vc use os mesmos nomes (polimorfismo estático), mas a funcionalidade não é herdada. */
    public static String getStr() {
        return "0123456789ABCDEF";
    }

    public String ini(String s, int cpr) {
        return s.substring(s.length()-cpr, s.length());
    }

    // MÉTODO para testar:
    public String stringQualquer (String s) {
        return s;
    }

    // ****************************** MAIN **********************************
    // ======================================================================
    public static void main(String[] args) {

        //------------------------------------------------------------------------
        // Para que seja possível acessar as variáveis e os métodos de um objeto é preciso atribuir uma referência ao objeto.

        // Criando a referência ("controle remoto") do tipo Va1 ---> Va1 o; ////// Os "botões" que essa variável possui são getStr, ini, e fin
        Va1 o;
        o = new Va1(); // criando e atribuindo o objeto do tipo Va1 (new Va1();) para a referência 'o' do tipo Va1
        System.out.println("o.getStr() método static ---> " + o.getStr());
                    // executa getStr de Va1

        System.out.println("o.fin( ) ---> " + o.fin(o.getStr(), 5));
                    // executa fin de Va1
                    // Dentro de fin(), executa ini() de Va1
        //------------------------------------------------------------------------


        System.out.println();


        //------------------------------------------------------------------------
        // Com a mesma variável/referência/"controle remoto" 'o' do tipo Va1,
        // podemos usá-la para receber objetos do tipo da subclasse (Va2).
        // Portanto, Va1 que é mais genérico faz referência a Va2 que é mais específico.

        // O "controle remoto" continua sendo 'o' (do tipo Va1, que possui os "botões" getStr, ini, e fin)
        o = new Va2();
        System.out.println("o.getStr() método static ---> " + o.getStr());
                // Va1 possui o "botão" getStr para executar getStr em Va2....porém...getStr é static
                    // ...entào, vai executar getStr de Va1, em vez de getStr de Va2
                    // **** Se getStr NÃO fosse static, conseguiriamos executar getStr de Va2 ****

        System.out.println("o.fin( ) ---> " + o.fin(o.getStr(), 5));
                    // executa fin() de Va1 (Va2 não tem fin(), mas herda o método de Va1)

        // execução de ini dentro de fin (exemplo de variável de referência da superclasse Va1 pode chamar métodos da subclasse Va2):
                // Va1 possui o "botão" ini para executar ini em Va2 (pois quem executa é o objeto)
                // Como o método ini não é static, conseguimos executar o ini de Va2

        //------------------------------------------------------------------------

        System.out.println();


        //------------------------------------------------------------------------
        // cria um objeto do tipo Va2
        // atribui este objeto para uma referencia ("controle remoto") do tipo Va2
        // Este controle possui as funções de getStr e ini
        Va2 o2 = new Va2();
        System.out.println("o2.getStr() método static ---> " + o2.getStr());
                    // executa getStr de Va2

        System.out.println("o2.fin( ) ---> " + o2.fin(o2.getStr(), 5));
                    // executa fin() de Va1 (Va2 não tem fin(), mas herda o método de Va1)
                    // Dentro de fin(), executa ini() de Va2 (pois quem executa é o objeto do tipo Va2)

        //------------------------------------------------------------------------


        Va1 ref = new Va2();
        ref.getStr();
//        ref.stringQualquer(); // a referência (controle remoto) é do tipo Va1, entretanto o objeto é do tipo Va2
                                // que possui um método (stringQualquer() ) que não está disponível no controle
                                // logo, não conseguimos chamar este método.

        Va2 ref2 = new Va2();
        ref2.getStr();
        ref2.stringQualquer(ref2.getStr());


    }


}



