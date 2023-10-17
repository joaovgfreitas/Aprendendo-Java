class  Estacoes{
	public static void main(String[] args) throws Exception{
		String est;
		int i;
		System.out.println("Digite o mes: ");
		i = JUtil.readInt ();
		switch (i){
		case 1:
			case 2:
			case 12:
			est = "Verao";
			break;
		case 3:
			case 4:
			case 5:
			est = "Outono";
			break;
		case 6:
			case 7:
			case 8:
			est = "Inverno";
			break;
		case 9:
			case 10:
			case 11:
			est = "Primavera";
			break;
			default: est = "invalido";
		}
		System.out.println("Estacao: "+est);
	}
}