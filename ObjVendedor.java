public class ObjVendedor{
    private int VentaMes;
    private String Nombre;
    private int NumeroCell;
    private int Enero;
    private int Febrero;
    private int Marzo;
    private int Abril;
    private int Mayo;
    private int Junio;
    private int Julio;
    private int Agosto;
    private int Septiembre;
    private int Octubre;
    private int Noviembre;
    private int Diciembre;

    

    public ObjVendedor(int ventaMes, String nombre, int numeroCell, int enero, int febrero, int marzo, int abril,
            int mayo, int junio, int julio, int agosto, int septiembre, int octubre, int noviembre, int diciembre) {
        VentaMes = ventaMes;
        Nombre = nombre;
        NumeroCell = numeroCell;
        Enero = enero;
        Febrero = febrero;
        Marzo = marzo;
        Abril = abril;
        Mayo = mayo;
        Junio = junio;
        Julio = julio;
        Agosto = agosto;
        Septiembre = septiembre;
        Octubre = octubre;
        Noviembre = noviembre;
        Diciembre = diciembre;
    }

    public ObjVendedor() {
    }

    public int getVentaMes() {
        return VentaMes;
    }
    public void setVentaMes(int ventaMes) {
        VentaMes = ventaMes;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getNumeroCell() {
        return NumeroCell;
    }
    public void setNumeroCell(int numeroCell) {
        NumeroCell = numeroCell;
    }

    public int getEnero() {
        return Enero;
    }

    public void setEnero(int enero) {
        Enero = enero;
    }

    public int getFebrero() {
        return Febrero;
    }

    public void setFebrero(int febrero) {
        Febrero = febrero;
    }

    public int getMarzo() {
        return Marzo;
    }

    public void setMarzo(int marzo) {
        Marzo = marzo;
    }

    public int getAbril() {
        return Abril;
    }

    public void setAbril(int abril) {
        Abril = abril;
    }

    public int getMayo() {
        return Mayo;
    }

    public void setMayo(int mayo) {
        Mayo = mayo;
    }

    public int getJunio() {
        return Junio;
    }

    public void setJunio(int junio) {
        Junio = junio;
    }

    public int getJulio() {
        return Julio;
    }

    public void setJulio(int julio) {
        Julio = julio;
    }

    public int getAgosto() {
        return Agosto;
    }

    public void setAgosto(int agosto) {
        Agosto = agosto;
    }

    public int getSeptiembre() {
        return Septiembre;
    }

    public void setSeptiembre(int septiembre) {
        Septiembre = septiembre;
    }

    public int getOctubre() {
        return Octubre;
    }

    public void setOctubre(int octubre) {
        Octubre = octubre;
    }

    public int getNoviembre() {
        return Noviembre;
    }

    public void setNoviembre(int noviembre) {
        Noviembre = noviembre;
    }

    public int getDiciembre() {
        return Diciembre;
    }

    public void setDiciembre(int diciembre) {
        Diciembre = diciembre;
    }


    
}