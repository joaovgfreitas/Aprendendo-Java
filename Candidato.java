class Candidato{
    int numero, votos;
    String nome;
    public void classificado(int votominimo){
		int dif;
		dif = (votos - votominimo);
        if (votos >= votominimo){
            System.out.print("Candidato classificado por "+dif+" votos");
        }else {
            System.out.print("Candidato NAO classificado por "+dif+" votos");
        }
    }
    public void classificado(){
        if (votos>=10){
            System.out.print("Candidato foi classificado!");
        }else {
            System.out.print("Candidato NAO foi classificado!");
        }
    }
	public void mostrardados(){
		System.out.println("Numero: "+this.numero);
		System.out.println("Nome: "+this.nome);
		System.out.println("votos: "+this.votos);
	}
}