public class Retangulo {
    private float base, altura;

    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void setBase (float base){
        this.base = base;
    }
    public void setAltura (float altura){
        this.altura = altura;
    }

    public float getBase(){
       return (this.base); 
    }
    public float getAltura(){
        return (this.altura);
    }
    
}