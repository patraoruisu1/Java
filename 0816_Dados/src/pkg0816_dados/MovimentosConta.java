package pkg0816_dados;

public class MovimentosConta {
    private int NumeroMovimento;
    private String DataMovimento, TipoMovimento;
    private float ValorMovimento;

    public MovimentosConta(int NumeroMovimento, String DataMovimento,
            String TipoMovimento, float ValorMovimento){
        this.NumeroMovimento=NumeroMovimento;
        this.DataMovimento=DataMovimento;
        this.TipoMovimento=TipoMovimento;
        this.ValorMovimento=ValorMovimento;
    }
    public int getNumeroMovimento() {
        return NumeroMovimento;
    }

    
    public void setNumeroMovimento(int NumeroMovimento) {
        this.NumeroMovimento = NumeroMovimento;
    }

    
    public String getDataMovimento() {
        return DataMovimento;
    }

    
    public void setDataMovimento(String DataMovimento) {
        this.DataMovimento = DataMovimento;
    }

    
    public String getTipoMovimento() {
        return TipoMovimento;
    }

    
    public void setTipoMovimento(String TipoMovimento) {
        this.TipoMovimento = TipoMovimento;
    }

    
    public float getValorMovimento() {
        return ValorMovimento;
    }

    
    public void setValorMovimento(float ValorMovimento) {
        this.ValorMovimento = ValorMovimento;
    }
    
    
}