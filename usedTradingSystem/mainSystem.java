package usedTradingSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class mainFrame extends JFrame implements ActionListener {

	JButton jb1, jb2;
	public mainFrame() {
		Container ct = getContentPane();
		ct.setLayout(null);
		
		jb1 = new JButton("로그인");
		jb2 = new JButton("회원가입");
		
		jb1.setBounds(400, 550, 200, 60);
		jb2.setBounds(400, 600, 200, 60);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		ct.add(jb1);
		ct.add(jb2);
		
		setTitle("UsedTradingSystem");
		setSize(1000, 800);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb1) {
			setVisible(false);
			loginFrame lf = new loginFrame();
			lf.setVisible(true);
		}
		else if(e.getSource() == jb2) {
			joinFrame jf = new joinFrame();
			jf.setVisible(true);
		}
	}
}

public class mainSystem {
	public static void main(String[] args) {
		new mainFrame();
	}
}
