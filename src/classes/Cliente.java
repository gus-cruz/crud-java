package classes;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private String endereco;
    private String cpf;
    
    
    public Cliente () {}

    public Cliente(String nome, String sobrenome, String email, String telefone, String endereco, String cpf){

    this.nome = nome;
    this.sobrenome = sobrenome;
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

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
}

