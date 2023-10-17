class Produto{
	int codigo, quantidade;
	String nome, unidade;
	float valunit;
	double ValorTotal(){
		return quantidade*valunit;
	}
	void mostraDados(){
		System.out.println("Valor Total: "+this.ValorTotal());
	}
}