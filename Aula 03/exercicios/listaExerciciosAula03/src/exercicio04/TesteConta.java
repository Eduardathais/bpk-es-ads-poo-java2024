package exercicio04;

public class TesteConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("99999");

        System.out.println(conta.getNumeroConta());
        System.out.println(conta.getSaldo());
        conta.depositar(500.0);
        conta.sacar(200.0);
        System.out.println(conta.getSaldo());
    }
}
