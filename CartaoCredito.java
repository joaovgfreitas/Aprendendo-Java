class CartaoCredito {
	public static void main(String[] args) throws Exception {
		String nconta, nome;
		float saldo, cobra, tpag, lim;
		double nsaldo, nlim;
	
		System.out.println("Digite o numero da conta: ");
		nconta = JUtil.readString ();
		System.out.println("Digite o nome: ");
		nome = JUtil.readString ();
		System.out.println("Digite o saldo: ");
		saldo = JUtil.readFloat ();
		System.out.println("Digite todos itens cobrados: ");
		cobra = JUtil.readFloat ();
		System.out.println("Digite total de pagamentos efetuados no mes: ");
		tpag = JUtil.readFloat ();
		System.out.println("Digite o limite: ");
		lim = JUtil.readFloat ();

		nsaldo = saldo + cobra - tpag;
		System.out.println("Novo saldo: R$"+nsaldo);
		nlim = lim - nsaldo;
		if (nsaldo < lim){
			System.out.println("Ainda pode gastar R$"+nlim);
		}else {
			System.out.println("Limite excedido em R$"+nlim);
	}
}
}