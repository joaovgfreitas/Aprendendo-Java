class MaiorTres {
	public static void main(String[] args) throws Exception{
		int n1, n2, n3;
		n1 = 1;
		/*System.out.print("Digite o 1 numero: ");
		n1 = JUtil.readInt();
		System.out.print("Digite o 2 numero: ");
		n2 = JUtil.readInt();
		System.out.print("Digite o 3 numero: ");
		n3 = JUtil.readInt();
		System.out.println("Maior eh: "+Math.max(n1,Math.max(n2,n3)));*/
		while(n1!=0){
			System.out.print("Digite o 1 numero: ");
			n1 = JUtil.readInt();
			System.out.print("Digite o 2 numero: ");
			n2 = JUtil.readInt();
			System.out.print("Digite o 3 numero: ");
			n3 = JUtil.readInt();
			System.out.println("Maior eh: "+Math.max(n1,Math.max(n2,n3)));
		}
	}
}
