class Raizquarta {
	public static void main(String[] args) throws Exception{
		int x;
		double r;
		System.out.print("Digite um numero: ");
		x = JUtil.readInt();
		r = (Math.sqrt(Math.sqrt(x)));
		System.out.println("Resultado: "+r);
	}
}
