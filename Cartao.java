abstract class Cartao {
    private int ncartao;
    private String nome;
    private float limite, saldo;

    public Cartao(int ncartao, String nome, float limite){
        this.ncartao = ncartao;
        this.nome = nome;
        this.limite = limite;
        this.saldo = 0;
    }
    public int getNcartao(){
        return this.ncartao;
    }
    public void setNcartao(){
        this.ncartao = ncartao;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    public float getLimite(){
        return this.limite;
    }
    public void setLimite(){
        this.limite = limite;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public boolean autorizar(float valor){
        return (valor + this.saldo <= this.limite);
    }
    public void comprar(float valor){
        if (autorizar(valor)){
            this.saldo = saldo + valor;
        }else {
            System.out.println("Erro! Compra nao efetuada.");
        }
    }
    public void pagar(float valor){
        this.saldo = saldo - valor;
    }
    public void mostrarDados(){
        System.out.println("Numero: "+this.ncartao);
        System.out.println("Nome: "+this.nome);
        System.out.println("Limite: "+this.limite);
        System.out.println("Saldo: "+this.saldo);
    }
}