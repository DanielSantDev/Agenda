package view;

import javax.swing.JFrame;

/**
 *
 * @author Daniel Santana
 */
public class Principal extends javax.swing.JFrame {

    //construtor
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Arquivo = new javax.swing.JMenu();
        Contato = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Cadastro = new javax.swing.JMenu();
        Cidade = new javax.swing.JMenuItem();
        Bairro = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        TipoDeContato = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda De Contatos");
        setResizable(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        Arquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arquivo.png"))); // NOI18N
        Arquivo.setMnemonic('A');
        Arquivo.setText("Arquivo");

        Contato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Contato.setText("Contato");
        Contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContatoActionPerformed(evt);
            }
        });
        Arquivo.add(Contato);
        Arquivo.add(jSeparator1);

        Cadastro.setText("Cadastro");

        Cidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Cidade.setText("Cidade");
        Cadastro.add(Cidade);

        Bairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Bairro.setText("Bairro");
        Cadastro.add(Bairro);
        Cadastro.add(jSeparator2);

        TipoDeContato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        TipoDeContato.setText("Tipo de Contato");
        Cadastro.add(TipoDeContato);

        Arquivo.add(Cadastro);

        jMenuBar1.add(Arquivo);

        Sobre.setMnemonic('S');
        Sobre.setText("Sobre");
        jMenuBar1.add(Sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContatoActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Arquivo;
    private javax.swing.JMenuItem Bairro;
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenuItem Cidade;
    private javax.swing.JMenuItem Contato;
    private javax.swing.JMenu Sobre;
    private javax.swing.JMenuItem TipoDeContato;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
