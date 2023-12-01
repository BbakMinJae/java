package usedTradingSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * 레이아웃 관리자로 컴포넌트 배치 다시할 것
 * 상품 업로드 부분에서 버튼 클릭 시 그 버튼에 사진을 추가할 것
 * 사진은 최대 6장으로 2행 3열로 맞출 것
 */
class UploadFrame extends JFrame implements ActionListener {

    JRadioButton newProduct, usedHeavily, usedModerately;
    JTextField productNameFd, productPriceFd, productDeFd;
    JLabel uploadLabel, productName, productStat, productPrice, productDe, photo1, photo2;
    JButton registerButton, cancelButton;

    public UploadFrame() {
    	// 프레임 설정
        setTitle("로그인 창");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 전체 패널
        JPanel mainPanel = new JPanel(new GridBagLayout()); // 레이아웃 매니저를 null로 설정
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);	//위, 왼쪽, 아래, 오른쪽 방향으로 5 픽셀의 여백을 지정
        
        // 1. 상품 사진 업로드 패널
        gbc.gridx = 0;	//0열
        gbc.gridy = 0;	//0행
        uploadLabel = new JLabel("상품 사진 업로드");
        mainPanel.add(uploadLabel);

        photo1 = new JLabel("사진1");
        mainPanel.add(photo1);

        photo2 = new JLabel("사진2");
        mainPanel.add(photo2);

        // 2. 상품명 패널
        productName = new JLabel("상품명");
        productNameFd = new JTextField();
        mainPanel.add(productName);
        mainPanel.add(productNameFd);

        // 3. 상품 상태 패널
        productStat = new JLabel("상품 상태");
        newProduct = new JRadioButton("새 상품");
        usedHeavily = new JRadioButton("사용감 많음");
        usedModerately = new JRadioButton("사용감 적음");

        ButtonGroup group = new ButtonGroup();
        group.add(newProduct);
        group.add(usedHeavily);
        group.add(usedModerately);

        mainPanel.add(productStat);
        mainPanel.add(newProduct);
        mainPanel.add(usedHeavily);
        mainPanel.add(usedModerately);

        // 4. 가격 패널
        productPrice = new JLabel("상품 가격");
        productPriceFd = new JTextField();
        mainPanel.add(productPrice);
        mainPanel.add(productPriceFd);

        // 5. 상품 설명 패널
        productDe = new JLabel("상품 설명");
        productDeFd = new JTextField();
        mainPanel.add(productDe);
        mainPanel.add(productDeFd);

        // 등록 및 취소 버튼 패널
        registerButton = new JButton("등록");
        cancelButton = new JButton("취소");
        mainPanel.add(registerButton);
        mainPanel.add(cancelButton);

        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);

        // 여백 추가
//        int marginX = (int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 1000) / 2);
//        int marginY = (int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 800) / 2);
//        setBounds(marginX, marginY, 1000, 800);
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);

        // ActionListener 추가
        registerButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            // 등록 버튼이 눌렸을 때의 처리
            // 예: 입력된 내용을 가져와서 처리하거나 다른 동작 수행
            System.out.println("등록 버튼이 눌렸습니다.");
        } else if (e.getSource() == cancelButton) {
            // 취소 버튼이 눌렸을 때의 처리
            // 예: 창을 닫거나 초기화 등의 동작 수행
            System.out.println("취소 버튼이 눌렸습니다.");
        }
    }

    public static void main(String[] args) {
        new UploadFrame();
    }
}