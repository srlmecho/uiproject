package gui;

import acciones.TicketAcciones;
import clases.TicketClass;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TicketVisualizar extends Ticket {
    
    final TicketClass ticketClass;
    
    public TicketVisualizar(TicketClass ticketClass) {
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
        eliminarButton.setVisible(true);
    }

    @Override
    void eliminar() {
        try {
            TicketAcciones.eliminarTicket(ticketClass);
            sistematickets.SistemaTickets.principal.eliminarTicket(this);
        } catch (SQLException ex) {
            Logger.getLogger(TicketVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
