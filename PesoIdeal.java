class  PesoIdeal{
	public static void main(String[] args) throws Exception{
		String nome;
		float p, altura;
		double ph, pm;
		System.out.println("Digite o nome: ");
		nome = JUtil.readString ();
		System.out.println("Digite o peso: ");
		p = JUtil.readFloat ();
		System.out.println("Digite a altura: ");
		altura = JUtil.readFloat ();
		ph = (72.7 * altura) - 58;
		pm = (62.10 * altura) - 44.7;
		System.out.println("Peso ideal homem: "+ph);
		System.out.println("Peso ideal mulher: "+pm);
	}
}
