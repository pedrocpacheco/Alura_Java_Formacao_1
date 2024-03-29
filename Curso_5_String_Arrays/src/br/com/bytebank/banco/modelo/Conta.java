package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura (Classe Abstrata) de uma Conta.
 * 
 * @author Pedro
 *
 */
public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta() {
    	
    }
    
    /**
     * Construtor da Classe Conta. Além de Construir a Conta com 2 parametros diretamente, ele:
     * <ul> 
     * 	<li>É responsavel por trackear o número total de Contas Criadas</li>
     * 	<li>Imprimir o número da Conta que acabou de ser criada</li>
     * </ul>  
     *
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
        	throw new SaldoInsuficienteException("Saldo " + this.saldo + ", Valor: " + valor);
        } 
        
        this.saldo -= valor;
    }

    /**
     * Transfere um valor de um objeto Conta para outro.
     * Valor transferido não pode ser maior do que saldo da Conta que transfere
     * @param valor
     * @param destino
     * @throws SaldoInsuficienteException
     */
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    
    @Override
    public String toString() {

    	return "Conta do Tipo - ";
    }

}