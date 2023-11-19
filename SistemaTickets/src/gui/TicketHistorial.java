package gui;

import clases.TicketClass;
import java.util.Date;

public class TicketHistorial extends Ticket {
    
    final TicketClass ticketClass;
    
    public TicketHistorial(TicketClass ticketClass) {
        this.ticketClass = ticketClass;
        ticketText.setEditable(false);
        ticketText.setText(String.valueOf(ticketClass.idTicket));
        fechaCreacion.setEnabled(false);
        fechaCreacion.setValue(new Date(ticketClass.fechaCreacion));
        riesgoText.setEnabled(false);
        riesgoText.setText(ticketClass.riesgo);
        fechaSolucion.setEnabled(false);
        fechaSolucion.setValue(new Date(ticketClass.fechaSolucion));
        descsolText.setEnabled(false);
        descsolText.setText(ticketClass.descripcionSolucion);
        productoText.setEnabled(false);
        productoText.setText(ticketClass.producto);
        creadoporText.setEnabled(false);
        creadoporText.setText(String.valueOf(ticketClass.creadoPorIdUsuario));
        asignadoaText.setEnabled(false);
        asignadoaText.setText(String.valueOf(ticketClass.asignadoAIdUsuario));
        eliminarButton.setVisible(false);
    }

    @Override
    void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
