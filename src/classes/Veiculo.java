package classes;

public class Veiculo {

    private String modelo;
    private String marca;
    private String anoFabricacao;
    private float  potenciaMotor;
    private String placa;
    private String tipoCombustivel;
    private String cor;
    private float  valorBaseLocacao;
    private String observacoes;

    public Veiculo() {}

    public Veiculo(String modelo, String marca, String anoFabricacao, float potenciaMotor, String placa, String tipoCombustivel, String cor, float valorBaseLocacao, String observacoes) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.potenciaMotor = potenciaMotor;
        this.placa = placa;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
        this.valorBaseLocacao = valorBaseLocacao;
        this.observacoes = observacoes;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public float getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(float potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValorBaseLocacao() {
        return valorBaseLocacao;
    }

    public void setValorBaseLocacao(float valorBaseLocacao) {
        this.valorBaseLocacao = valorBaseLocacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}