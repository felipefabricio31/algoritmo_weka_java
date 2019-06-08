/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_weka_prova;

import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

/**
 *
 * @author felip
 */
public class Prova extends javax.swing.JFrame
{

    /**
     * Creates new form Prov
     */
    public Prova()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel31 = new javax.swing.JLabel();
        ComboBox_Regiao = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        ComboboxIdade9 = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        ComboboxFaixaPeso3 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        ComboboxIdade10 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        ComboboxIdade11 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        Combobox_FrequenciaRegrigerante3 = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        Combobox_TipoRefrigerante3 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        ComboBox_BebeBebidaAlcoolica = new javax.swing.JComboBox<>();
        ComboBox_FequenciaBebeAlcool = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        ComboBox_FazExerciciosFisicos = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        ComboBox_Fumante = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        ComboBox_EstadoSaude = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        ComboBox_TemPressaoAlta = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        ComboBox_TemDiabetes = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        ComboBox_TemColesterolTrigricerides = new javax.swing.JComboBox<>();
        ComboBox_TemColesterolTrigricerides1 = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel31.setText("Região");

        ComboBox_Regiao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "centrooeste", "nordeste", "norte", "sudeste", "sul" }));

        jLabel32.setText("Idade");

        ComboboxIdade9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", ">=65", "25-34", "35-44", "45-54", "55-64" }));

        jLabel33.setText("Peso ");

        ComboboxFaixaPeso3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "101-112", "113-124", "125-136", "30-40", "41-52", "53-64", "65-76", "77-88", "89-100" }));

        jLabel34.setText("Altura");

        ComboboxIdade10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "101-112", "113-124", "125-136", "30-40", "41-52", "53-64", "65-76", "77-88", "89-100" }));

        jLabel35.setText("Come Carne com Gordura");

        ComboboxIdade11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "ComeComGordura", "comercomagordura", "naocomecarnevermelhacommuitagordura", "tirarsempreoexcessodegordura", "tirasempreoexcessodegordura" }));

        jLabel37.setText("Frequência de refrigerante");
        jLabel37.setToolTipText("Quantas vezes come carne com gordura?");

        Combobox_FrequenciaRegrigerante3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1-2dias", "3-4dias", "5-6dias", "nunca", "quasenunca", "todos" }));

        jLabel38.setText("Tipo de Refrigerante");
        jLabel38.setToolTipText("Quantas vezes come carne com gordura?");

        Combobox_TipoRefrigerante3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "ambos", "diet/light/zero", "normal" }));

        jLabel41.setText("Bebe bebida alcoolica");

        ComboBox_BebeBebidaAlcoolica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sim", "nao" }));
        ComboBox_BebeBebidaAlcoolica.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBox_BebeBebidaAlcoolicaActionPerformed(evt);
            }
        });

        ComboBox_FequenciaBebeAlcool.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "nao_informou", "1-2_dias", "3-4_dias", "5-6_dias", "todos" }));

        jLabel42.setText("Freq. bebe Alcool (em dias)");
        jLabel42.setToolTipText("Frequencia que bebe bebida alcoolica");

        jLabel43.setText("Faz exercicios físicos");

        ComboBox_FazExerciciosFisicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sim", "nao" }));
        ComboBox_FazExerciciosFisicos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBox_FazExerciciosFisicosActionPerformed(evt);
            }
        });

        jLabel44.setText("Fumante?");

        ComboBox_Fumante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nao", "sim_diariamente", "sim_mas_nao_diariamente" }));
        ComboBox_Fumante.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBox_FumanteActionPerformed(evt);
            }
        });

        jLabel45.setText("Estado de Saúde");

        ComboBox_EstadoSaude.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "bom", "muito_bom", "muito_ruim", "regular", "ruim" }));
        ComboBox_EstadoSaude.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBox_EstadoSaudeActionPerformed(evt);
            }
        });

        jLabel46.setText("Tem pressão alta?");

        ComboBox_TemPressaoAlta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sim", "nao" }));
        ComboBox_TemPressaoAlta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBox_TemPressaoAltaActionPerformed(evt);
            }
        });

        jLabel47.setText("Tem diabetes?");

        ComboBox_TemDiabetes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sim", "nao" }));
        ComboBox_TemDiabetes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBox_TemDiabetesActionPerformed(evt);
            }
        });

        jLabel48.setText("Tem colesterol ou trigriceres?");

        ComboBox_TemColesterolTrigricerides.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sim", "nao" }));
        ComboBox_TemColesterolTrigricerides.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBox_TemColesterolTrigriceridesActionPerformed(evt);
            }
        });

        ComboBox_TemColesterolTrigricerides1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sim", "nao" }));
        ComboBox_TemColesterolTrigricerides1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ComboBox_TemColesterolTrigricerides1ActionPerformed(evt);
            }
        });

        jLabel49.setText("Obesidade?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(ComboBox_Regiao, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(ComboboxIdade9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboboxFaixaPeso3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboboxIdade10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboboxIdade11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBox_BebeBebidaAlcoolica, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBox_FequenciaBebeAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboBox_FazExerciciosFisicos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboBox_Fumante, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel43)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel44)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(ComboBox_EstadoSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBox_TemPressaoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBox_TemDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBox_TemColesterolTrigricerides, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBox_TemColesterolTrigricerides1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Combobox_TipoRefrigerante3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(Combobox_FrequenciaRegrigerante3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComboboxIdade11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboboxIdade10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboboxFaixaPeso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboboxIdade9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox_Regiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel37)
                                .addComponent(jLabel38))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Combobox_TipoRefrigerante3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Combobox_FrequenciaRegrigerante3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel47)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_BebeBebidaAlcoolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_FequenciaBebeAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_FazExerciciosFisicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_Fumante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_EstadoSaude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_TemPressaoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_TemDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_TemColesterolTrigricerides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_TemColesterolTrigricerides1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(373, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBox_BebeBebidaAlcoolicaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBox_BebeBebidaAlcoolicaActionPerformed
    {//GEN-HEADEREND:event_ComboBox_BebeBebidaAlcoolicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_BebeBebidaAlcoolicaActionPerformed

    private void ComboBox_FazExerciciosFisicosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBox_FazExerciciosFisicosActionPerformed
    {//GEN-HEADEREND:event_ComboBox_FazExerciciosFisicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_FazExerciciosFisicosActionPerformed

    private void ComboBox_FumanteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBox_FumanteActionPerformed
    {//GEN-HEADEREND:event_ComboBox_FumanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_FumanteActionPerformed

    private void ComboBox_EstadoSaudeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBox_EstadoSaudeActionPerformed
    {//GEN-HEADEREND:event_ComboBox_EstadoSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_EstadoSaudeActionPerformed

    private void ComboBox_TemPressaoAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBox_TemPressaoAltaActionPerformed
    {//GEN-HEADEREND:event_ComboBox_TemPressaoAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_TemPressaoAltaActionPerformed

    private void ComboBox_TemDiabetesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBox_TemDiabetesActionPerformed
    {//GEN-HEADEREND:event_ComboBox_TemDiabetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_TemDiabetesActionPerformed

    private void ComboBox_TemColesterolTrigriceridesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBox_TemColesterolTrigriceridesActionPerformed
    {//GEN-HEADEREND:event_ComboBox_TemColesterolTrigriceridesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_TemColesterolTrigriceridesActionPerformed

    private void ComboBox_TemColesterolTrigricerides1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBox_TemColesterolTrigricerides1ActionPerformed
    {//GEN-HEADEREND:event_ComboBox_TemColesterolTrigricerides1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_TemColesterolTrigricerides1ActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Prova().setVisible(true);
            }
        });
    }
    
    public void Probablidades() throws Exception
    {
        // TODO code application logic here
        //Instacia da base de dados
        ConverterUtils.DataSource ds = new ConverterUtils.DataSource("src/Dados/DadosProva.arff");
        //Atribuição dos valores da API para ins
        Instances ins =  ds.getDataSet();
        //System.out.println(ins.toString());
        
        //Qual atributo eu quero fazer a previsão
        ins.setClassIndex(16);
        
        //Este será o algoritmo que vai fazer a previsão
        NaiveBayes nb = new NaiveBayes();
        //Cria o classificador
        nb.buildClassifier(ins);
        
        Instance novo = new DenseInstance(17);
        //Está relacionado o novo registro com a base de dados
        novo.setDataset(ins);
        novo.setValue(0,ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(1, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(2, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(3, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(4, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(5, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(6, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(7, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(8, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(9, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(10, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(11, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(12, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(13, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(14, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(15, ComboBox_Regiao.getSelectedItem().toString());
        novo.setValue(16, ComboBox_Regiao.getSelectedItem().toString());
        
        //Qual a porcentagem desta pessoa gastar muito
        double probabilidade[] = nb.distributionForInstance(novo);
        System.out.println("Sim: " + probabilidade[1]);
        System.out.println("Não: " + probabilidade[0]);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_BebeBebidaAlcoolica;
    private javax.swing.JComboBox<String> ComboBox_EstadoSaude;
    private javax.swing.JComboBox<String> ComboBox_FazExerciciosFisicos;
    private javax.swing.JComboBox<String> ComboBox_FequenciaBebeAlcool;
    private javax.swing.JComboBox<String> ComboBox_Fumante;
    private javax.swing.JComboBox<String> ComboBox_Regiao;
    private javax.swing.JComboBox<String> ComboBox_TemColesterolTrigricerides;
    private javax.swing.JComboBox<String> ComboBox_TemColesterolTrigricerides1;
    private javax.swing.JComboBox<String> ComboBox_TemDiabetes;
    private javax.swing.JComboBox<String> ComboBox_TemPressaoAlta;
    private javax.swing.JComboBox<String> ComboboxFaixaPeso3;
    private javax.swing.JComboBox<String> ComboboxIdade10;
    private javax.swing.JComboBox<String> ComboboxIdade11;
    private javax.swing.JComboBox<String> ComboboxIdade9;
    private javax.swing.JComboBox<String> Combobox_FrequenciaRegrigerante3;
    private javax.swing.JComboBox<String> Combobox_TipoRefrigerante3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    // End of variables declaration//GEN-END:variables
}
