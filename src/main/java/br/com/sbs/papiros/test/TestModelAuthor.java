package br.com.sbs.papiros.test;

import br.com.sbs.papiros.model.Author;

import java.time.LocalDate;

public class TestModelAuthor {

    public static void main(String[] args) {

        Author monteiroLobato = new Author(
                "monteiro.lobato@google.com",
                LocalDate.of(1882, 04, 18),
                "Monteiro Lobato",
                "Mini curriculo do Sr. Monteiro Lobato");
        System.out.println(monteiroLobato);

    }
}
