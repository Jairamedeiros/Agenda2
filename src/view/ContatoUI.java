
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.tools.Diagnostic;

public class ContatoUI extends JFrame{
    
    private JTextField tfPesquisar;
    private JButton btNew, btEdit,btDelete;
    private JTable tbContatos;
    private DefaultTableModel model;
    private JScrollPane scroll;
    
    
    public ContatoUI(){
        setComponents();
        setEvent(); 
    }

    private void setComponents() {
        setLayout(null);
        setTitle("Agenda2");
        setResizable(false);
        setBounds(0,0,400,400);
        setIconImage(new ImageIcon("Images/icons/contatos.png").getImage());
        setBounds(0,0,400,400);
        
        tfPesquisar = new JTextField();
        tfPesquisar.setBounds(10,10,200,32);
        add(tfPesquisar);
        
        btNew = new JButton(new ImageIcon("images/icons/add.png"));
        btNew.setBounds(250,10,32,32);
        btNew.setBackground(new Color(238,238,238)); // representa as tonalidades das cores
        btNew.setBorder(null);
        add(btNew);
        
        btEdit = new JButton(new ImageIcon("images/icons/ed.png"));
        btEdit.setBounds(300,10,32,32);
        btNew.setBackground(new Color(238,238,238)); // representa as tonalidades das cores
        btNew.setBorder(null);
        add(btEdit);
        
        btDelete = new JButton(new ImageIcon("images/icons/del.png"));
        btDelete.setBounds(350,10,32,32);
        btNew.setBackground(new Color(238,238,238)); // representa as tonalidades das cores
        btNew.setBorder(null);       
        add(btDelete);
        
        model = new DefaultTableModel(
                new Object[] {"ID","NOME","TELEFONE"},0);
        
        tbContatos = new JTable(model);
        tbContatos.setRowHeight(30);
        
        tbContatos.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbContatos.getColumnModel().getColumn(1).setPreferredWidth(50);
        tbContatos.getColumnModel().getColumn(2).setPreferredWidth(50);
        
        tbContatos.getColumnModel().getColumn(0).setResizable(false);
        tbContatos.getColumnModel().getColumn(1).setResizable(false);
        tbContatos.getColumnModel().getColumn(2).setResizable(false);
        
        
        //congela as colunas do menu
        tbContatos.getTableHeader().setReorderingAllowed(false);
        
        scroll = new JScrollPane();
        scroll.setViewportView(tbContatos);
        scroll.setBounds(10,70,375,280);
        add(scroll);
               
    }

    private void setEvent() {}
        
        private void loadTable(){
            model.setRowCount(0);
            
            
            
            
        }
        
        
        
        
        
        
    
    
    public static void main(String[] args) {
        ContatoUI frame = new ContatoUI();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension window = Toolkit.getDefaultToolkit().getScreenSize();
        int x= (window.width - frame.getSize().width)/2;
        int y= (window.height - frame.getSize().height)/2;
        frame.setLocation(x,y);
        frame.setVisible(true);
        
        
    }
    
    
}
