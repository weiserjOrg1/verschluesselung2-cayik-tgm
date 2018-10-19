package cayik.cipher;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;

import javax.swing.*;
import javax.swing.*; 

public class View extends JFrame{
	//private MonoAlphabeticCipher m1; 
	
	private JTextField shift; 
	private JTextField sub; 
	private JTextField in;
	private JTextField out;
	
	private JLabel subVerschl;
	private JLabel shiftVerschl;
	private JLabel input; 
	private JLabel output; 
	
	private JRadioButton subAuswahl;
	private JRadioButton shiftAuswahl;
	private ButtonGroup buttongroup1; 
	private JButton buttonEnc;
	private JButton buttonDec;
	private JButton buttonApl;
	private JButton buttonRes;
	
	private JPanel selbox;
	private JPanel alphbox;
	private JPanel settingsbox;
	private JPanel inout; 
	
	private Controll c1;
	private Model m1; 
	
	public View(Controll c, Model m){
		this.c1=c; 
		this.m1=m; 
		
		this.setTitle("Verschlüsselung");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout()); 
		
		//Buttons:
		this.subAuswahl= new JRadioButton("Sub");
		this.shiftAuswahl= new JRadioButton("Shift", true);
		
		this.subAuswahl.addActionListener((ActionListener) this.c1);
		this.subAuswahl.addFocusListener((FocusListener) this.c1);
		
		this.shiftAuswahl.addActionListener((ActionListener) this.c1);
		this.shiftAuswahl.addFocusListener((FocusListener) this.c1);
		
		this.buttongroup1= new ButtonGroup(); 
		this.buttongroup1.add(this.subAuswahl);
		this.buttongroup1.add(this.shiftAuswahl);
		
		this.buttonApl=new JButton("Generate");
		this.buttonApl.addActionListener((ActionListener) this.c1);
		this.buttonRes= new JButton("Return"); 
		this.buttonRes.addActionListener((ActionListener) this.c1);
		
		this.buttonEnc= new JButton("Encrypt");
		this.buttonDec= new JButton("Decrypt");
		
		
		
		//Panels
		this.selbox= new JPanel(); 
		this.add(this.selbox, BorderLayout.WEST);
		
		this.alphbox= new JPanel(); 
		this.add(this.alphbox, BorderLayout.CENTER);
		
		this.settingsbox= new JPanel(); 
		this.add(this.settingsbox, BorderLayout.EAST); 
		
		this.inout=new JPanel(); 
		this.add(this.inout, BorderLayout.SOUTH);
		
		//Selection-Box
		this.selbox.add(this.subAuswahl);
		this.selbox.add(this.shiftAuswahl);
		
		//Alphabet-Selection-Box
		this.subVerschl= new JLabel("Substitution:"); 
		this.shiftVerschl= new JLabel ("Shift:");
		this.shift= new JTextField();
		this.sub=new JTextField(); 
		
		this.alphbox.setLayout(new GridLayout(3,2));
		this.alphbox.add(this.subVerschl);
		this.alphbox.add(this.shift);
		
		this.alphbox.add(this.shiftVerschl);
		this.alphbox.add(this.shift);
		
		this.alphbox.add(this.buttonApl);
		this.alphbox.add(this.buttonRes);
		
		//Settings-Box
		this.settingsbox.add(this.buttonEnc); 
		this.settingsbox.add(this.buttonDec);
		
		
		
		
	}
	
}