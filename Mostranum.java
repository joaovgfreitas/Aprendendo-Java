class Mostranum{
	public static void main(String[] args) throws Exception{
		int n, i, x;
		System.out.print("Digite um numero: ");
		n = JUtil.readInt ();
		i = 1;
		x = 0;
		while((i<=n)&&(x!=1)){
			System.out.print(i+", ");
			if (i%5==0){
				System.out.println("");
			}if (i%10==0){
				System.out.println("Deseja parar? 0 para sim, 1 para nao");
				x = JUtil.readInt ();
				
		}
		i++;
	}
}
}