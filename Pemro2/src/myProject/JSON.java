/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myProject;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alfia
 */
public class JSON extends javax.swing.JFrame {

    /**
     * Creates new form JSON
     */
    public JSON() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textUrl = new javax.swing.JTextField();
        btnGetJson = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textHasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alfian Bayu Nur Aji - Latihan JSON");
        setResizable(false);

        textUrl.setText("{   \"args\": {     \"color\": \"red\",      \"shape\": \"oval\"   },    \"headers\": {     \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7\",      \"Accept-Encoding\": \"gzip, deflate, br\",      \"Accept-Language\": \"en-GB,en;q=0.9,id-ID;q=0.8,id;q=0.7,en-US;q=0.6\",      \"Dnt\": \"1\",      \"Host\": \"httpbin.org\",      \"Sec-Ch-Ua\": \"\\\"Chromium\\\";v=\\\"118\\\", \\\"Google Chrome\\\";v=\\\"118\\\", \\\"Not=A?Brand\\\";v=\\\"99\\\"\",      \"Sec-Ch-Ua-Mobile\": \"?0\",      \"Sec-Ch-Ua-Platform\": \"\\\"Windows\\\"\",      \"Sec-Fetch-Dest\": \"document\",      \"Sec-Fetch-Mode\": \"navigate\",      \"Sec-Fetch-Site\": \"cross-site\",      \"Sec-Fetch-User\": \"?1\",      \"Sec-Gpc\": \"1\",      \"Upgrade-Insecure-Requests\": \"1\",      \"User-Agent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.0.0 Safari/537.36\",      \"X-Amzn-Trace-Id\": \"Root=1-65404047-78826dd567845c343ddc616f\"   },    \"origin\": \"182.253.127.61\",    \"url\": \"https://httpbin.org/get?color=red&shape=oval\" }");
        textUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUrlActionPerformed(evt);
            }
        });

        btnGetJson.setText("Get JSON");
        btnGetJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetJsonActionPerformed(evt);
            }
        });

        textHasil.setColumns(20);
        textHasil.setRows(5);
        jScrollPane2.setViewportView(textHasil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(textUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(btnGetJson)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetJson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUrlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUrlActionPerformed

    private void btnGetJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetJsonActionPerformed
        // TODO add your handling code here:
        try {
            URL url = new URL(textUrl.getText());
            InputStreamReader reader = new InputStreamReader(url.openStream());
            MyDto dto = new Gson().fromJson(reader, MyDto.class);
            
            //menampilkan object json
            textHasil.setText(
                    "Header = "+dto.headers+"\n"+
                    "ARGS = "+dto.args+"\n"+
                    "Origin = "+dto.origin+"\n"+
                    "URL = "+dto.url
            );
        } catch (MalformedURLException ex) {
            Logger.getLogger(JSON.class.getName()).log(Level.SEVERE,null,ex);
        } catch (IOException ex) {
            Logger.getLogger(JSON.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btnGetJsonActionPerformed

    private static class MyDto {

        Map<String, String> headers;
        Map<String, String> args;
        String origin;
        String url;
    }
    
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
            java.util.logging.Logger.getLogger(JSON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JSON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JSON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JSON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JSON().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetJson;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textHasil;
    private javax.swing.JTextField textUrl;
    // End of variables declaration//GEN-END:variables
}

