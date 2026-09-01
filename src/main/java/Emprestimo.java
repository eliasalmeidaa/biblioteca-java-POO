import java.time.LocalDate;

public class Emprestimo {

    private LocalDate dataEmprestimo;
    private  LocalDate dataDevolucao;
    private Usuario usuario;
    private Livro livro;

    public void realizarEmprestimo(LocalDate dataEmprestimo, Usuario usuario, Livro livro){

        if( this.livro.getQuantidadeDisponivel() <= 0){
            System.out.println("Não possui no estoque!!");
        }
        this.livro.setQuantidadeDisponivel(this.livro.getQuantidadeDisponivel() -1);
        this.dataEmprestimo = dataEmprestimo;
        this.usuario = usuario;
        this.livro = this.livro;

        this.livro.setQuantidadeDisponivel(this.livro.getQuantidadeDisponivel() -1);

        System.out.println("Emprestimo realizado!!!");

    }

    public void devolverLivro(LocalDate dataDevolucao, Usuario usuario, Livro livro){
        this.dataDevolucao = dataDevolucao;
        this.usuario = usuario;
        this.livro = livro;

        System.out.println("Livro de volta a biblioteca!!");
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
