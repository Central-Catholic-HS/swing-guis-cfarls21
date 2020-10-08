import javax.swing.JOptionPane;

public class Practice
{
    public static void main(String[] args)
    {
        String firstName;
        String middleName;
        String lastName;
        String truthFirst = "Anthony";
        String truthMiddle = "Michael";
        String truthLast = "Gatti";
        
        firstName = JOptionPane.showInputDialog("What is your lover's first name?");
        middleName = JOptionPane.showInputDialog("What is your lover's second name?");
        lastName = JOptionPane.showInputDialog("What is your lover's last name?");
        
        JOptionPane.showMessageDialog(null, "You may be horny for " + firstName + " " + 
                                      middleName + " " + lastName + ", but you really love " +
                                      truthFirst + " " + truthMiddle + " " + truthLast + "...");    
                                      
        System.exit(0);
        
    }
}
