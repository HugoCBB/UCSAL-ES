package poo.banco;
public class ContaCorrente {
    private long saldo;

    
    public long getSaldo(){
        if (this.saldo < 0) {
            return 0;
        }
        return this.saldo;
}

}
