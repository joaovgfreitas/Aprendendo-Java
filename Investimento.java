class Investimento {
	public static void main(String[] args) throws Exception{
		int n, i;
		float p, r;
		double x, a;

		System.out.println("Digite o valor do investimento inicial: ");
		p = JUtil.readFloat ();
		System.out.println("Digite a taxa de juros");
		r = JUtil.readFloat ();
		System.out.println("Digite a quantidade de anos: ");
		n = JUtil.readInt ();
		x = 1 + (r/100);

		for (i=1; i<=n; i++){
			a = p * (Math.pow(x,i));
			System.out.println("Dinheiro total no ano "+i+": R$"+a);
		}
	}
}