package br.com.tiagods.view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;

public class NegociosView extends JInternalFrame {
	private javax.swing.ButtonGroup group_situacao;
    private javax.swing.JButton button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPanePrincipal;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jtableAux;;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private JLabel lblPessoas;
    private JTextField textField_1;
    private JButton btnNovo;
    private JButton btnAlterar;
    private JButton btnExcluir;
    private JButton btnNovo_1;
    private JTextField textField;
    private JLabel lblEmail;
    private JTextField textField_2;
    private JLabel lblWebsite;
    private JButton btnEsconder;
    private JLabel lblBuscar;
    private JTextField textField_3;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel label;
	private JDateChooser dateChooser;
	private JLabel label_1;
	private JDateChooser dateChooser_1;
	private JButton button_1;
	private JComboBox<String> comboBox_1;
	private JLabel label_2;
	private JComboBox<String> comboBox_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NegociosView frame = new NegociosView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NegociosView() {
		initComponents();
	}
	private void initComponents() {

        group_situacao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPanePrincipal = new javax.swing.JScrollPane();
        jScrollPanePrincipal.setBounds(10, 452, 760, 142);
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton1.setBounds(299, 392, 90, 23);
        jButton2 = new javax.swing.JButton();
        jButton2.setBounds(396, 392, 90, 23);
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox1.setBounds(780, 452, 110, 20);
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton1.setBounds(780, 479, 110, 23);
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton2.setBounds(780, 509, 110, 23);
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBounds(0, 0, 1064, 69);
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel4.setBounds(10, 80, 484, 301);
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setBounds(107, 11, 87, 20);
        jLabel17 = new javax.swing.JLabel();
        jLabel17.setBounds(428, 14, 56, 14);
        jLabel14 = new javax.swing.JLabel();
        jLabel14.setBounds(204, 14, 78, 14);
        jLabel15 = new javax.swing.JLabel();
        jLabel15.setBounds(293, 14, 73, 14);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setBounds(10, 14, 56, 14);
        jTextField2 = new javax.swing.JTextField();
        jTextField2.setBounds(107, 39, 175, 20);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(10, 40, 56, 17);
        jTextField3 = new javax.swing.JTextField();
        jTextField3.setBounds(107, 68, 109, 20);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(10, 71, 56, 14);
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox2.setBounds(107, 96, 87, 20);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(10, 96, 56, 18);
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox3.setBounds(346, 95, 92, 20);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(293, 98, 35, 14);
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField1.setBounds(107, 125, 87, 20);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(10, 125, 56, 20);
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField2.setBounds(348, 124, 90, 20);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(293, 124, 51, 20);
        jTextField5 = new javax.swing.JTextField();
        jTextField5.setBounds(107, 185, 175, 20);
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox5.setBounds(10, 185, 56, 20);
        jTextField8 = new javax.swing.JTextField();
        jTextField8.setBounds(348, 184, 35, 20);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setBounds(293, 184, 51, 20);
        jTextField7 = new javax.swing.JTextField();
        jTextField7.setBounds(107, 216, 107, 20);
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setBounds(10, 216, 56, 20);
        jTextField4 = new javax.swing.JTextField();
        jTextField4.setBounds(348, 215, 90, 20);
        jLabel13 = new javax.swing.JLabel();
        jLabel13.setBounds(293, 215, 43, 20);
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox6.setBounds(348, 246, 52, 20);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setBounds(292, 246, 52, 19);
        jTextField6 = new javax.swing.JTextField();
        jTextField6.setBounds(107, 247, 107, 20);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setBounds(10, 249, 56, 17);
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(504, 80, 266, 334);
        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        button = new JButton();
        button.setBounds(203, 391, 90, 23);
        scrollPane = new JScrollPane();
        jtableAux = new javax.swing.JTable();
        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(880, 450));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Nivel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPanePrincipal.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(80);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(80);
        }
        
        jtableAux.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Codigo", "Detahes", "Data"
        	}
        ) {
        	boolean[] columnEditables = new boolean[] {
        		false, false, false
        	};
        	public boolean isCellEditable(int row, int column) {
        		return columnEditables[column];
        	}
        }
        		);
        scrollPane.setViewportView(jtableAux);
        jButton1.setText("Neg\u00F3cios");

        jButton2.setText("Pessoas");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordem Alfab�tica", "Data de Cadastro", "Atualiza��o" }));

        jRadioButton1.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton1.setText("Crescente");

        jRadioButton2.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton2.setText("Decrescente");

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        jComboBox4.setBackground(new java.awt.Color(250, 250, 250));
        jComboBox4.setModel(new DefaultComboBoxModel(new String[] {"Responsavel", "#Pessoa 1", "#Pessoa 2", "#Pessoa 3", "#Pessoa 4", "Todos"}));
        
        jComboBox7.setBackground(new java.awt.Color(250, 250, 250));
        jComboBox7.setModel(new DefaultComboBoxModel(new String[] {"Status", "Em Andamento", "Ganho", "Perdido"}));

        jComboBox8.setBackground(new java.awt.Color(250, 250, 250));
        jComboBox8.setModel(new DefaultComboBoxModel(new String[] {"Etapa", "Indefinida", "Contato", "Envio de Proposta", "Follow-up", "Fechamento"}));

        jComboBox9.setBackground(new java.awt.Color(250, 250, 250));
        jComboBox9.setModel(new DefaultComboBoxModel(new String[] {"Empresa", "#Pessoa 1", "#Pessoa 2", "#Pessoa 3", "#Pessoa 4", "Todos"}));
        
        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pessoa", "Todos"}));
        comboBox.setBackground(new Color(250, 250, 250));
        
        panel = new JPanel();
        panel.setBackground(new Color(250, 250, 250));
        
        label = new JLabel();
        label.setBounds(10, 37, 22, 20);
        label.setText("at\u00E9");
        label.setHorizontalAlignment(SwingConstants.LEFT);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(36, 37, 100, 20);
        
        label_1 = new JLabel();
        label_1.setHorizontalAlignment(SwingConstants.LEFT);
        label_1.setBounds(10, 11, 22, 20);
        label_1.setText("de:");
        
        dateChooser_1 = new JDateChooser();
        dateChooser_1.setBounds(36, 11, 100, 20);
        
        button_1 = new JButton();
        button_1.setBounds(142, 37, 51, 20);
        button_1.setText("OK");
        
        comboBox_1 = new JComboBox<String>();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Meio"}));
        comboBox_1.setBackground(new Color(250, 250, 250));
        
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jComboBox7, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jComboBox8, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jComboBox9, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jComboBox4, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
        			.addGap(37)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(23)
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jComboBox7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jComboBox8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jComboBox9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jComboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel.setLayout(null);
        panel.add(label_1);
        panel.add(label);
        panel.add(dateChooser);
        panel.add(dateChooser_1);
        panel.add(button_1);
        jPanel3.setLayout(jPanel3Layout);

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));

        jLabel17.setText("{Usuario}");

        jLabel14.setText("Cadastro em:");

        jLabel15.setText("{Date###}");

        jLabel10.setText("{COD###}");

        jLabel1.setText("Titulo:");

        jTextField3.setText("00.000.000/000-91");

        jLabel2.setText("CNPJ:");

        jComboBox2.setModel(new DefaultComboBoxModel(new String[] {"Ouro", "Prata", "Diamante"}));

        jLabel3.setText("Nivel:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Meio");

        jFormattedTextField1.setText("(99)3204-0000");

        jLabel5.setText("Telefone:");

        jFormattedTextField2.setText("(00)99999-0000");

        jLabel7.setText("Celular");

        jComboBox5.setModel(new DefaultComboBoxModel(new String[] {"Rua", "Av."}));

        jLabel11.setText("N�:");

        jLabel12.setText("Compl:");

        jLabel13.setText("Bairro:");

        jComboBox6.setModel(new DefaultComboBoxModel(new String[] {"SP", "MG", "RS"}));

        jLabel9.setText("Estado:");

        jLabel8.setText("Cidade:");
        jButton3 = new javax.swing.JButton();
        jButton3.setBounds(192, 278, 90, 23);
        
                jButton3.setText("Editar");
        jButton4 = new javax.swing.JButton();
        jButton4.setBounds(288, 278, 90, 23);
        
                jButton4.setText("Salvar");
        
        btnExcluir = new JButton();
        btnExcluir.setBounds(384, 278, 90, 23);
        btnExcluir.setText("Excluir");
        
        btnNovo_1 = new JButton();
        btnNovo_1.setBounds(96, 278, 90, 23);
        btnNovo_1.setText("Novo");
        
        lblPessoas = new JLabel("Historico");
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        
        btnNovo = new JButton("Novo");
        
        btnAlterar = new JButton("Alterar");
        
        JScrollPane scrollPane_1 = new JScrollPane();
        
        btnEsconder = new JButton("Esconder");
        
        
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblPessoas, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
        					.addComponent(btnEsconder))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addContainerGap(129, Short.MAX_VALUE)
        					.addComponent(btnNovo, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnAlterar))
        				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
        				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblPessoas)
        				.addComponent(btnEsconder))
        			.addGap(4)
        			.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(7)
        			.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(13)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNovo)
        				.addComponent(btnAlterar))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        
        JTextArea textArea = new JTextArea();
        scrollPane_1.setViewportView(textArea);
        jPanel2.setLayout(jPanel2Layout);
        
        button.setText("Historico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1.setLayout(null);
        jPanel1.add(jPanel3);
        jPanel1.add(jScrollPanePrincipal);
        jPanel1.add(jRadioButton1);
        jPanel1.add(jRadioButton2);
        jPanel1.add(jComboBox1);
        jPanel1.add(button);
        jPanel1.add(jButton1);
        jPanel1.add(jButton2);
        jPanel1.add(jPanel4);
        jPanel4.setLayout(null);
        jPanel4.add(jLabel10);
        jPanel4.add(jLabel8);
        jPanel4.add(jLabel3);
        jPanel4.add(jLabel5);
        jPanel4.add(jComboBox5);
        jPanel4.add(jLabel1);
        jPanel4.add(jLabel2);
        jPanel4.add(jLabel12);
        jPanel4.add(jComboBox2);
        jPanel4.add(jLabel4);
        jPanel4.add(jComboBox3);
        jPanel4.add(jTextField5);
        jPanel4.add(jTextField6);
        jPanel4.add(jTextField7);
        jPanel4.add(jTextField1);
        jPanel4.add(jTextField2);
        jPanel4.add(jFormattedTextField1);
        jPanel4.add(jLabel9);
        jPanel4.add(jComboBox6);
        jPanel4.add(jLabel11);
        jPanel4.add(jLabel7);
        jPanel4.add(jLabel13);
        jPanel4.add(jFormattedTextField2);
        jPanel4.add(jTextField8);
        jPanel4.add(jTextField4);
        jPanel4.add(jLabel17);
        jPanel4.add(jLabel14);
        jPanel4.add(jLabel15);
        jPanel4.add(jTextField3);
        jPanel4.add(btnNovo_1);
        jPanel4.add(jButton3);
        jPanel4.add(jButton4);
        jPanel4.add(btnExcluir);
        
        textField = new JTextField();
        textField.setBounds(107, 154, 175, 20);
        jPanel4.add(textField);
        
        lblEmail = new JLabel();
        lblEmail.setText("E-mail");
        lblEmail.setBounds(10, 154, 56, 20);
        jPanel4.add(lblEmail);
        
        textField_2 = new JTextField();
        textField_2.setBounds(348, 155, 126, 20);
        jPanel4.add(textField_2);
        
        lblWebsite = new JLabel();
        lblWebsite.setText("Site");
        lblWebsite.setBounds(293, 155, 43, 20);
        jPanel4.add(lblWebsite);
        
        label_2 = new JLabel();
        label_2.setText("Responsavel:");
        label_2.setBounds(293, 42, 87, 17);
        jPanel4.add(label_2);
        
        comboBox_2 = new JComboBox<String>();
        comboBox_2.setBounds(384, 40, 92, 20);
        jPanel4.add(comboBox_2);
        jPanel1.add(jPanel2);
        
        lblBuscar = new JLabel("Buscar");
        lblBuscar.setBounds(10, 428, 53, 14);
        jPanel1.add(lblBuscar);
        
        textField_3 = new JTextField();
        textField_3.setBounds(74, 425, 139, 20);
        jPanel1.add(textField_3);
        textField_3.setColumns(10);

        setBounds(0, 0, 1250, 660);
    }
}
