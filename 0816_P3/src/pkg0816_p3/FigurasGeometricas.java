package pkg0816_p3;

public class FigurasGeometricas {
    private float N1, N2;
    private String Tipo;
    
    // método construtor
    public FigurasGeometricas(float N1, float N2, String Tipo){
        this.N1=N1;
        this.N2=N2;
        this.Tipo=Tipo;
    }
    
    public float Area(){
        if(getTipo().equals("Triângulo")){
            return(getN1()*getN2()/2);
        }
        else{
           return(getN1()*getN2()); 
        }
    }

    /**
     * @return the N1
     */
    public float getN1() {
        return N1;
    }

    /**
     * @param N1 the N1 to set
     */
    public void setN1(float N1) {
        this.N1 = N1;
    }

    /**
     * @return the N2
     */
    public float getN2() {
        return N2;
    }

    /**
     * @param N2 the N2 to set
     */
    public void setN2(float N2) {
        this.N2 = N2;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
}