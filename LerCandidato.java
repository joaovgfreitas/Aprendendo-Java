class LerCandidato{
    public static void main(String[] args) throws Exception{
        int n, votominimo, maisvotado = 0;
		int soma = 0, media = 0;
		String nomemais = "";
        System.out.print("Digite a quantidade de candidatos: ");
        n = JUtil.readInt();
        System.out.print("Digite os votos minimos: ");
        votominimo = JUtil.readInt();
        Candidato candidatos[] = new Candidato[n];
        for(int i=0; i< candidatos.length; i++){
            candidatos[i] = new Candidato();
            System.out.print("Digite o numero do candidato "+(i+1)+": ");
            candidatos[i].numero = JUtil.readInt();
            System.out.print("Digite os votos do candidato "+(i+1)+": ");
            candidatos[i].votos = JUtil.readInt();
            System.out.print("Digite o nome do candidato "+(i+1)+": ");
            candidatos[i].nome = JUtil.readString();
            soma += candidatos[i].votos;
			if (candidatos[i].votos > maisvotado){
				maisvotado = candidatos[i].votos;
				nomemais = candidatos[i].nome;
			}
        }
		for (int j=0; j<candidatos.length; j++){
			System.out.println("");
			/*System.out.println("Candidato "+(j+1)+" nome: "+ candidatos[j].nome);
			System.out.println("Candidato "+(j+1)+" numero: "+ candidatos[j].numero);
			System.out.println("Candidato "+(j+1)+" votos: "+ candidatos[j].votos);*/
			candidatos[j].mostrardados();
			candidatos[j].classificado(votominimo);
			
		}
        media = (soma/candidatos.length);
		System.out.println("");
		System.out.println("Soma dos votos: "+soma);
		System.out.println("Media: "+media);
		System.out.println("Mais votado foi "+nomemais+" com: "+maisvotado+" votos.");
    }
}