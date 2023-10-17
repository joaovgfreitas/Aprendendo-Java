class TransfPar2 {
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
				if (digito%2==0){
					soma = soma + digito;
					System.out.print(digito+" + ");
				}else{
					soma = soma + 0;
				}
			}
			System.out.println("= "+soma);
			System.out.print("Digite um numero: ");
			nint = JUtil.readInt();
		}
	}//Main
}//Classe