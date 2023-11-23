package usedTradingSystem;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class joinFrame extends JFrame implements ActionListener {
	JButton jb1, jb2, jb3;

	public joinFrame() {
		Container ct = getContentPane();
		ct.setLayout(null);
		
		jb1 = new JButton("뒤로가기");	 //뒤로가기 버튼을 통해 다시 메인프레임으로 돌아감
		
		jb1.setBounds(400, 200, 200, 60);	//뒤로가기 버튼 속성

		jb1.addActionListener(this);
		
		ct.add(jb1);
		
		setTitle("UsedTradingSystem");
		setSize(600, 300);	//프레임창 사이즈 다시 조절하기
		
		setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb1) {				//jb1 버튼 클릭시 실행
			setVisible(false);
		}
	}
	
}
