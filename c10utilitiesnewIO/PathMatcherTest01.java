package br.com.cursojava.c10utilitiesnewIO;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {

    public static void main(String[] args) {

        // 'glob é uma simplificação das regex:

        Path path01 = Paths.get("pasta_aleatoria/subpasta_aleatoria/file.bkp");
        Path path02 = Paths.get("pasta_aleatoria/subpasta_aleatoria/file.java");
        Path path03 = Paths.get("pasta_aleatoria/subpasta_aleatoria/file.pdf");

        // ver se o path dá um match
        // The * character matches zero or more characters of a name component without crossing directory boundaries.
        // The ** characters matches zero or more characters crossing directory boundaries.
        matches(path01, "glob:**.bkp"); // true
        matches(path02, "glob:**.bkp"); // false
        matches(path03, "glob:**.bkp"); // false

        matches(path01, "glob:**.java"); // false
        matches(path02, "glob:**.java"); // true
        matches(path03, "glob:**.java"); // false

        matches(path01, "glob:**.pdf"); // false
        matches(path02, "glob:**.pdf"); // false
        matches(path03, "glob:**.pdf"); // true

        System.out.println("-------------------------------------------");

        // procurando OU bkp OU java OU pdf
        // usando o agrupamento com {} sem espaços após a vírgula
        matches(path01, "glob:**/*.{bkp,java,pdf}"); // true
        matches(path01, "glob:**/*.{java,pdf}"); // false, pois no path01 o que tem é .bkp

        System.out.println("-------------------------------------------");

        // procurando extensao com exatas 4 letras
        matches(path01, "glob:**/*.????"); // false
        matches(path02, "glob:**/*.????"); // true, poois java tem 4 letras
        matches(path03, "glob:**/*.????"); // false


        System.out.println("-------------------------------------------");

        // Procurando nome específico de arquivo
        matches(path01, "glob:**/file.java"); // false
        matches(path02, "glob:**/file.java"); // true, pois no path02 tem file.java
        matches(path03, "glob:**/file.java"); // false


    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + " ==> " + matcher.matches(path));
    }

}
