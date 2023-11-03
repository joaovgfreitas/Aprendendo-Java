public class MovimentoCartao {
    public static void main(String[] args) throws Exception{
        CartaoEspecial ce = new CartaoEspecial(1, "joao", 500, 50);
        ce.mostrarDados();
        ce.comprar(50);
        ce.comprar(49);
        ce.comprar(450);
        ce.comprar(50);
        ce.pagar(50);
        ce.comprar(50);
        ce.pagarTudo();
        ce.mostrarDados();
    }
}
