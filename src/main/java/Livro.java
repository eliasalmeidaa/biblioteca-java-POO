public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private int quantidadeDisponivel;

    public void cadastrarLivro(String titulo, String autor, String isbn, int anoPublicacao, int quantidadeDisponivel){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setIsbn(isbn);
        this.setAnoPublicacao(anoPublicacao);
        this.setQuantidadeDisponivel(quantidadeDisponivel);

        System.out.println("Livro cadastrado com sucesso!!");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}