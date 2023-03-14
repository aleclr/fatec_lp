/**
 * Conta
 */
public class Conta {

    private String nomeTitular;
    private int numeroConta;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    private double sacar(double valor) {
        double novoSaldo;
        novoSaldo = getSaldo() - valor;
        setSaldo(novoSaldo);
        return saldo;
    }

    private double depositar(double valor) {
        double novoSaldo;
        novoSaldo = getSaldo() + valor;
        setSaldo(novoSaldo);
        return saldo;
    }

    private double calcularRendimento() {
        double rendimento;
        rendimento = (getSaldo() * 0.1);
        return rendimento;
    }

}