class Mostranum2{
	public static void main(String[] args) throws Exception{
		int n, i;
		System.out.print("Digite um numero: ");
		n = JUtil.readInt ();
		i = 0;
		do{
			i++;
			System.out.print(i+" ");
			if (i%5==0){
				System.out.println("");
			}
			if (i%10==0){

			}
		}
		while (i<n);
	}
}