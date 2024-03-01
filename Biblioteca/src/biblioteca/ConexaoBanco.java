/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Classes.Livros;
/**
 *
 * @author gsiqueira
 */
public class ConexaoBanco {
 

    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/Biblioteca";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    // Conectar ao banco
    public static Connection abrir() throws Exception {
        
        // Registrar o driver
        Class.forName(DRIVER);
        // Capturar a conexão
        java.sql.Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        // Retorna a conexao aberta
        return conn;


    }

    public void CadastrarLivro(Livros m) {
        // Query SQL para inserção.
        String query = "INSERT INTO Livros(Nome_Livro, Codigo_Livro, Autor_do_Livro) VALUES (?, ?, ?, ?)";
        try (
            // Estabelece uma conexão com o banco.
            Connection conn = getConnection();
            // Cria um PreparedStatement para executar a query.
            PreparedStatement stmt = conn.prepareStatement(query)
        ) {
            // Atribui os valores da pessoa para a query.
            stmt.setInt(1, m.getNome_Livro());
            stmt.setString(2, m.getCodigo_Livro());
            stmt.setString(3, m.getAutor_doLivro());
           
            // Executa a query.
            stmt.execute();
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro.
            throw new RuntimeException(e);
        }
    }
    

}
