class Aluno {
	int codigo;
	float n1, n2, n3;
	String nome;

	public float media(){
		return ((n1+n2+n3)/3);
	}
	public float media(int p1, int p2, int p3){
		return (((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3));
	}
	
}