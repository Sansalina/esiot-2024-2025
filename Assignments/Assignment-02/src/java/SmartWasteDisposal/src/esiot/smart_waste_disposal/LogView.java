package esiot.smart_waste_disposal;

import java.util.Date;

import javax.swing.*;

class LogView extends JFrame  {

	private JTextArea log;

	public LogView(){
		super("Log ");
		setSize(600,600);
		this.setResizable(false);
		JPanel mainPanel = new JPanel();
		log = new JTextArea(30,40);
		log.setEditable(false);
		JScrollPane scrol = new JScrollPane(log);
		mainPanel.add(scrol);
		this.getContentPane().add(mainPanel);
	}
	
	public void log(String msg){
		SwingUtilities.invokeLater(() -> {
			String date = new Date().toString();
			log.append("["+date+"] "+ msg +"\n");
		});
	}
	
	public void display() {
		SwingUtilities.invokeLater(() -> {
			this.setVisible(true);
		});
	}
}
