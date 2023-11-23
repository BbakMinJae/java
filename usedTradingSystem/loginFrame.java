package usedTradingSystem;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class loginFrame extends JFrame implements ActionListener {
	JButton loginBtn, backBtn, jb3;
	JLabel usernameLabel, passwordLabel;
	JTextField userIdField, passwordField;

	public loginFrame() {
		Container ct = getContentPane();
//		ct.setLayout(null);
		setLocationRelativeTo(null);
		

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
		
		//버튼
		backBtn = new JButton("뒤로가기");	 //뒤로가기 버튼을 통해 다시 메인프레임으로 돌아감
		loginBtn = new JButton("로그인");
		
//		backBtn.setBounds(800, 700, 200, 60);	//뒤로가기 버튼 속성

		
		//라벨 - 아이디, 패스워드
		usernameLabel = new JLabel("아이디 : ");
		passwordLabel = new JLabel("비밀번호 : ");
		
		//아이디, 패스워드 입력창
		userIdField = new JTextField();
		passwordField = new JTextField();

		//컴포넌트 추가 및 수정
		backBtn.addActionListener(this);
		loginBtn.addActionListener(this);
		
		panel.add(usernameLabel);
		panel.add(passwordLabel);
		panel.add(userIdField);
		panel.add(passwordField);
		panel.add(loginBtn);
		
		ct.add(panel);
		ct.add(backBtn);

		setTitle("UsedTradingSystem");
		setSize(1000, 800);
		
//		setVisible(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backBtn) {				//backBtn 버튼 클릭시 실행
			setVisible(false);
			mainFrame mf = new mainFrame();
			mf.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new loginFrame();
	}
}