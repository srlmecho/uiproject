package gui;

import clases.TicketClass;
import java.util.Date;

public class NuevoTicket extends Ticket {
    
    public NuevoTicket() {
        ticketText.setEnabled(true);
        ticketText.setText("");
        fechaCreacion.setEnabled(true);
        riesgoText.setEnabled(true);
        riesgoText.setText("");
        fechaSolucion.setEnabled(true);
        descsolText.setEnabled(true);
        descsolText.setText("");
        productoText.setEnabled(true);
        productoText.setText("");
        creadoporText.setEnabled(true);
        creadoporText.setText("");
        asignadoaText.setEnabled(true);
        asignadoaText.setText("");
        eliminarButton.setVisible(false);
    }
    
    TicketClass getTicketClass(){
        Date fecha = (Date) fechaCreacion.getValue();
        String producto = productoText.getText();
        String riesgo = riesgoText.getText();
        TicketClass ticketClass = new TicketClass(fecha.getTime(), producto, riesgo);
        return ticketClass;
    }

    @Override
    void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
