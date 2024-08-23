public interface IConta {

    void sacar(double saldo);

    void depositar(double saldo);

    void transferir(double saldo, Conta contaDestino);

    void imprimirExtrato();
}
