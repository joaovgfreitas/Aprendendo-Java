public class LerRetangulo {
    public static void main(String[] args) throws Exception{
        Retangulo r1 = new Retangulo(4, 5);
        float baset, alturat;
        System.out.println("Dados no Retangulo");
        do{
            System.out.print("Informe a base: ");
            baset = JUtil.readFloat();
            r1.setBase(baset);
            System.out.print("Informe a Altura: ");
            alturat = JUtil.readFloat();
            r1.setAltura(alturat);
            System.out.println("Base eh: "+baset);
            System.out.println("Altura eh: "+alturat);
        }while(r1.getBase() !=0);
    }
}