package br.com.cursojava.c05utilitiestime;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {

    public static void main(String[] args) {

        // Instant
        Instant now = Instant.now(); // zulu time
        System.out.println(now);

        // LocalDateTime
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

    }

}
