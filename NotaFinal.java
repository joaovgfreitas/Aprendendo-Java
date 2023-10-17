class NotaFinal {
	public static void main(String[] args) throws Exception{
		float n1, n2;
		double nf;
		System.out.println("Digite a nota 1: ");
		n1 = JUtil.readFloat ();
		System.out.println("Digite a nota 2: ");
		n2 = JUtil.readFloat ();
		nf = (n1*0.4)+(n2*0.6);
		System.out.println("Nota final: "+nf);
	}
}
