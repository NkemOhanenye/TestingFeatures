/**
 * Created by otakusenseihig on 2/24/17.
 */
import javax.swing.*;
import java.awt.event.*;
public class Validation {
    public boolean isValid;
    public int value;
    public static IntValidationResult isInt(
        JTextField f, String msg){
        IntValidationResult result =
                new IntValidationResult();
        try{
            result.value =
                    integer.parseInt(f.getText());
            result.isValid = true;
            return result;
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(f,
                    "Entry Error", msg,
                    JOptionPane.ERROR_MESSAGE);
            f.requestFocus();
            result.isValid = false;
            result.value = 0;
            return result;
        }
    }
}
