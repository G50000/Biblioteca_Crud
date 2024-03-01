/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;
import java.util.Scanner;
import Biblioteca.ConexaoBanco;
/**
 *
 * @author gsiqueira
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
  
  
  
 Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do livro:");
        String NomeLivro = scanner.nextLine();
        ConexaoBanco c = new ConexaoBanco();
        c.CadastrarLivro(scanner);
       
        System.out.println("Codigo do livro:");
        String CodigoLivro = scanner.nextLine();
        
        System.out.println("Codigo do livro:");
        String LivroAutor = scanner.nextLine();

  
  System.out.printf("Nome do livro",NomeLivro,"Codigo do livro",CodigoLivro,"Autor do livro",LivroAutor);
    }
    
}

   