class NumMenor {
	public static void main(String[] args) throws Exception{
		int n1, n2;
		System.out.print("Digite um numero: ");
		n1 = JUtil.readInt();
		System.out.print("Digite outro numero: ");
		n2 = JUtil.readInt();
		System.out.println("O menor eh: "+Math.min(n1,n2));
	}
}
