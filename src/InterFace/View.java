package InterFace;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Program.program;

public class View extends JFrame {

	/*****宣告介面*****/
	Container cp = this.getContentPane();
	
	/*****宣告元件*****/
	public static JPanel photo = new JPanel();
	JButton run = new JButton("選擇");
	
	View()
	{
		/*****視窗設定*****/
		this.setSize(1300, 1300);
		this.setLayout(null);
		this.setTitle("要吃什麼？");
		
		/*****設定元件*****/
		photo.setBounds(10, 10, 1000, 1300);
		run.setBounds(1100, 10, 150, 30);
		
		/*****設定Panel框線*****/
		photo.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
		
		/*****將物件加入介面*****/
		cp.add(run);
		cp.add(photo);
		
		run.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				program.choose();
			}});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new View();
	}

}
