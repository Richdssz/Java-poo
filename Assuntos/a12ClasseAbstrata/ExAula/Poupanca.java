public class Poupanca extends Conta{


    public Poupanca(int n, double s){
        super(n,s);
    }

    public void sacar(double v){
        if(getSaldo() >= v){
            sacar(v);
        }return;
    };

    public double getLimiteCheque(){
        return this.limiteChequeEspecial;
    }

}