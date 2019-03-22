/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author scott
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import org.icepdf.core.views.DocumentViewController;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
public class Supplier extends javax.swing.JFrame {

    /**
     * Creates new form Supplier
     */
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel dm;
    public Supplier() {
        super("supplier");
        initComponents();
        conn=JavaConnect.ConnecrDb();
        setLocationRelativeTo(null);
        random();
        Date();
        jDateChooser1.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        id1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        idnoo = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        phone1 = new javax.swing.JTextField();
        search1 = new javax.swing.JTextField();
        code1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SUPPLIER    RECORDS");

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mureti Martin\\Documents\\NetBeansProjects\\Business Management System\\src\\search-icon-1.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Generate    Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jLabel6.setText("Supplier Code");

        jLabel9.setText("Phone");

        jLabel7.setText("Name");

        jLabel8.setText("ID Number");

        jLabel13.setText("Search");

        idnoo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idnooKeyTyped(evt);
            }
        });

        name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name1KeyTyped(evt);
            }
        });

        phone1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone1KeyTyped(evt);
            }
        });

        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });

        code1.setEditable(false);

        jLabel10.setText("Date");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(code1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name1)
                            .addComponent(phone1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idnoo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnoo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(id1)
                        .addGap(0, 465, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(id1)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void random(){
        Random ra=new Random();
        code1.setText(""+ra.nextInt(1000+1));
    }
    public void Date(){
    Date date=new Date();
    jDateChooser1.setDate(date);
      
    
    }
    public void table2(){
        try{
            String sql="Select ID,Code,Name,ID_Number as 'Nation ID',Phone,Date from supplier";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
//            jtable2.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
            rs.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }
    private void name1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name1KeyTyped
        // TODO add your handling code here:

        if(Character.isDigit(evt.getKeyChar()))
        evt.consume();
    }//GEN-LAST:event_name1KeyTyped

    private void idnooKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idnooKeyTyped
        // TODO add your handling code here:
        if(idnoo.getText().length()>=10){
            evt.consume();
        }
        if(!Character.isDigit(evt.getKeyChar()))
        evt.consume();
    }//GEN-LAST:event_idnooKeyTyped

    private void phone1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone1KeyTyped
        // TODO add your handling code here:
        if(phone1.getText().length()>=10){
            evt.consume();
        }
        if(!Character.isDigit(evt.getKeyChar()))
        evt.consume();
    }//GEN-LAST:event_phone1KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(code1.getText().equals("")||idnoo.getText().equals("")||phone1.getText().equals("")||name1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please fill all the fields to proceed !!!");
            return;
        }
        try{
            String sql="Select * from Supplier where id_Number=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, idnoo.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "supplier already exist in the system");
                return;
            }
            pst.close();
            rs.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        try{
            String sql="Insert into Supplier(Code,Name,Id_Number,phone,Date)values(?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1, code1.getText());
            pst.setString(2, name1.getText());
            pst.setString(3,idnoo.getText());
            pst.setString(4,phone1.getText());
            pst.setString(5, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
            pst.execute();
            JOptionPane.showMessageDialog(this, "Supplier successfully saved");
      
            code1.setText("");
            name1.setText("");
            idnoo.setText("");
            phone1.setText("");
            random();
            pst.close();
            rs.close();

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(name1.getText().equals("")||phone1.getText().equals("")||idnoo.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please fill all the fields to proceed");
            return;
        }
        String value1=name1.getText();
        String value2=idnoo.getText();
        String value3=phone1.getText();
        String value4=id1.getText();
        try{
            String sql="Update Supplier set Name='"+value1+"',Id_Number='"+value2+"',Phone='"+value3+"'where ID='"+value4+"' ";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Successfully Updated");
           
            pst.close();
            rs.close();
            code1.setText("");
            name1.setText("");
            idnoo.setText("");
            phone1.setText("");
            random();
            

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(name1.getText().equals("")||phone1.getText().equals("")||idnoo.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please select the row to delete!!");
            return;
        }
        try{
            int p=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete","Delete",JOptionPane.YES_NO_OPTION);
            if(p==0){
                String sql="Delete from Supplier where ID=?";
                pst=conn.prepareStatement(sql);
                pst.setString(1, id1.getText());
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully deleted");

            }
            code1.setText("");
            name1.setText("");
            idnoo.setText("");
            phone1.setText("");
            random();
          
            pst.close();
            rs.close();

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void column(){
       // dm=(DefaultTableModel)jtable2.getModel();
        dm.addColumn("");
           
    }
    private void filters(String query){
        TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(dm);
//       jtable2.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter(query));
    }
    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
        // TODO add your handling code here:
        String query=search1.getText();
        filters(query);
    }//GEN-LAST:event_search1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String sql="Select ID,Code,Name,ID_Number,Phone from supplier  ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            Document document =new Document();
            PdfWriter.getInstance(document, new FileOutputStream("SupplierAll.pdf"));
            document.open();
            
             
                document.add(new Paragraph("                                                        Scott-tech Technology "));
                document.add(new Paragraph("                                                    P.O. BOX 6000 Nairobi"));
                document.add(new Paragraph("                                                EMAIL:scotttech@gmail.com"));

              
                document.add(new Paragraph(new Date().toString()));
              
                document.add(new Paragraph(""));
          
         //
            PdfPTable table = new PdfPTable(4);
           
            table.addCell("Code");
            table.addCell("Name");
            table.addCell("ID Number");
            table.addCell("Phone");
           
            //
            
            while(rs.next()) {
                
                String data1 = rs.getString("Code");
                String  data2 = rs.getString("Name");
                String data3 = rs.getString("ID_Number");
                String data4 = rs.getString("Phone");
               
               
                table.addCell(data1);
                table.addCell(data2);
                table.addCell(data3);
                table.addCell(data4);
               
               
                //
           } 
           document.add(table);
          //      document.add(new Paragraph("        ", FontFactory.getFont(FontFactory.TIMES_BOLD, 12, Font.BOLD, BaseColor.BLUE)));
            document.close();

                    
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
        
       try{
            String path="C:\\Users\\Mureti Martin\\Documents\\NetBeansProjects\\Business Management System\\SupplierAll.pdf";
                SwingController controller=new SwingController();
                SwingViewBuilder factory=new SwingViewBuilder(controller);
                controller.setIsEmbeddedComponent(true);
                
                DocumentViewController viewController=controller.getDocumentViewController();
                JPanel viewerComponetPanel =factory.buildViewerPanel();
                ComponentKeyBinding.install(controller, viewerComponetPanel);
                controller.getDocumentViewController().setAnnotationCallback(new org.icepdf.ri.common.MyAnnotationCallback(controller.getDocumentViewController()));

                
                JFrame appframe=new JFrame();
                appframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                appframe.getContentPane().setLayout(new BorderLayout());
                appframe.getContentPane().add(viewerComponetPanel,BorderLayout.CENTER);
                appframe.getContentPane().add(factory.buildCompleteMenuBar(),BorderLayout.NORTH);
                appframe.setLocation(200,10);

                controller.setPageViewMode(0,false);
                controller.openDocument(path);
                appframe.pack();
                appframe.setVisible(true);
                rs.close();
                pst.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(search1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Empty seacrh Field");
            return;
        } 
        try{
            String sql="Select * from supplier where code=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, search1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
            String add=rs.getString("ID");
            id1.setText(add);
            
            String add1=rs.getString("Code");
            code1.setText(add1);
            
             String add2=rs.getString("Name");
            name1.setText(add2);
            
             String add3=rs.getString("ID_Number");
            idnoo.setText(add3);
            
             String add4=rs.getString("Phone");
            phone1.setText(add4);
            }
            pst.close();
            rs.close();
        }catch(Exception e){
        }
        
          try{
            String sql="Select * from supplier where name=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, search1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
            String add=rs.getString("ID");
            id1.setText(add);
            
            String add1=rs.getString("Code");
            code1.setText(add1);
            
             String add2=rs.getString("Name");
            name1.setText(add2);
            
             String add3=rs.getString("ID_Number");
            idnoo.setText(add3);
            
             String add4=rs.getString("Phone");
            phone1.setText(add4);
            }
            pst.close();
            rs.close();
        }catch(Exception e){
        }
          
            try{
            String sql="Select * from supplier where ID_Number=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, search1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
            String add=rs.getString("ID");
            id1.setText(add);
            
            String add1=rs.getString("Code");
            code1.setText(add1);
            
             String add2=rs.getString("Name");
            name1.setText(add2);
            
             String add3=rs.getString("ID_Number");
            idnoo.setText(add3);
            
             String add4=rs.getString("Phone");
            phone1.setText(add4);
            }
            pst.close();
            rs.close();
        }catch(Exception e){
        }
              try{
            String sql="Select * from supplier where phone=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, search1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
            String add=rs.getString("ID");
            id1.setText(add);
            
            String add1=rs.getString("Code");
            code1.setText(add1);
            
             String add2=rs.getString("Name");
            name1.setText(add2);
            
             String add3=rs.getString("ID_Number");
            idnoo.setText(add3);
            
             String add4=rs.getString("Phone");
            phone1.setText(add4);
            }
            pst.close();
            rs.close();
            
        }catch(Exception e){
        }
                
        
        
                
 
 
 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void search1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                    try{
            String sql="Select * from supplier where code=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, search1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
            String add=rs.getString("ID");
            id1.setText(add);
            
            String add1=rs.getString("Code");
            code1.setText(add1);
            
             String add2=rs.getString("Name");
            name1.setText(add2);
            
             String add3=rs.getString("ID_Number");
            idnoo.setText(add3);
            
             String add4=rs.getString("Phone");
            phone1.setText(add4);
            }
            pst.close();
            rs.close();
        }catch(Exception e){
        }
        
          try{
            String sql="Select * from supplier where name=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, search1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
            String add=rs.getString("ID");
            id1.setText(add);
            
            String add1=rs.getString("Code");
            code1.setText(add1);
            
             String add2=rs.getString("Name");
            name1.setText(add2);
            
             String add3=rs.getString("ID_Number");
            idnoo.setText(add3);
            
             String add4=rs.getString("Phone");
            phone1.setText(add4);
            }
            
            pst.close();
            rs.close();
        }catch(Exception e){
        }
          
            try{
            String sql="Select * from supplier where ID_Number=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, search1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
            String add=rs.getString("ID");
            id1.setText(add);
            
            String add1=rs.getString("Code");
            code1.setText(add1);
            
             String add2=rs.getString("Name");
            name1.setText(add2);
            
             String add3=rs.getString("ID_Number");
            idnoo.setText(add3);
            
             String add4=rs.getString("Phone");
            phone1.setText(add4);
            }
            pst.close();
            rs.close();
        }catch(Exception e){
        }
              try{
            String sql="Select * from supplier where phone=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, search1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
            String add=rs.getString("ID");
            id1.setText(add);
            
            String add1=rs.getString("Code");
            code1.setText(add1);
            
             String add2=rs.getString("Name");
            name1.setText(add2);
            
             String add3=rs.getString("ID_Number");
            idnoo.setText(add3);
            
             String add4=rs.getString("Phone");
            phone1.setText(add4);
            }
            pst.close();
            rs.close();
        }catch(Exception e){
        }
 
         }
    }//GEN-LAST:event_search1KeyPressed

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
                      /* if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;*/
                UIManager.setLookAndFeel("com.jtatoo.plaf.smart.SmartLookAndFeel");
                }
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField code1;
    private javax.swing.JLabel id1;
    private javax.swing.JTextField idnoo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField phone1;
    private javax.swing.JTextField search1;
    // End of variables declaration//GEN-END:variables
}