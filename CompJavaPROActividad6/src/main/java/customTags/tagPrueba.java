/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customTags;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 *
 * @author patoe
 */
public class tagPrueba extends SimpleTagSupport
{
    @Override
    public void doTag() throws IOException
    {
        JspWriter out = getJspContext().getOut();
        out.print("Hola Mundo!");
    }
}
