class  Leitura2{
	public static void main(String[] args) throws Exception{	
		String nome;
		int idade;
		float renda;
		System.out.println("Digite o nome: ");
		nome = JUtil.readString ();
		System.out.println("Digite a idade: ");
		idade = JUtil.readInt ();
		System.out.println("Seu nome: "+nome);
		System.out.println(idade);
	}
}
