import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {   
     private JTextField emailField;   
     private JPasswordField passwordField; 
     private JCheckBox showPasswordCheckbox;    
     public LoginForm() {      
        
        
     setTitle("Login Form");      
     setSize(300, 200);     
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
     setLocationRelativeTo(null);       
    
     JPanel panel = new JPanel();     
     add(panel);     
     placeComponents(panel);  

     setVisible(true);   
     }   
     
     private void placeComponents(JPanel panel) {  
      panel.setLayout(null);

     JLabel emailLabel = new JLabel("Email:"); 
     emailLabel.setBounds(10, 20, 80, 25);   
     panel.add(emailLabel);  

     emailField = new JTextField(20);       
     emailField.setBounds(100, 20, 165, 25);  
     panel.add(emailField);  
           
     JLabel passwordLabel = new JLabel("Password:");      
     passwordLabel.setBounds(10, 50, 80, 25); 
     panel.add(passwordLabel);  

     passwordField = new JPasswordField(20);  
     passwordField.setBounds(100, 50, 165, 25);    
     panel.add(passwordField);  
     
     showPasswordCheckbox = new JCheckBox("Show Password");       
     showPasswordCheckbox.setBounds(100, 80, 150, 25); 
     panel.add(showPasswordCheckbox);        

     JButton loginButton = new JButton("Login");        
     loginButton.setBounds(100, 110, 100, 25);
     panel.add(loginButton); 

     showPasswordCheckbox.addActionListener(new ActionListener() {    
      @Override  
        public void actionPerformed(ActionEvent e) {           
         if (showPasswordCheckbox.isSelected()) {                  
         passwordField.setEchoChar((char) 0);   
         // Show password           
         } else {                    
        passwordField.setEchoChar('*'); 
        // Hide password    
         }          
          }        
        });  

         loginButton.addActionListener(e -> {            
         String email = emailField.getText();
         String password = new String(passwordField.getPassword());

         if (isValidLogin(email, password)) {               
         JOptionPane.showMessageDialog(this, "Login Successful!");           
         } else {                
         JOptionPane.showMessageDialog(this, "Login Failed. Invalid Email or Password."); 
         }       
         });  
         }

             private boolean isValidLogin(String email, String password) {        
            return email.equals("lakshitkhurana@presentation.com")&& password.equals("presentation7856");    
          }    
          public static void main(String[] args) {        
         SwingUtilities.invokeLater(LoginForm::new);
         } 
        }
                         
