class ProdutoCustoAtual extends Produto2{
	public ProdutoCustoAtual(int codigo, String nome, float quantidade, float custo){ // Construtor
		super(codigo, nome, quantidade, custo); 
	}
	public void repor(int qntrep, float custoalt){
		super.setCusto(custoalt);
		super.repor(qntrep, custoalt);
	}
}