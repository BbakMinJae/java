package usedTradingSystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JoinFrame extends JFrame implements ActionListener {
	private JTextField nameField, idField, birthdateField, phoneNumberField;
    private JPasswordField passwordField, confirmPasswordField;
	JButton confirmIdBtn, submitBtn, backBtn;

	public JoinFrame() {
		//프레임 설정
		setTitle("회원가입");
		setSize(350, 400);	//프레임창 사이즈 다시 조절하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 패널 및 레이아웃 매니저 설정
		JPanel mainPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		
		// 이름 입력
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(new JLabel("이름"), gbc);

        gbc.gridx = 1;
        nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(100, 30));	//버튼 사이즈 조절
        mainPanel.add(nameField, gbc);

        // 아이디 입력
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(new JLabel("아이디"), gbc);
        
        gbc.gridx = 1;
        idField = new JTextField();
        idField.setPreferredSize(new Dimension(100, 30));	//버튼 사이즈 조절
        mainPanel.add(idField, gbc);
        
        //아이디 중복 확인
        gbc.gridx = 2;
        confirmIdBtn = new JButton("확인");
//        confirmIdBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
        confirmIdBtn.setPreferredSize(new Dimension(60, 30));	//버튼 사이즈 조절
        confirmIdBtn.addActionListener(this);

        mainPanel.add(confirmIdBtn, gbc);
        
        // 비밀번호 입력
        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(new JLabel("비밀번호"), gbc);

        gbc.gridx = 1;
        passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(100, 30));	//버튼 사이즈 조절
        mainPanel.add(passwordField, gbc);

        // 비밀번호 확인 입력
        gbc.gridx = 0;
        gbc.gridy = 3;
        mainPanel.add(new JLabel("비밀번호 확인"), gbc);

        gbc.gridx = 1;
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setPreferredSize(new Dimension(100, 30));	//버튼 사이즈 조절
        mainPanel.add(confirmPasswordField, gbc);

        // 생년월일 입력
        gbc.gridx = 0;
        gbc.gridy = 4;
        mainPanel.add(new JLabel("생년월일"), gbc);

        gbc.gridx = 1;
        birthdateField = new JTextField();
        birthdateField.setPreferredSize(new Dimension(100, 30));	//버튼 사이즈 조절
        mainPanel.add(birthdateField, gbc);

        // 전화번호 입력
        gbc.gridx = 0;
        gbc.gridy = 5;
        mainPanel.add(new JLabel("전화번호"), gbc);

        gbc.gridx = 1;
        phoneNumberField = new JTextField();
        phoneNumberField.setPreferredSize(new Dimension(100, 30));	//버튼 사이즈 조절
        mainPanel.add(phoneNumberField, gbc);

        // 제출 버튼
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        submitBtn = new JButton("제출");
        submitBtn.addActionListener(this);
        mainPanel.add(submitBtn, gbc);
        
        // 취소 버튼
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
		backBtn = new JButton("취소");
		backBtn.addActionListener(this);
		mainPanel.add(backBtn, gbc);
		
		// 프레임에 패널 추가
		add(mainPanel);
		
		//프레임을 화면 중앙에 표시
		setLocationRelativeTo(null);
		
		// 프레임 표시
		setVisible(true);
	}
	
	private void displaySubmittedData() {
        String name = nameField.getText();
        String id = idField.getText();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());
        String birthdate = birthdateField.getText();
        String phoneNumber = phoneNumberField.getText();

        // 여기에서 입력된 데이터를 활용하여 원하는 동작을 수행합니다.
        // 예: 데이터 유효성 검사, 데이터베이스에 저장 등
        System.out.println("이름: " + name);
        System.out.println("아이디: " + id);
        System.out.println("비밀번호: " + password);
        System.out.println("비밀번호 확인: " + confirmPassword);
        System.out.println("생년월일: " + birthdate);
        System.out.println("전화번호: " + phoneNumber);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submitBtn) {	// 제출버튼 클릭한 경우
            displaySubmittedData();
		}
		else if(e.getSource() == confirmIdBtn) {
			// 데이터베이스에 등록된 아이디 비교 후
			// 중복된 것이 없으면
					// 이 아이디는 사용가능합니다.
			// 중복되면
					// 이 아이디는 사용할 수 없습니다.
		}
		else setVisible(false);	// 취소 버튼 클릭할 경우
	}
	
	public static void main(String[] args) {
		new JoinFrame();
	}
}
