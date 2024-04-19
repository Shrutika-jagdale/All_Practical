//applet
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Mouse_Event implements MouseListener,ActionListener
{
    static JFrame frame;
    static JTextField text;
    //Driver function
    public static void main(String[] args)
    {
        //Create a Frame
        frame=new JFrame("Mouse Event");
        frame.setBackground(Color.white);
        frame.setSize(500,500);
        frame.setLayout(null);
        //Create a TextField
        text=new JTextField();
        text.setBounds(0,0,500,50);
        frame.add(text);
        //Create a exit button to close the frame
        JButton exit=new JButton("Exit");
        exit.setBounds(220,235,60,30);
        frame.add(exit);
        //Create an object of the class Mouse_Event
        Mouse_Event obj=new Mouse_Event();
        //Associate MouseListener with the frame
        frame.addMouseListener(obj);
        //Associate ActionListener with button exit
        exit.addActionListener(obj);
        //Display frame
        frame.setVisible(true);
    }
    //function to dispose the frame on click of exit button
    @Override
    public void actionPerformed(ActionEvent e)
    {
        frame.dispose();
    }
    //function to get co-ordinates from where cursor entered the frame
    @Override
    public void mouseEntered(MouseEvent e)
    {
        text.setText("");
        text.setText("Mouse Entered the frame from point ");
        text.setText(text.getText()+e.getX()+" "+e.getY());
    }
    //function to get co-ordinates from where cursor exited the frame
    @Override
    public void mouseExited(MouseEvent e)
    {
        text.setText("");
        text.setText("Mouse Exited the frame from point ");
        text.setText(text.getText()+e.getX()+" "+e.getY());
    }
    //function to get co-ordinates where mouse was released
    @Override
    public void mouseReleased(MouseEvent e)
    {
        text.setText("");
        String button="Right";
        if(e.getButton()==MouseEvent.BUTTON1)
            button="Left";
        text.setText(button+" Button Released at point ");
        text.setText(text.getText()+e.getX()+" "+e.getY());
    }
    //function to get co-ordinates where and which button of mouse was pressed
    @Override
    public void mousePressed(MouseEvent e)
    {
        text.setText("");
        String button="Right";
        if(e.getButton()==MouseEvent.BUTTON1)
            button="Left";
        text.setText(button+" Button Pressed at point ");
        text.setText(text.getText()+e.getX()+" "+e.getY());
    }
    //function to get co-ordinates where and which button of mouse was clicked
    @Override
    public void mouseClicked(MouseEvent e)
    {
        text.setText("");
        String button="Right";
        if(e.getButton()==MouseEvent.BUTTON1)
            button="Left";
        text.setText(button+" Button Clicked at point ");
        text.setText(text.getText()+e.getX()+" "+e.getY());
}
}


//MaouseEvent and change the color
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Message_Mouse extends Frame implements ActionListener
{

    Button red,green,blue;
    Message_Mouse()
        {
            setLayout(new FlowLayout());
            red= new Button("red");
            green= new Button("green");
            blue= new Button("blue");
            add(red);
            add(green);
            add(blue);
red.addActionListener(this);
green.addActionListener(this);
blue.addActionListener(this);
setSize(500,300);
setVisible(true);
        }
        public void actionPerformed(ActionEvent event)
        {
            Color color;
            if(event.getSource()== red)
            {
                color= Color.red;
            }else if(event.getSource()== green)
            {
                color= Color.green;
            }else
            {
                color= Color.blue;
            }
            setBackground(color);
            System.out.println(color);
        }
        public static void main(String[] args)
        {
            new Message_Mouse();
        }
    }
