package Assuntos.A13Overriding.E02;

public class ClienteFidelizacaoEspecial extends ClienteFidelizacao {

    public ClienteFidelizacaoEspecial(String nome, String endereco, InfoCliente infocliente, double b, String v){
        super(nome, endereco, infocliente, b, v);
    }

    @Override 
    public void adicionaBonus(double valorCompra){
        setBonus(getBonus() + (valorCompra * 0.1));
    }
    
    @Override 
    public String toString() {
        return "O cliente especial" + getNome() + " tem R$ " + getBonus() + " de saldo, com validade de: " + getValidade() + "!";
    }
} 
