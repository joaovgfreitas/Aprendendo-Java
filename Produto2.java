abstract class Produto2{
	private int codigo;
	private String nome;
	private float quantidade, custo;
	
	public Produto2(int codigo, String nome, float quantidade, float custo){ //Construtor
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.custo = custo;
	}
	public int getCodigo(){ //Codigo
		return this.codigo;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public String getNome(){ //Nome
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public float getQuant(){ //Quantidade
		return this.quantidade;
	}
	public float getCusto(){ //Custo
		return this.custo;
	}
	public void setCusto(float custo){
		this.custo = custo;
	}
	
	public float getValorEstoque(){
		return (quantidade*custo);
	}
	public void repor(int qntrep, float custo){
		this.quantidade = quantidade + qntrep;
	}
	public boolean validarSaldo(int qntdtemp){
		return (this.quantidade >= qntdtemp);		
	}
	public void baixar(int qntdtemp){
		if (validarSaldo(qntdtemp)){
			this.quantidade = quantidade - qntdtemp;
		}else {
			System.out.println("Erro! Nao eh possivel efetuar a baixa.");
		}
	}
	public void mostrarDados(){
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Nome: "+this.nome);
		System.out.println("Quantidade: "+this.quantidade);
		System.out.println("Custo: "+this.custo);
		System.out.println("Valor Estoque: "+this.getValorEstoque());
	}

}