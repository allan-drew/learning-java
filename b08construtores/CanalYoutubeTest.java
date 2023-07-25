package br.com.cursojava.b08construtores;

public class CanalYoutubeTest {

    public static void main(String[] args) {

        CanalYoutube canal001 = new CanalYoutube("FLAMENGO TV", 2006);
        System.out.println(canal001.getNomeDoCanal());
        System.out.println(canal001.getAnoDeCriacao());

        System.out.println("----------------------------------------");

        CanalYoutube canal002 = new CanalYoutube();
        canal002.setNomeDoCanal("Avioes E Musica");
        canal002.setAnoDeCriacao(2010);

        System.out.println(canal002.getNomeDoCanal());
        System.out.println(canal002.getAnoDeCriacao());

        System.out.println("----------------------------------------");

        CanalYoutube canal003 = new CanalYoutube("DevDojo", 2016, 55000);
        System.out.println(canal003.getNomeDoCanal());
        System.out.println(canal003.getAnoDeCriacao());
        System.out.println(canal003.getNumInscritos());


        System.out.println("----------------------------------------");
        //Como mantivemos os setters, então NESTE CASO, estamos deixando os atributos serem alterados
        // por exemplo, o canal do flamengo que foi criado no construtor com o nome de FLAMENGO TV
        // agora tem o nome de FLA TV
        canal001.setNomeDoCanal("FLA TV");
        System.out.println(canal001.getNomeDoCanal());
        System.out.println(canal001.getAnoDeCriacao());

        System.out.println("----------------------------------------");



    }

}
