    import java.time.LocalDate;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            Usuario usuario = new Usuario();
            Livro livro = new Livro();
            Emprestimo emprestimo = new Emprestimo();

            var opcao=0;

            do {
                System.out.println("1 - Cadastrar usuário");
                System.out.println("2 - Cadastrar livro");
                System.out.println("3 - Realizar empréstimo");
                System.out.println("4- Devolver livro");
                System.out.println("5- Sair");
                System.out.println("Escolha a opção: ");
                opcao = scanner.nextInt();

                switch (opcao){
                    case 1: {
                        System.out.println("Título: ");
                        String titulo = scanner.next();
                        System.out.println("Autor: ");
                        String autor = scanner.next();
                        System.out.println("ISBN: ");
                        String isbn = scanner.next();
                        System.out.println("Ano: ");
                        int ano = scanner.nextInt();
                        System.out.println("Quantidade: ");
                        int qtd = scanner.nextInt();

                        livro.cadastrarLivro(titulo, autor, isbn, ano, qtd);
                        break;
                    }
                    case 2: {
                        System.out.println("Nome: ");
                        String nome = scanner.next();
                        System.out.println("CPF: ");
                        String cpf = scanner.next();
                        System.out.println("Matrícula: ");
                        String matricula = scanner.next();
                        System.out.println("Email: ");
                        String email = scanner.next();

                        usuario.cadastrarUsuario(nome, cpf, matricula, email);
                        break;
                    }
                    case 3: {
                        emprestimo.realizarEmprestimo(LocalDate.now(), usuario, livro);
                        break;
                    }
                    case 4:{
                        emprestimo.devolverLivro(LocalDate.now(), usuario, livro);
                        break;
                    }
                    case 5:{
                        System.out.println("Saindo do sistema...");
                        break;
                    }
                }
            }while (opcao !=0);
        }
    }
