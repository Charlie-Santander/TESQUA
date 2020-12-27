import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
public class Main {

    public static void main(String [] args) {
           
                  
        JFrame myFrame = new JFrame();
        myFrame.setTitle("Raw Master Registration Form");
        myFrame.setSize(800,500);
        myFrame.setVisible(true);
        myFrame.setResizable(false);
        myFrame.setLayout(null);
        myFrame.setLocationRelativeTo(null);
        myFrame.getContentPane().setBackground(Color.decode("#d0f0c0"));
        
        
        JLabel lname = new JLabel();
        lname.setText("Last Name : ");
        lname.setBounds(10,20,180,40);
        myFrame.add(lname); 
        
        JLabel fname = new JLabel();
        fname.setText("First Name : ");
        fname.setBounds(10,60,180,40);
        myFrame.add(fname);
        
        JLabel age = new JLabel();
        age.setText("Age : ");
        age.setBounds(10,100,180,40);
        myFrame.add(age);
        
        JLabel sex = new JLabel();
        sex.setText("Gender : ");
        sex.setBounds(10,140,180,40);
        myFrame.add(sex);
        
        JLabel status = new JLabel();
        status.setText("Status : ");
        status.setBounds(10,180,180,40);
        myFrame.add(status);
        
        JLabel contact = new JLabel();
        contact.setText("Contact No : ");
        contact.setBounds(10,220,180,40);
        myFrame.add(contact);
        
        JLabel email = new JLabel();
        email.setText("Email : ");
        email.setBounds(10,260,180,40);
        myFrame.add(email);
        
        JLabel password = new JLabel();
        password.setText("Password : ");
        password.setBounds(10,300,180,40);
        myFrame.add(password);
        
        
        JTextField t1,t2,t3,t4,t5,t6,t7,t8;
        
        t1 = new JTextField(" ");
        t1.setBounds(120,20,180,35);
        myFrame.add(t1);        
        
        t2 = new JTextField(" ");
        t2.setBounds(120,60,180,35);
        myFrame.add(t2);  
        
        t3 = new JTextField(" ");
        t3.setBounds(120,100,180,35);
        myFrame.add(t3);          
        
        t4 = new JTextField(" ");
        t4.setBounds(120,140,180,35);
        myFrame.add(t4); 
        
        t5 = new JTextField(" ");
        t5.setBounds(120,180,180,35);
        myFrame.add(t5); 
        
        t6 = new JTextField(" ");
        t6.setBounds(120,220,180,35);
        myFrame.add(t6);  
        
        t7 = new JTextField(" ");
        t7.setBounds(120,260,180,35);
        myFrame.add(t7); 
        
        t8 = new JTextField(" ");
        t8.setBounds(120,300,180,35);
        myFrame.add(t8); 
        
        
        JButton b1 = new JButton("Register");
        b1.setBounds(60,360,100,35);
        myFrame.add(b1);
                                   
        
    }
}