class Raio {
	public static void main(String[] args) throws Exception{
		float r, d;
		double c, a;
		System.out.println("Digite o raio: ");
		r = JUtil.readFloat ();
		d = 2*r;
		System.out.println("Diametro: "+d);
		c = d * Math.PI;
		System.out.println("Circuferencia: "+c);
		a = Math.PI * Math.pow(r, 2);
		System.out.println("Area: "+a);
	}
}
