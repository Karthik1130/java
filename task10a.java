import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class task10a extends Applet implements MouseListener {
    String msg = " ";
    public void init(){
        addMouseListener(this);
    }
    public void mouseClickId(MouseEvent obj){
        msg = "Mouse Clicked";
        repaint();
    }
    public void mouseEntered(MouseEvent obj){
        msg = "Mouse entered";
        repaint();
    }    
    public void mouseExited(MouseEvent obj){
        msg = "Mouse exit";
        repaint();
    }
    public void mousePressed(MouseEvent obj){
        msg = "Mouse Pressed";
        repaint();
    }
    public void mouseMoved(MouseEvent obj)
    {
    msg="mouse moved"; 
    repaint();
    }
    public void mouseDragged(MouseEvent obj)
    {
    msg="mouse Dragged"; 
    repaint();
    }
    public void paint(Graphics g){
        Font currentFont=new Font("TimesRoman",Font.BOLD,29); 
        g.setFont(currentFont);
        FontMetrics fm=g.getFontMetrics();
        Dimension d= getSize();
        int xc,yc;
    xc=d.width/2- fm.stringWidth(msg)/2; 
    yc=d.height/2+fm.getDescent();
    g.drawString(msg,xc,yc); 
    setBackground(Color.red);
    }
}
