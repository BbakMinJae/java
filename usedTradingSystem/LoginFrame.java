package usedTradingSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginFrame extends JFrame {
    private JTextField idTextField;
    private JPasswordField passwordField;

    public LoginFrame() {
        // 프레임 설정
        setTitle("로그인 창");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 패널 및 레이아웃 매니저 설정
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);	//위, 왼쪽, 아래, 오른쪽 방향으로 5 픽셀의 여백을 지정

        // 아이디 라벨 및 텍스트필드 추가
        gbc.gridx = 0;	//0열
        gbc.gridy = 0;	//0행
        mainPanel.add(new JLabel("아이디"), gbc);

        gbc.gridx = 1;	//1열
        idTextField = new JTextField();
        idTextField.setPreferredSize(new Dimension(150, 30));	//버튼 사이즈 조절
        mainPanel.add(idTextField, gbc);

        // 비밀번호 라벨 및 패스워드 필드 추가
        gbc.gridx = 0;	//0열
        gbc.gridy = 1;	//1행
        mainPanel.add(new JLabel("비밀번호"), gbc);

        gbc.gridx = 1;	//1열
        passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(150, 30));	//버튼 사이즈 조절
        mainPanel.add(passwordField, gbc);

        // 로그인 버튼 추가
        gbc.gridx = 1;	//1열
        gbc.gridy = 2;	//2행
        JButton loginButton = new JButton("시작하기");
        
        loginButton.setPreferredSize(new Dimension(150, 30));	//버튼 사이즈 조절
        
        mainPanel.add(loginButton, gbc);

        // 회원가입 라벨 버튼 추가
        JLabel joinBtn = new JLabel("가입하기");
        gbc.gridx = 1;	//0열
        gbc.gridy = 3;	//0행
        gbc.insets = new Insets(0, 0, 100, 0);

        mainPanel.add(joinBtn, gbc);
        
        joinBtn.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		super.mouseClicked(e);
        		System.out.println("회원가입 프레임 생성");
        		JoinFrame jf = new JoinFrame();
        		jf.setVisible(true);
        	}
		});
//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//            	
//                // 로그인 버튼 클릭 시 처리
//                String id = idTextField.getText();
//                char[] passwordChars = passwordField.getPassword();
//                String password = new String(passwordChars);
//                System.out.println("아이디: " + id);
//                System.out.println("비밀번호: " + password);
//            }
//        });
        
        // 프레임에 패널 추가
        add(mainPanel, BorderLayout.SOUTH);

        // 프레임을 화면 중앙에 표시
        setLocationRelativeTo(null);

        // 프레임 표시
        setVisible(true);
    }

    public static void main(String[] args) {
    	new LoginFrame();
    }
}
