package br.com.sbs.papiros.model;

import java.time.LocalDate;

public class Author {

    private String email;
    private LocalDate birthDate;
    private String name;
    private String miniResume;

    public Author(String email, LocalDate birthDate, String name, String miniResume) {
        this.email = email;
        this.birthDate = birthDate;
        this.name = name;
        this.miniResume = miniResume;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public String getMiniResume() {
        return miniResume;
    }

    @Override
    public String toString() {
        return "Author -> [" +
                "email = '" + email + '\'' +
                ", birthDate = " + birthDate +
                ", name = '" + name + '\'' +
                ", miniResume = '" + miniResume + '\'' +
                ']';
    }
}
