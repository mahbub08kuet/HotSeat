/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RoundButton.java
 *
 * Created on Jul 6, 2010, 2:23:17 AM
 */

package my;

/**
 *
 * @author RPM
 */
public class RoundButton extends javax.swing.JPanel {

    /** Creates new form RoundButton */
    public RoundButton() {
        initComponents();
    }

    public void setLabel(String text)
    {
        textJLabel.setText(text);
    }


//    public void set

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textJLabel = new javax.swing.JLabel();

        setOpaque(false);

        textJLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24));
        textJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textJLabel.setText("50-50");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel textJLabel;
    // End of variables declaration//GEN-END:variables

}