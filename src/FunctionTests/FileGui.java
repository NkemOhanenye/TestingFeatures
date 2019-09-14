/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 11/10/17
 * Time: 5:06 PM
 */
package FunctionTests;

import java.io.*;
import javax.swing.*;
import java.awt.event.*;


public class FileGui {

    /*private Writer writer = new Writer();
    private String fileName = writer.getFileName();
    private String write = writer.getWords();
    private String directory = writer.getDirectory();
    private String path = writer.getPath();

    private File file;

    private JButton oW = new JButton("Overwrite"); //Works
    private JButton aO = new JButton("Add On"); // Works
    private JButton c = new JButton("Cancel"); // works

    private JDialog fileFoundDialog;

    public void writeGui(String fileName) throws FileNotFoundException, IOException{

        //Method Settings
        this.fileName = fileName;
        writer.create(fileName);
        directory = path + "/" + fileName + ".txt";
        file = new File(directory);

        //Frame Settings
        JFrame fileFoundFrame = new JFrame();
        fileFoundDialog = new JDialog(fileFoundFrame, "Confirm Overwrite of: " + fileName, true);

        //Main Button Settings
        oW.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    file.delete();
                } catch (Exception e) {

                }
                fileFoundDialog.dispose();
            }
        });
        aO.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                fileFoundDialog.dispose();

            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        //If A File Exists Settings
        if(writer.exist()){

            Object[] buttons = new Object[]{oW, aO, c};
            JOptionPane pane = new JOptionPane(
                    "The file already exists.",
                    JOptionPane.WARNING_MESSAGE,
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    null,
                    buttons,
                    buttons[0]);

            fileFoundDialog.getContentPane().add(pane);
            fileFoundDialog.setSize(405,120);
            fileFoundDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fileFoundDialog.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
            fileFoundDialog.setLocationRelativeTo(fileFoundFrame);
            fileFoundDialog.setVisible(true);

        }else{
            fileFoundDialog.dispose();
        }
    }*/
}