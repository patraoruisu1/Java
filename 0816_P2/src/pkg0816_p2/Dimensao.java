package pkg0816_p2;

public class Dimensao {
    private float v1, v2;
    private String Tipo;
    
    public void setv1(float v1) {
        this.v1=v1;
    }
    public void setv2(float v2) {
        this.v2=v2;
    }
    public void setTipo(String Tipo) {
        this.Tipo=Tipo;
    }
    
    public float getv1() {
        return(this.v1);
    }
    
    public float getv2() {
        return(this.v2);
    }
    
    public String getTipo() {
        return(this.Tipo);
    }
    
    public float Area() {
        if(Tipo.equals("Triangulo")) {
            return(v1*v2/2);
        }
        else {
        return(v1*v2);
        }
    }

}
