package classes;

public class Funcionario {
    
    private String nome;
    private String sobrenome;
    private String cargo;
    private double salario;
    private String telefone;
    private String email;
    private String endereco;
    private String cpf;

    public Funcionario() {}

    public Funcionario(String nome, String sobrenome, String cargo, double salario, String telefone, String email, String endereco, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cargo = cargo;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
       
}
