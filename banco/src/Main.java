//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente beatriz = new Cliente();
        beatriz.setNome("Beatriz");

        Conta cc = new ContaCorrente(beatriz);
        Conta cp = new ContaPoupanca(beatriz);

        cc.depositar(250);
        cc.transferir(250, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}