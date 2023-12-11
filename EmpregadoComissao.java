class EmpregadoComissao extends EmpregadoLei{
	private int comissao;

	public EmpregadoComissao(int matricula, String nome, float salarioBase, int comissao){
		super(matricula, nome, salarioBase);
		this.comissao = comissao;
	}
	public int getComissao(){
		return this.comissao;
	}
	public void setComissao(){
		this.comissao = comissao;
	}

	public double salarioLiquido(float vendas){
		return (super.salarioLiquido() + (vendas * (comissao/100)));
	}

	public void mostrarDados(){
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Nome: "+getNome());
		//System.out.println("Salario Base: "+getSalarioBase());
		//Não sei como vai ficar a questão do salario base ainda.
		System.out.println("INSS: 0.11");
		System.out.println("Comissao: "+this.comissao);
	}
}