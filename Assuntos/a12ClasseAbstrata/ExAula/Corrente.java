public class Corrente extends Conta{
  private double limiteChequeEspecial;

    public Corrente(int n, double s, double v){
        super(n,s);
        setLimiteCheque(v);
    }

    public void sacar(double v){
        if((getSaldo() + getLimiteCheque()) >= v){
            sacar(v);
        }return;
    };

    public double getLimiteCheque(){
        return this.limiteChequeEspecial;
    }

    public void setLimiteCheque(double v){
        this.limiteChequeEspecial = v;
    }

}