package ir.maralani.hippo.UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class MainWindow extends JFrame implements ActionListener {
	JMenuBar mainBar = new JMenuBar();
	JMenu mainMenu = new JMenu("Main");
	//TODO : add menu items.
	
	JPanel imagePanel = new JPanel();
	
	BufferedImage logo ;
	JLabel logoHolder ;

	
	JPanel dbPanel = new JPanel(new FlowLayout());
	JTextField hostName = new JTextField();
	JTextField port = new JTextField();
	JTextField schema = new JTextField();
	JTextField tableName = new JTextField();
	JTextField userName = new JTextField();
	JPasswordField password = new JPasswordField();
	//TODO : add connection checking button.
	
	
	JPanel filePanel = new JPanel(new FlowLayout());
	JFileChooser fileChooser = new JFileChooser();
	JButton chooseButton = new JButton("Choose File");
	JTextField filePath = new JTextField("Source : ");
	
	FileFilter filter = new FileFilter(){
		public boolean accept (File f){
			if (f.getName().endsWith(".xls") || f.getName().endsWith(".xlsx"))
				return true;
			
			return false;
		}
	
		public String getDescription() {
			
			return "Excel (*.xls, *.xlsx)";
		}
	};
	
	public MainWindow(){
		super("Panther v1.0");
		add(mainBar);
		
		dbPanel.add(hostName);
		dbPanel.add(port);
		dbPanel.add(schema);
		dbPanel.add(tableName);
		dbPanel.add(userName);
		dbPanel.add(password);
		add(dbPanel,BorderLayout.WEST);
		
		filePanel.add(chooseButton);
		filePath.setEnabled(false);
		filePanel.add(filePath);
		add(filePanel, BorderLayout.EAST);
		
		try {
			logo = ImageIO.read(new File("../resource/hippo.png"));
			logoHolder = new JLabel(new ImageIcon(logo));
		} catch (IOException e) {
			logoHolder = null;
			e.printStackTrace();
		}
		imagePanel.add(logoHolder);
		add(imagePanel, BorderLayout.NORTH);
		
		chooseButton.addActionListener(this);
		
		//TODO : add action listener for menu items.
		
		super.setJMenuBar(mainBar);
		super.setSize(700, 700);
		super.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == chooseButton){
			// open file chooser
		}
	}
}
