abstract class Empregado{
	private int matricula;
	private String nome;
	private float salarioBase;

	public Empregado(int matricula, String nome, float salarioBase){
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public int getMatricula(){
		return this.matricula;
	}
	public void setMatricula(){
		this.matricula = matricula;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(){
		this.nome = nome;
	}
	public float getSalarioBase(){
		return this.salarioBase;
	}
	public void setSalarioBase(){
		this.salarioBase = salarioBase;
	}

	public double salarioLiquido(){
		return (this.salarioBase * (1-0.11));
	}

	public void mostrarDados(){
		System.out.println("Matricula: "+this.matricula);
		System.out.println("Nome: "+this.nome);
		System.out.println("Salario Base: "+this.salarioBase);
	}
}  