package clases;

public class TicketClass {
    public long idTicket;
    public final long fechaCreacion;
    public final String producto;
    public long creadoPorIdUsuario;
    public long asignadoAIdUsuario;
    public String descripcion;
    public long fechaSolucion;
    public String descripcionSolucion;
    public String riesgo;

    public TicketClass(long fechaCreacion, String producto, String riesgo) {
        this.fechaCreacion = fechaCreacion;
        this.producto = producto;
        this.riesgo = riesgo;
    }
    
    public void setID(long idTicket){
        this.idTicket = idTicket;
    } 
    
    public long getID(){
        return idTicket;
    }
}
