class LerProduto{
	public static void main(String[] args) throws Exception{
		Produto p1 = new Produto();
		float maior = 0, menor = 0;
		System.out.print("Digite o codigo: ");
		p1.codigo = JUtil.readInt();
		while (p1.codigo != 0){
			System.out.print("Digite o nome: ");
			p1.nome = JUtil.readString();
			System.out.print("Digite a quantidade: ");
			p1.quantidade = JUtil.readInt();
			System.out.print("Digite a unidade: ");
			p1.unidade = JUtil.readString();
			System.out.print("Digite o valor unitario: ");
			p1.valunit = JUtil.readFloat();
			if (p1.valunit > maior){
				maior = p1.valunit;
			}
			if (p1.valunit < menor){
				menor = p1.valunit;
			}
		}
	}
}