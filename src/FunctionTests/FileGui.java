/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 11/10/17
 * Time: 5:06 PM
 */
package FunctionTests;

import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class FileGui {

    private Writer writer = new Writer();
    private String fileName = writer.getFileName();
    private String write = writer.getWords();
    private String directory = writer.getDirectory();
    private File file;
    private JButton oW = new JButton("Overwrite");
    private JButton rN = new JButton("Rename");
    private JButton aO = new JButton("Add On");
    private JButton c = new JButton("Cancel");

    public void writeGui(String fileName, String write) throws FileNotFoundException, IOException{

        this.fileName = fileName;
        this.write = write;
        writer.create(fileName);


        //if(writer.exist()){

        oW.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    writer.setFos(file, false);
                    writer.write(write);
                } catch (Exception e) {

                }
                System.out.println();
                System.exit(0);
            }
        });
        rN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton rename = new JButton("Rename");
                rename.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        file.renameTo(new File(writer.getDirectory()));
                            return;
                        }
                });
                JButton cancel = new JButton("Cancel");
                //JLabel label = new JLabel(writer.getFileName() + "(1)" + writer.getFileType());
                Object[] word = {writer.getFileName() + "(1)" + writer.getFileType()};
                Object[] buttons2 = {rename, cancel};
                JOptionPane.showInputDialog(
                        null,
                        "What would you like to rename the file to? \n",
                        "Rename File",
                        0,
                        null,
                        word,
                        buttons2[0]);

            }
        });
        aO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    writer.write(writer.getWords());
                }catch (Exception e){

                }
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        if(writer.exist()){
            Object[] buttons = new Object[]{oW, rN, aO, c};
            JOptionPane.showOptionDialog(null,
                    "The file already exists.",
                    "",
                    0,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    buttons,
                    buttons[0]);

        }else{
            System.exit(0);
        }
    }
}