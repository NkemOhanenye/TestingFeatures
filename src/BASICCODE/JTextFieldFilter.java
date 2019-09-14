/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 4/17/18
 * Time: 11:46 AM
 */
package BASICCODE;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

class JTextFieldFilter extends PlainDocument {
    public static final String ALPHA = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMERIC = "0123456789";
    public static final String ALPHA_NUMERIC = ALPHA + NUMERIC;

    protected String acceptedChars = null;

    protected boolean negativeAccepted = false;

    public JTextFieldFilter() {
        this(ALPHA_NUMERIC);
    }

    public JTextFieldFilter(String acceptedchars) {
        acceptedChars = acceptedchars;
    }

    public void setNegativeAccepted(boolean negativeaccepted) {
        if (acceptedChars.equals(ALPHA_NUMERIC)) {
            negativeAccepted = negativeaccepted;
            acceptedChars += "-";
        }
    }

    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null)
            return;
        for (int i = 0; i < str.length(); i++) {
            if (acceptedChars.indexOf(str.valueOf(str.charAt(i))) == -1)
                return;
        }

        if (negativeAccepted) {
            if (str.indexOf(".") != -1) {
                if (getText(0, getLength()).indexOf(".") != -1) {
                    return;
                }
            }
        }

        if (negativeAccepted && str.indexOf("-") != -1) {
            if (str.indexOf("-") != 0 || offset != 0) {
                return;
            }
        }

        super.insertString(offset, str, attr);
    }
}

 class Main extends JFrame{
    public static void main(String[] argv) throws Exception {
        new Main();
    }

    public Main() {
        JTextField tf1c;
        JLabel l1c;

        setLayout(new FlowLayout());
        l1c = new JLabel("only float(can be negative)");
        tf1c = new JTextField(10);
        getContentPane().add(l1c);
        getContentPane().add(tf1c);
        JTextFieldFilter jtff = new JTextFieldFilter(JTextFieldFilter.ALPHA_NUMERIC);
        jtff.setNegativeAccepted(true);
        tf1c.setDocument(jtff);

        setSize(300,300);
        setVisible(true);
    }
}