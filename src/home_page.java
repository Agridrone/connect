

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.tools.FileObject;
import net.sf.vfsjfilechooser.*;

import net.sf.vfsjfilechooser.VFSJFileChooser;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanke
 */
public class home_page extends javax.swing.JFrame {

    /**
     * Creates new form home_page
     */
    public home_page() {
        initComponents();
    }



String imgpath=null;

public ImageIcon  ResizeImage(String Imagepath, byte [] pic)
{
   ImageIcon Myimage = null;
   if(Imagepath != null)
   {
       Myimage = new ImageIcon(Imagepath);
   }
   else
   {
       Myimage = new ImageIcon(pic);
      
   }
   
   Image img = Myimage.getImage();
   Image newImg = img.getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(),Image.SCALE_SMOOTH);
   ImageIcon image = new ImageIcon(newImg);
   return image;
   
}

public static Connection getConnection()
{
    Connection con = null;
    try
    {  Class.forName("com.mysql.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/h_project","root","123456");
       return con;
       
    }
    catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Not connected");
                return null;
            }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setText("insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 153));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 153));
        jButton4.setText("delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel2.setForeground(new java.awt.Color(153, 0, 153));

        jButton1.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 255));
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSpinner1.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N

        jButton5.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 51, 255));
        jButton5.setText("Choose image");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N

        jButton6.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 51, 255));
        jButton6.setText("Choose image");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N

        jSpinner2.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N

        jButton7.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 51, 255));
        jButton7.setText("find");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(77, 77, 77)
                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton7)
                .addGap(79, 79, 79))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jButton8.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(153, 0, 153));
        jButton8.setText("Compare");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Database Comparer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(337, 337, 337))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jButton8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(32, 32, 32)
                        .addComponent(jButton3)
                        .addGap(27, 27, 27)
                        .addComponent(jButton4))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("ftp://192.168.0.100:2121"));
        FileNameExtensionFilter filter= new FileNameExtensionFilter(".Images","jpg","png","gif");
        file.addChoosableFileFilter(filter);
        int result =file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
           File selectedFile = file.getSelectedFile();
           String path = selectedFile.getAbsolutePath();
           
          jLabel1.setIcon(ResizeImage(path,null));
           imgpath=path;
        } 
        else if (result == JFileChooser.CANCEL_OPTION)
        {
            JOptionPane.showMessageDialog(this,"No file is selected");
        }
            
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

  if(imgpath != null)
  {
      
      try {
      
       
      
          PreparedStatement ps = getConnection().prepareStatement("Insert into img(images) values(?)");
          InputStream img = new FileInputStream(new File(imgpath));
          ps.setBlob(1, img);
          if(ps.executeUpdate() == 1)
          {
              JOptionPane.showMessageDialog(this,"Image inserted");
          }
          
      }
      
       catch (Exception ex) {
          Logger.getLogger(home_page.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  else
          {
              JOptionPane.showMessageDialog(this,"No Image selected");
          }
  imgpath=null;
  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
InputStream img= null;
        if (imgpath !=null)
        {
            try {
                
                img = new FileInputStream(imgpath);
                String UpdateQuery ="Update img set images = ? where srno = ?";
                int srno = Integer.parseInt(jSpinner1.getValue().toString());
           PreparedStatement ps = getConnection().prepareStatement(UpdateQuery);
           ps.setBlob(1,img);
           ps.setInt(2, srno);
           if (ps.executeUpdate() == 1)
           {
               JOptionPane.showMessageDialog(this,"Image updated");
           }
           else
           {
               JOptionPane.showMessageDialog(this,"No image exist with this id");
           }
            } 
            catch (Exception ex) {
                Logger.getLogger(home_page.class.getName()).log(Level.SEVERE, null, ex);
            }
          
               
        }
        else
        {
            JOptionPane.showMessageDialog(this,"No image is selected");
            
        }
imgpath = null;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
int srno = Integer.parseInt(jSpinner1.getValue().toString());
String DeleteQuery = "Delete From img where srno= ?";
        try {
            PreparedStatement ps = getConnection().prepareStatement(DeleteQuery);
            ps.setInt(1,srno);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this,"Image Deleted");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"No image exist with this id");
            }
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(home_page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int srno = Integer.parseInt(jSpinner1.getValue().toString());
String SelectQuery = "select * From img where srno = "+srno;
Statement st;
        
ResultSet rs;
        try {
            st = getConnection().createStatement();
            rs = st.executeQuery(SelectQuery);
            if (rs.next())
{
    jLabel1.setIcon(ResizeImage(null, rs.getBytes("images")));
            }
else
    
{
    JOptionPane.showMessageDialog(this,"Image not found");
}
        } catch (SQLException ex) {
            Logger.getLogger(home_page.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("ftp://192.168.0.100:2121"));
        FileNameExtensionFilter filter= new FileNameExtensionFilter(".Images","jpg","png","gif");
        file.addChoosableFileFilter(filter);
        int result =file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
           File selectedFile = file.getSelectedFile();
           String path = selectedFile.getAbsolutePath();
           jLabel2.setIcon(ResizeImage(path,null));
           imgpath=path;
        } 
        else if (result == JFileChooser.CANCEL_OPTION)
        {
            JOptionPane.showMessageDialog(this,"No file is selected");
        }
          
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    int srno = Integer.parseInt(jSpinner2.getValue().toString());
String SelectQuery = "select * From img where srno = "+srno;
Statement st;
        
ResultSet rs;
        try {
            st = getConnection().createStatement();
            rs = st.executeQuery(SelectQuery);
            if (rs.next())
{
    jLabel2.setIcon(ResizeImage(null, rs.getBytes("images")));
            }
else
    
{
    JOptionPane.showMessageDialog(this,"Image not found");
}
        } catch (SQLException ex) {
            Logger.getLogger(home_page.class.getName()).log(Level.SEVERE, null, ex);
        }        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
//Icon icon = jLabel1.getIcon();
//BufferedImage bi = new BufferedImage(icon.getIconWidth(),
 String path=null;
 String path1=null;
 JFileChooser chooser = new JFileChooser();
chooser.setCurrentDirectory(new java.io.File("."));
chooser.setDialogTitle("choosertitle");
FileNameExtensionFilter filter= new FileNameExtensionFilter(".Images","jpg","png","gif");
        chooser.addChoosableFileFilter(filter);
        


chooser.setAcceptAllFileFilterUsed(false);

if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

      path= chooser.getSelectedFiles().toString();
       File selectedFile = chooser.getSelectedFile();
           path = selectedFile.getAbsolutePath();
           jLabel1.setIcon(ResizeImage(path,null));
           imgpath=path;


} else {
  System.out.println("No Selection ");
}

JFileChooser chooser1 = new JFileChooser();
chooser1.setCurrentDirectory(new java.io.File("."));
chooser1.setDialogTitle("choosertitle");

chooser1.setAcceptAllFileFilterUsed(false);
FileNameExtensionFilter filter1= new FileNameExtensionFilter(".Images","jpg","png","gif");
        chooser1.addChoosableFileFilter(filter1);

if (chooser1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
      path1= chooser1.getSelectedFiles().toString();
path1= chooser.getSelectedFiles().toString();
       File selectedFile = chooser.getSelectedFile();
           path1 = selectedFile.getAbsolutePath();
           jLabel2.setIcon(ResizeImage(path,null));
           imgpath=path1;

} else {
  System.out.println("No Selection ");
}


             ImageCompare ic = new ImageCompare(path,path1);
             
            // ImageCompare ic = new ImageCompare("D:\\New Folder\\1.jpg","D:\\New Folder\\2.jpg");
ic.setParameters(8, 6, 5, 10);
ic.setDebugMode(2);
ic.compare();
System.out.println("Match: " + ic.match());
       
if (!ic.match()) 
{
   
ImageCompare.saveJPG(ic.getChangeIndicator(),"D:\\New Folder\\changes.jpg");
}

       
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    // End of variables declaration//GEN-END:variables

    private VFSJFileChooser createFileChooser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
