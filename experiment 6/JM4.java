package hello1;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JM4 extends JM2{
   
    public JM4() {
	 open.addActionListener(new ActionListener()  {
    	   public void actionPerformed(ActionEvent e)  { loadFile(); }
       }); 
	 close.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e)  { saveFile(); }
       });     
     exit.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e)  { System.exit(0); }
       });
   }

   void loadFile() {//���ļ�����
	   JFileChooser fc=new JFileChooser();
       int r=fc.showOpenDialog(this);
       if(r==JFileChooser.APPROVE_OPTION)  {
    	   File file=fc.getSelectedFile();
           try {editor.read(new FileReader(file),null);}catch(IOException e){}
       }
   }
   
   void saveFile()  {//�����ļ�����
	   JFileChooser fc=new JFileChooser();
       int r=fc.showSaveDialog(this);
       if(r==JFileChooser.APPROVE_OPTION)  {
           File file=fc.getSelectedFile();
           try {editor.write(new FileWriter(file));}catch(IOException e){}
       }
   }
  
   public static void main(String[] args)  {JM4 d = new JM4();}
 } 