class TransfNum2 {
	public static void main(String[] args) throws Exception{
		int nint;
		String nstring;
		System.out.print("Digite um numero: ");
		nint = JUtil.readInt();
		while(nint != 0){
			int i, soma = 0;
			nstring = Integer.toString(nint);
			for (i=0; i < nstring.length(); i++){
				int digito = Character.getNumericValue(nstring.charAt(i));
				soma = soma + digito;
				System.out.print(digito+" + ");
			}
			System.out.println("= "+soma);
			System.out.print("Digite um numero: ");
			nint = JUtil.readInt();
		}
	}//Main
}//Classe