package acciones;

import clases.TicketClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TicketAcciones {
    public static void guardarTicket(TicketClass ticketClass) throws SQLException {
       long id = insertarTicket(ticketClass); 
       ticketClass.setID(id);
    }
    
    private static long insertarTicket(TicketClass ticketClass) throws SQLException {
        String sql = "insert into tickets (creadoPorIdUsuario, asignadoAIdUsuario, fechaCreacion, producto, descripcion, riesgo, fechaSolucion, descripcionSolucion) "
                + "values (?,?,?,?,?,?,?,?);";
        PreparedStatement ps = Conexion.PrepareStatement(sql);
        ps.setInt(1, (int) ticketClass.fechaCreacion);
        ps.setString(2, ticketClass.descripcion);
        ps.setString(3, ticketClass.descripcionSolucion);
        ps.setString(4, ticketClass.producto);
        ps.setString(5, ticketClass.riesgo);
        ps.setInt(6, (int) ticketClass.asignadoAIdUsuario);
        ps.setInt(7, (int) ticketClass.creadoPorIdUsuario);
        ps.setInt(8, (int) ticketClass.fechaSolucion);
        int id = 0;
        ps.execute();
        sql = "select last_insert_rowid();";
        ps = Conexion.PrepareStatement(sql, true);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            id = rs.getInt(1);
        }
        
        return id;
        
    }

    public static ArrayList<TicketClass> obtenerTickets() throws SQLException {
        String sql = "select riesgo, fechaCreacion, producto from Ticket ";
        PreparedStatement ps = Conexion.PrepareStatement(sql);
        ArrayList<TicketClass> list = new ArrayList<>();
        try(ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                long fecha = rs.getLong("fechaCreacion");
                String riesgo = rs.getString("riesgo");
                String producto = rs.getString("producto");
                TicketClass ticketClass = new TicketClass(fecha, producto, riesgo);
                list.add(ticketClass);
            }
            
            return list;
        }
    }

    public static void eliminarTicket(TicketClass ticketClass) throws SQLException {
        String sql = "delete from Ticket where riesgo=?";
        PreparedStatement ps = Conexion.PrepareStatement(sql);
        ps.setLong(1, ticketClass.getID());
        ps.execute();
    }
}
