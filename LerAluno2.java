class LerAluno2{
	public static void main(String[] args) throws Exception{
		int n;
		float menormedia = 9999, maiormedia = 0, somamedias = 0, mediam = 0;
		String alunomaior = "", alunomenor = "";
		System.out.print("Digite a quantidade de alunos: ");
		n = JUtil.readInt();
		Aluno alunos[] = new Aluno[n];
		for (int i=0; i<alunos.length; i++){
			float m;
			alunos[i] = new Aluno();
			System.out.print("Digite o nome do aluno"+(i+1)+": ");
			alunos[i].nome = JUtil.readString();
			System.out.print("Digite a nota 1: ");
			alunos[i].n1 = JUtil.readFloat();
			System.out.print("Digite a nota 2: ");
			alunos[i].n2 = JUtil.readFloat();
			System.out.print("Digite a nota 3: ");
			alunos[i].n3 = JUtil.readFloat();
			m = alunos[i].media();
			somamedias += m;
			if (alunos[i].media() > maiormedia){
				maiormedia = alunos[i].media();
				alunomaior = alunos[i].nome;
			}
			if (alunos[i].media() < menormedia){
				menormedia = alunos[i].media();
				alunomenor = alunos[i].nome;
			}
			
		}//for
		mediam = (somamedias/(alunos.length));
		//System.out.println("media 1: "+alunos[0].media());
		//System.out.println("media 2: "+alunos[1].media());
		//System.out.println("Soma medias: "+somamedias);
		System.out.println("A media das medias foi: "+mediam);
		System.out.println("O aluno com maior media foi "+alunomaior+" com "+maiormedia);
		System.out.println("O aluno com menor media foi "+alunomenor+" com "+menormedia);
	}//main
}//clase 