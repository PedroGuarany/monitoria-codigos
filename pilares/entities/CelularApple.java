package pilares.entities;

public class CelularApple extends Celular{

    private String emailICloud;
    public CelularApple(double tamanho, String cor, String marca, String senha, String emailICloud) {
        super(tamanho, cor, marca, senha);
        this.emailICloud = emailICloud;
    }

    public String getEmailICloud() {
        return emailICloud;
    }

    @Override
    public double getPreco(){
        return this.getValorBase() * 3;
    }
}
