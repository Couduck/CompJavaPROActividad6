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

/**
 *
 * @author patoe
 */
public class tagCuerpo extends SimpleTagSupport{
    
    StringWriter sw = new StringWriter();
    
    @Override
    public void doTag() throws IOException, JspException
    {
        getJspBody().invoke(sw);
        getJspContext().getOut().println("Este es un saludo de " + sw.toString());
    }
}
