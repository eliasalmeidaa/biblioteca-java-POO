import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        var usuario = new Usuario();
        usuario.cadastrarUsuario("Elias", "111111111", "22020002", "elias@gmail");

        var livro = new Livro();
        livro.cadastrarLivro("Java this good", "Elias Martins", "34374361", 21/ 7 /2007,1000);

        var emprestimo = new Emprestimo();
        emprestimo.realizarEmprestimo(LocalDate.now(), usuario, livro);

        emprestimo.devolverLivro(LocalDate.of(2026, 12, 21), usuario, livro);
    }
}