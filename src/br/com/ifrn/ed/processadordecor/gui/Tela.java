package br.com.ifrn.ed.processadordecor.gui;

import br.com.ifrn.ed.processadordecor.Cor;
import br.com.ifrn.ed.processadordecor.MySequentialQueue;
import br.com.ifrn.ed.processadordecor.utils.Cores;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Tela extends javax.swing.JFrame {

    private MySequentialQueue cores;
    private MySequentialQueue processAux;
    private Cor cor;
    private Timer timer;
    private int count = 0;

    public Tela() {
        initComponents();
        cores = new MySequentialQueue();
        radioSequencial.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filaTipo = new javax.swing.ButtonGroup();
        PainelInserirProcesso = new javax.swing.JPanel();
        labelCor = new javax.swing.JLabel();
        labelTempo = new javax.swing.JLabel();
        BotaoAddProcesso = new javax.swing.JButton();
        ComboBoxCor = new javax.swing.JComboBox<>();
        ComboBoxTempo = new javax.swing.JComboBox<>();
        labelPrioridade = new javax.swing.JLabel();
        comboBoxPrioridade = new javax.swing.JComboBox<>();
        radioCircular = new javax.swing.JRadioButton();
        radioSequencial = new javax.swing.JRadioButton();
        labelCor1 = new javax.swing.JLabel();
        PainelListaProcessos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProcesso = new javax.swing.JLabel();
        PainelProcessadorDeCor = new javax.swing.JPanel();
        LabelTempoDecorrido = new javax.swing.JLabel();
        LabelNomeDaCor = new javax.swing.JLabel();
        TextoDoNomeDaCor = new javax.swing.JTextField();
        TextoTempoDecorrido = new javax.swing.JTextField();
        botaoIniciarProcesso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.darkGray);
        setMinimumSize(new java.awt.Dimension(800, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelInserirProcesso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inserir Processo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 18)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 14))); // NOI18N
        PainelInserirProcesso.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N

        labelCor.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelCor.setText("Cor:");

        labelTempo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelTempo.setText("Tempo:");

        BotaoAddProcesso.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        BotaoAddProcesso.setForeground(java.awt.Color.blue);
        BotaoAddProcesso.setText("Add");
        BotaoAddProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAddProcessoActionPerformed(evt);
            }
        });

        ComboBoxCor.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        ComboBoxCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Verde", "Vermelho", "Cinza", "Preto", "Roxo" }));
        ComboBoxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCorActionPerformed(evt);
            }
        });

        ComboBoxTempo.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        ComboBoxTempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        labelPrioridade.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelPrioridade.setText("Prioridade");

        comboBoxPrioridade.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        comboBoxPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Normal", "Baixa" }));

        filaTipo.add(radioCircular);
        radioCircular.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        radioCircular.setText("Circular");

        filaTipo.add(radioSequencial);
        radioSequencial.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        radioSequencial.setText("Sequencial");

        labelCor1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        labelCor1.setText("Modo:");

        javax.swing.GroupLayout PainelInserirProcessoLayout = new javax.swing.GroupLayout(PainelInserirProcesso);
        PainelInserirProcesso.setLayout(PainelInserirProcessoLayout);
        PainelInserirProcessoLayout.setHorizontalGroup(
            PainelInserirProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelInserirProcessoLayout.createSequentialGroup()
                .addGroup(PainelInserirProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelInserirProcessoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoAddProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelInserirProcessoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(PainelInserirProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPrioridade)
                            .addComponent(labelTempo)
                            .addComponent(labelCor))
                        .addGap(18, 18, 18)
                        .addGroup(PainelInserirProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(PainelInserirProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCor1)
                            .addComponent(radioCircular)
                            .addComponent(radioSequencial))))
                .addGap(74, 74, 74))
        );
        PainelInserirProcessoLayout.setVerticalGroup(
            PainelInserirProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInserirProcessoLayout.createSequentialGroup()
                .addGroup(PainelInserirProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelInserirProcessoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(PainelInserirProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCor)
                            .addComponent(ComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(PainelInserirProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTempo)
                            .addComponent(ComboBoxTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelInserirProcessoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCor1)
                        .addGap(5, 5, 5)
                        .addComponent(radioCircular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioSequencial)
                        .addGap(18, 18, 18)))
                .addGroup(PainelInserirProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelInserirProcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelPrioridade)
                        .addComponent(comboBoxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotaoAddProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(PainelInserirProcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 510, 190));

        PainelListaProcessos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Processos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 18))); // NOI18N

        listaProcesso.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        listaProcesso.setForeground(java.awt.Color.red);
        jScrollPane1.setViewportView(listaProcesso);

        javax.swing.GroupLayout PainelListaProcessosLayout = new javax.swing.GroupLayout(PainelListaProcessos);
        PainelListaProcessos.setLayout(PainelListaProcessosLayout);
        PainelListaProcessosLayout.setHorizontalGroup(
            PainelListaProcessosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        PainelListaProcessosLayout.setVerticalGroup(
            PainelListaProcessosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        getContentPane().add(PainelListaProcessos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 510, 90));

        PainelProcessadorDeCor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Processador de Cor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 18))); // NOI18N

        javax.swing.GroupLayout PainelProcessadorDeCorLayout = new javax.swing.GroupLayout(PainelProcessadorDeCor);
        PainelProcessadorDeCor.setLayout(PainelProcessadorDeCorLayout);
        PainelProcessadorDeCorLayout.setHorizontalGroup(
            PainelProcessadorDeCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        PainelProcessadorDeCorLayout.setVerticalGroup(
            PainelProcessadorDeCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        getContentPane().add(PainelProcessadorDeCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 510, 150));

        LabelTempoDecorrido.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        LabelTempoDecorrido.setText("Tempo:");
        getContentPane().add(LabelTempoDecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, -1, -1));

        LabelNomeDaCor.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        LabelNomeDaCor.setText("Nome da cor:");
        getContentPane().add(LabelNomeDaCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, -1, -1));

        TextoDoNomeDaCor.setEditable(false);
        TextoDoNomeDaCor.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        TextoDoNomeDaCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoDoNomeDaCorActionPerformed(evt);
            }
        });
        getContentPane().add(TextoDoNomeDaCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 537, 120, 50));

        TextoTempoDecorrido.setEditable(false);
        TextoTempoDecorrido.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        TextoTempoDecorrido.setText(" ");
        getContentPane().add(TextoTempoDecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 70, 40));

        botaoIniciarProcesso.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        botaoIniciarProcesso.setForeground(java.awt.Color.green);
        botaoIniciarProcesso.setText("Iniciar");
        botaoIniciarProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarProcessoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoIniciarProcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 130, 60));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("Processador de Cor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoDoNomeDaCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoDoNomeDaCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoDoNomeDaCorActionPerformed

    private void ComboBoxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCorActionPerformed

    private void BotaoAddProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAddProcessoActionPerformed
        String cor = (String) ComboBoxCor.getSelectedItem();
        int tempo = Integer.parseInt((String) ComboBoxTempo.getSelectedItem());
        /* Como a ordem é ALTA = 0, NORMAL = 1, BAIXA = 2 e só diminuir o selecionado pelo total que 
        vai gerar a prioridade correspondete a classe Priotidades*/
        int prioridade = comboBoxPrioridade.getItemCount() - comboBoxPrioridade.getSelectedIndex();
        Cor novaCor = new Cor(tempo, cor, prioridade);
        //
        processAux = new MySequentialQueue();
        while (!cores.isEmpty() && cores.firstElement().getPrioridade() >= novaCor.getPrioridade()) {
            processAux.enqueue(cores.dequeue());
        }
        
        processAux.enqueue(novaCor);
        while (!cores.isEmpty()) {
            processAux.enqueue(cores.dequeue());
        }
        
        while(!processAux.isEmpty()){
            cores.enqueue(processAux.dequeue());
        }
                                
        listaProcesso.setText(cores.listarFila());
        
    }//GEN-LAST:event_BotaoAddProcessoActionPerformed

    private void botaoIniciarProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIniciarProcessoActionPerformed
        
        
        if (radioSequencial.isSelected()) {
            cor = cores.dequeue();
            setColors();

            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count >= cor.getTempo()) {
                        if (cores.isEmpty()) {
                            timer.stop();
                        } else {
                            cor = cores.dequeue();
                            count = 0;
                        }
                    }
                    setColors();
                    listaProcesso.setText(cores.listarFila());
                    TextoTempoDecorrido.setText(cor.getTempo() - count + "s");
                    count++;
                }
            });
            timer.setInitialDelay(0);
            timer.start();
        }else{
            System.out.println("Circular marcado!");
        }
    }//GEN-LAST:event_botaoIniciarProcessoActionPerformed

    private void setColors() {
        TextoDoNomeDaCor.setText(cor.getCor());
        switch (cor.getCor()) {
            case Cores.AZUL:
                PainelProcessadorDeCor.setBackground(Color.blue);
                break;
            case Cores.VERMELHO:
                PainelProcessadorDeCor.setBackground(Color.red);
                break;
            case Cores.VERDE:
                PainelProcessadorDeCor.setBackground(Color.green);
                break;
            case Cores.CINZA:
                PainelProcessadorDeCor.setBackground(Color.gray);
                break;
            case Cores.ROXO:
                PainelProcessadorDeCor.setBackground(Color.magenta);
                break;
            case Cores.PRETO:
                PainelProcessadorDeCor.setBackground(Color.black);
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAddProcesso;
    private javax.swing.JComboBox<String> ComboBoxCor;
    private javax.swing.JComboBox<String> ComboBoxTempo;
    private javax.swing.JLabel LabelNomeDaCor;
    private javax.swing.JLabel LabelTempoDecorrido;
    private javax.swing.JPanel PainelInserirProcesso;
    private javax.swing.JPanel PainelListaProcessos;
    private javax.swing.JPanel PainelProcessadorDeCor;
    private javax.swing.JTextField TextoDoNomeDaCor;
    private javax.swing.JTextField TextoTempoDecorrido;
    private javax.swing.JButton botaoIniciarProcesso;
    private javax.swing.JComboBox<String> comboBoxPrioridade;
    private javax.swing.ButtonGroup filaTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelCor1;
    private javax.swing.JLabel labelPrioridade;
    private javax.swing.JLabel labelTempo;
    private javax.swing.JLabel listaProcesso;
    private javax.swing.JRadioButton radioCircular;
    private javax.swing.JRadioButton radioSequencial;
    // End of variables declaration//GEN-END:variables
}
