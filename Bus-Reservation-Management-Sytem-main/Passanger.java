/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse110project;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Passanger
{
    JFrame f = new JFrame("User Interface");
    Font fh=new Font("Trebuchet MS",Font.BOLD,20);
    Cursor cr = new Cursor(Cursor.HAND_CURSOR);
    JLabel bg =new JLabel();
    JButton a = new JButton("Booking Ticket");
    JButton b = new JButton("Cancel Ticket");
    JButton c = new JButton("Ticket Price");
    JButton d = new JButton("Logout");
    public Passanger()
    {

        ImageIcon img= new ImageIcon("");
        bg=new JLabel("",img,JLabel.CENTER);
        bg.setBounds(0,0,1000,600);

        a.setBounds(120, 150, 180, 40);
        b.setBounds(700, 150, 180, 40);
        c.setBounds(400, 150, 180, 40);
        d.setBounds(780, 515, 100, 40);
        a.setFont(fh);
        b.setFont(fh);
        c.setFont(fh);
        d.setFont(fh);

        a.setCursor(cr);
        b.setCursor(cr);
        c.setCursor(cr);
        d.setCursor(cr);
        f.add(a);
        f.add(b);
        f.add(c);
        f.add(d);
        f.add(bg);
        f.setLocationRelativeTo(null);

        a.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new TicketBooking();
                f.setVisible(false);
            }
        });

      d.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new cse110Project();
                f.setVisible(false);
            }
        });

        f.setSize(1000, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}