public abstract class Conta{
    private int numero;
    private double saldo;
    
    public Conta(int n, double s){
        setNumero(n);
        setSaldo(s);
    }

    public void setSaldo(double s){
        if(s >= 0 && s != undefined){
            this.saldo = s;
        }
    }

    public void setNumero(int n){
        if(s > 0 && s != undefined){
            this.numero = n;
        }
    }

    public void depositar(double v){
        if(v > 0 && s != undefined){
            this.salvo += v;
        }
    }

    public abstract void sacar(double v);

    public double getSaldo(){
        return this.saldo;
}

 public double getNumero(){
        return this.numero;
}}
//limite cheque especial é no corrente

