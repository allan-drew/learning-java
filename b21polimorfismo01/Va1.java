package br.com.cursojava.b21polimorfismo01;

public class Va1 {

    public static String getStr() {
        return "abcdefghijklmnop";
    }

    public String ini(String s, int cpr) {
        return s.substring(0, cpr);
    }

    public String fin(String s, int cpr) {
        return ini(s, cpr) + s.substring(s.length()-cpr, s.length());
    }

}
