/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customTags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author patoe
 */
public class tagActividadCuerpo extends SimpleTagSupport
{
    StringWriter sw = new StringWriter();
    
    @Override
    public void doTag() throws IOException, JspException
    {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");  //Establece el formato con el cual imprimir la hora
        LocalDateTime hora = LocalDateTime.now(); //Obtiene la fecha de hoy
        getJspBody().invoke(sw);
        getJspContext().getOut().println("La informacion encontrada dentro del cuerpo del tag es: " + "\"" + sw.toString() + "\"" + " | La hora actual es: " + formato.format(hora));
    }
}
