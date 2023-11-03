class CartaoEspecial extends Cartao{
    private float vminimo;

    public CartaoEspecial(int ncartao, String nome, float limite, float vminimo){
        super(ncartao, nome, limite);
        this.vminimo = vminimo;
    }
    public float getVminimo(){
        return vminimo;
    }
    public void setVminimo(){
        this.vminimo = vminimo;
    }

    public void comprar(float valor){
        if (valor>= this.vminimo) {
            super.comprar(valor);
        }else{
            System.out.println("Erro! valor nao permitido.");
        }
    }
    public void pagarTudo(){
        super.pagar(this.getSaldo());
    }
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Valor minimo: "+this.vminimo);
    }
}