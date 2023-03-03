package customTags;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author patoe
 */
public class tagActividadVacia extends SimpleTagSupport
{
    @Override
    public void doTag() throws IOException
    {
        //Mi nombre Completo :P
        String nombreCompleto = "Patricio Estrada Carreto";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");  //Establece el formato con el cual imprimir la fecha
        LocalDateTime tiempo = LocalDateTime.now(); //Obtiene la fecha de hoy
        JspWriter out = getJspContext().getOut();
        out.print("Mi nombre completo es: " + nombreCompleto + " | La fecha del día de hoy es: " + formato.format(tiempo));
    }
}
