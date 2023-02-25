package pilares.entities;

public abstract class Celular {
    private double tamanho;
    private String cor;
    private String marca;
    private String senha;
    private int valorBase;
    public Celular(double tamanho, String cor, String marca, String senha) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
        this.senha = senha;
        this.valorBase = 2000;
    }

    public void liga(){
        System.out.println("Ligado");
    }

    //getters -> get, recuperar
    //setters -> set, definir


    public double getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void desbloquear(String senha){
        if(validaSenha(senha))
            System.out.println("pilares.entities.Celular desbloqueado com sucesso!");
        else
            System.out.println("Senha inválida");
    }

    public double getPreco(){
        return valorBase;
    }
    private boolean validaSenha(String senha){
        return this.senha.equals(senha);
    }

    protected int getValorBase(){
        return this.valorBase;
    }
}
