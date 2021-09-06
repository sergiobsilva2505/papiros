package br.com.sbs.papiros.dao;

import br.com.sbs.papiros.model.Author;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AuthorsDao {

    private Connection connection;

    public AuthorsDao(Connection connection) {
        this.connection = connection;
    }

    public void save(Author author){

        String insertSql = "INSERT INTO authors(birthDate, name, miniResume, email) VALUES (?,?,?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSql)) {
            preparedStatement.setDate(1, Date.valueOf(author.getBirthDate()));
            preparedStatement.setString(2, author.getName());
            preparedStatement.setString(3, author.getMiniResume());
            preparedStatement.setString(4, author.getEmail());

            preparedStatement.execute();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Author> list() {

        String selectSql = "SELECT * FROM authors";
        List<Author> authors = new ArrayList<>();

        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSql)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {

                    LocalDate birthDate = resultSet.getDate("birthDate").toLocalDate();
                    String name = resultSet.getString("name");
                    String miniResume = resultSet.getString("miniResume");
                    String email = resultSet.getString("email");

                    Author author = new Author(email, birthDate, name, miniResume);
                    authors.add(author);
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return authors;
    }
}
