class EmpregadoLei extends Empregado{
	public EmpregadoLei(int matricula, String nome, float salarioBase){
		super (matricula, nome, salarioBase);
	}
	/*public void setSalarioBase(float novoSalario){
       if (novoSalario > getSalarioBase()) {
           super.setSalarioBase() = novoSalario;
           System.out.println("Salário atualizado com sucesso!");
       }else {
           System.out.println("O novo salário deve ser maior que o atual.");
       }
    }*/
}