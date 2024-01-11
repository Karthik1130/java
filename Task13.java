import java.applet.*; 
import java.awt.event.*;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import java.awt.*; 
/*<applet code="task13.class" height=310 width=400></applet>*/ 
public class Task13 extends Japplet 
{ 
    public void init() 
    { 
    Container contentpane=getContentPane(); 
    Contentpane.setLayout(new BorderLayout()); 
    String column[]={"ID","NAME","SAL"};
    String data[][]={
    {"vijay","1234","1234"},
    {"Vinod","3456","3456"}, 
    {"siva","1256","1256"}}; 
    Jtable table = new Jtable(data,column); 
    int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED; 
    int h=ScrollPaneConstants.HORIZANTAL_SCROLLBAR_AS_NEEDED; 
    JScrollPane jsp = new JScrollpane(table,v,h); 
    contentPane.add(jsp,BorderLayout.CENTER); 
} 
}