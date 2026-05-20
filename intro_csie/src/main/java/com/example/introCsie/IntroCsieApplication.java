package com.example.introCsie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clasa principala a aplicatiei Spring Boot.
 *
 * @SpringBootApplication este o adnotare care combina trei adnotari:
 *   - @Configuration       => clasa poate defini beans Spring
 *   - @EnableAutoConfiguration => Spring Boot configureaza automat aplicatia
 *   - @ComponentScan       => Spring cauta componente in pachetul curent si subpachete
 *
 * Aceasta clasa este punctul de intrare al aplicatiei Spring Boot.
 */
@SpringBootApplication
public class IntroCsieApplication {

    /**
     * Metoda main - punctul de start al aplicatiei.
     * SpringApplication.run() porneste contextul Spring si serverul embedded (ex: Tomcat).
     *
     * @param args - argumente de linie de comanda (optionale)
     */
    public static void main(String[] args) {
        SpringApplication.run(IntroCsieApplication.class, args);
    }
}
