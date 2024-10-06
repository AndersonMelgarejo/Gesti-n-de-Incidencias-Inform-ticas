package Principal;
import Controlador.*;
import Vista.*;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;


public class main {

    public static void main(String[] args) {
        
                
            
            
            
            try {
            UIManager.setLookAndFeel(new FlatLightLaf());
                UIManager.put("Button.arc", 15);
                UIManager.put("Button.borderColor", "#B5E0FF");
                UIManager.put("TextComponent.arc", 15);
                UIManager.put("Component.arc", 15);
                UIManager.put("Separator.stripeWidth", 3);
                UIManager.put("PasswordField.showRevealButton", true);
                UI_Login login = new UI_Login();
                LoginController start = new LoginController(login);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

        
}
