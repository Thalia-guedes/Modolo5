package ExercicioQuatro;
public class ExercicioQuatro {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.depositar(50);
        minhaConta.setLimite(300);
        try {
            minhaConta.saca(200);
            System.out.println("Saque realizado com sucesso.");
        } catch (ContaExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public static class ContaExcecao extends Exception {
        private double saldo;

        public ContaExcecao(String mensagem, double saldo) {
            super(mensagem);
            this.saldo = saldo;
        }
        public double getSaldo() {
            return saldo;
        }
    }
    private static class Conta {
        private double saldo;
        private double limite;
        public void depositar(double valor) {
            saldo += valor;
        }
        public void setLimite(double limite) {
            this.limite = limite;
        }
        public void saca(double valor) throws ContaExcecao {
            if (valor > saldo ) {
                throw new ContaExcecao("Saldo insuficiente para saque", saldo);
            }
            saldo -= valor;
        }
    }
}