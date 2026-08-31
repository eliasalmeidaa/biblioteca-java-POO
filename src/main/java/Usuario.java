public class Usuario {

    private String nome;
    private String cpf;
    private String matricula;
    private String email;

    public void cadastrarUsuario(String nome, String cpf, String matricula, String email){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setMatricula(matricula);
        this.setEmail(email);

        System.out.println("Usuario cadastrado com sucesso!!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}