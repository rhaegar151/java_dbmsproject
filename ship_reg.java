/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fre;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author gaurav
 */
public class ship_reg extends javax.swing.JFrame {

    /**
     * Creates new form ship_reg
     */ 
    Statement st;
    Connection con;
    String url,user,password;
    public ship_reg() {
        initComponents();
         try{
          url="jdbc:mysql://localhost:3306/dbproject?autoReconnect=true&useSSL=false";
	  user="root";
	  password="tiger";
			
	Class.forName("com.mysql.jdbc.Driver");
				
		}
		catch(Exception e){
			System.out.println("Exception in connecting...."+e.getLocalizedMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jTF1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTF2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCB1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jCB2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTF4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTF5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTF6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTF7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bx1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        bx2 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        bx3 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        bx4 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        bx5 = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        bx6 = new javax.swing.JCheckBox();
        jB2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        bx7 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Owner Name: ");

        jLabel2.setText("Ship Name: ");

        jTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Password:");

        jLabel4.setText("Select ship type:");

        jCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reefer ","Container ","Roll on/off"}));

        jLabel5.setText("Home country of ship:");

        jCB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "South Africa", "Dubai", "Canada","Spain" }));

        jLabel6.setText("Min Load(in tonnes):");

        jLabel7.setText("Max Load(in tonnes):");

        jLabel8.setText("Cost per mile(in $):");

        jLabel9.setText("Weight already present:");

        jLabel10.setText("Select the parts that are under maintenance:");

        jLabel11.setText("Anchor: ");

        bx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bx1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Bow:");

        jLabel13.setText("Cabin:");

        jLabel14.setText("Funnel: ");

        jLabel17.setText("Stern:");

        jLabel18.setText("Propeller:");

        jB2.setText("Register");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jLabel15.setText("Scope:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bx2)
                                .addComponent(bx1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(bx3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jB2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(bx5)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addComponent(bx4)
                                .addGap(245, 245, 245))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTF7, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTF6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTF5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTF4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCB2, javax.swing.GroupLayout.Alignment.LEADING, 0, 139, Short.MAX_VALUE)
                                        .addComponent(jCB1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(bx7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel18))
                                            .addComponent(jTF1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTF2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTF3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addComponent(bx6))))
                            .addComponent(jLabel10))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bx7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(bx1))
                            .addComponent(bx6))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(bx2))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(bx3))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bx4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bx5)
                            .addComponent(jLabel17))
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jB2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF2ActionPerformed

    private void bx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bx1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        // TODO add your handling code here:
        try{
            int id;
           int flag=0;
         if(jTF1.getText().length()==0 || jTF2.getText().length()==0 || jTF3.getText().length()==0
                 || jTF4.getText().length()==0 || jTF5.getText().length()==0 || jTF6.getText().length()==0
                 || jTF7.getText().length()==0)
           flag=1;
             
         if(flag==1){
             JOptionPane.showMessageDialog(this,"please check if anything is missing");
             return;
            }
            
            
         con=DriverManager.getConnection(url, user, password);
         st=con.createStatement();
	ResultSet rs;
	st.executeUpdate("insert into Ship (name,owner,max,min,type,ctr,costpm,pswd) values("
	+"'"+jTF2.getText()+"'"+","+"'"+jTF1.getText()+"'"+","
                +Integer.parseInt(jTF5.getText())+","+Integer.parseInt(jTF4.getText())
                +","+(jCB1.getSelectedIndex()+1)+","+(jCB2.getSelectedIndex()+1)
                +","+Integer.parseInt(jTF6.getText())+","+"'"+jTF3.getText()+"'"+")");
	
        System.out.println("Check after insertion");
	rs=st.executeQuery("select id from Ship where name="+"'"+jTF2.getText()+"'"+
		        "and"+ " pswd="+"'"+jTF3.getText()+"'");
	   
	rs.next();
	id=rs.getInt(1);
	
        int val[]=new int[7];
        
        for(int i=0;i<7;i++)
            val[i]=0;
        
        if(bx1.isSelected())
            val[0]=1;
        if(bx2.isSelected())
            val[1]=1;
        if(bx3.isSelected())
            val[2]=1;
        if(bx4.isSelected())
            val[4]=1;
        if(bx5.isSelected())
            val[5]=1;
        if(bx6.isSelected())
            val[6]=1;
        if(bx7.isSelected())
            val[3]=1;
        st.executeUpdate("insert into Maintenance values("+id+","+val[0]+","+val[1]+","+val[2]+","+val[6]+","+val[3]+","+val[4]+","+val[5]+")");
	   int sum=0;
	   for(int x=2;x<=5;x++)
	   {
		   sum=sum+val[x];
	   }
	   
	   if(sum==0)
	   {
		   sum=0;
	   }
	   else
	   {
		   sum=1;
	   }
	   
           float lod=(float)Double.parseDouble(jTF7.getText());
	   st.executeUpdate("insert into Status values("+id+","+0+","+lod+","+null+","+sum+")");
	   
	JOptionPane.showMessageDialog(this,"successfully registered");
        shipc obj=new shipc();
        obj.setVisible(true);
        setVisible(false);
        
		st.close();
		con.close();
            
            
        }
        catch(Exception e){
            System.out.println("In ship_reg.java -"+e.getLocalizedMessage());
        }   
        
    }//GEN-LAST:event_jB2ActionPerformed

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
            java.util.logging.Logger.getLogger(ship_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ship_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ship_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ship_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ship_reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bx1;
    private javax.swing.JCheckBox bx2;
    private javax.swing.JCheckBox bx3;
    private javax.swing.JCheckBox bx4;
    private javax.swing.JCheckBox bx5;
    private javax.swing.JCheckBox bx6;
    private javax.swing.JCheckBox bx7;
    private javax.swing.JButton jB2;
    private javax.swing.JComboBox<String> jCB1;
    private javax.swing.JComboBox<String> jCB2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTF1;
    private javax.swing.JTextField jTF2;
    private javax.swing.JTextField jTF3;
    private javax.swing.JTextField jTF4;
    private javax.swing.JTextField jTF5;
    private javax.swing.JTextField jTF6;
    private javax.swing.JTextField jTF7;
    // End of variables declaration//GEN-END:variables
}
