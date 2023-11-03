class ProdutoCustoMedio extends Produto2{
	public ProdutoCustoMedio(int codigo, String nome, float quantidade, float custo){
		super(codigo, nome, quantidade, custo); 
	}
	public void repor(int qntrep, float custoalt){
		super.setCusto(
			((super.getQuant() * super.getCusto()) + (qntrep * custoalt))/(super.getQuant() + qntrep) 
			);
		super.repor(qntrep, custoalt);
	}
}