package usedTradingSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ProductFrame extends JFrame implements ActionListener {

    JTextField productNameFd, productPriceFd, productDeFd,photoTextFiled,ProductStatFd,ProfileFd;
    JLabel Profile, productName, productPrice, productDe, photo,ProductStat;
    JButton nextButton, backButton,homeButton;

    public ProductFrame() {
        Container ct = getContentPane();

        // 전체 패널
        JPanel mainPanel = new JPanel(null); // 레이아웃 매니저를 null로 설정


        photoTextFiled = new JTextField();
        photoTextFiled.setBounds(220,50,400,200);
        photo = new JLabel("사진1");
        photo.setBounds(220, 10, 100, 40); // 크기 및 위치 조정
        mainPanel.add(photo);
        mainPanel.add(photoTextFiled);



        // 2. 상품명 패널
        productName = new JLabel("판매제목");
        productNameFd = new JTextField();
        productName.setBounds(170, 260, 200, 40); // 크기 및 위치 조정
        productNameFd.setBounds(220, 260, 400, 40); // 크기 및 위치 조정
        mainPanel.add(productName);
        mainPanel.add(productNameFd);


        Profile = new JLabel("판매자 프로필");
        ProfileFd = new JTextField();
        Profile.setBounds(140, 360, 200, 40); // 크기 및 위치 조정
        ProfileFd.setBounds(220, 300, 140, 140); // 크기 및 위치 조정
        mainPanel.add(Profile);
        mainPanel.add(ProfileFd);

        ProductStat = new JLabel("상품상태");
        ProductStatFd = new JTextField();
        ProductStat.setBounds(360, 360, 200, 40); // 크기 및 위치 조정
        ProductStatFd.setBounds(420, 360, 200, 40); // 크기 및 위치 조정
        mainPanel.add(ProductStat);
        mainPanel.add(ProductStatFd);



        // 4. 가격 패널
        productPrice = new JLabel("상품가격");
        productPriceFd = new JTextField();
        productPrice.setBounds(360, 400, 200, 40); // 크기 및 위치 조정
        productPriceFd.setBounds(420, 400, 200, 40); // 크기 및 위치 조정
        mainPanel.add(productPrice);
        mainPanel.add(productPriceFd);

        // 5. 상품 설명 패널
        productDe = new JLabel("상품 설명");
        productDeFd = new JTextField();
        productDe.setBounds(160, 450, 200, 40); // 크기 및 위치 조정
        productDeFd.setBounds(220, 450, 400, 200); // 크기 및 위치 조정
        mainPanel.add(productDe);
        mainPanel.add(productDeFd);

        // 등록 및 취소 버튼 패널
        nextButton = new JButton("이전");
        backButton = new JButton("다음");
        nextButton.setBounds(100, 100, 100, 40); // 크기 및 위치 조정
        backButton.setBounds(650, 100, 100, 40); // 크기 및 위치 조정
        mainPanel.add(nextButton);
        mainPanel.add(backButton);


        homeButton = new JButton("홈으로");
        homeButton.setBounds(220, 700, 400, 40);
        mainPanel.add(homeButton);

        ct.add(mainPanel);

        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);

        // 여백 추가
        int marginX = (int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 1000) / 2);
        int marginY = (int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 800) / 2);
        setBounds(marginX, marginY, 1000, 800);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // ActionListener 추가
        nextButton.addActionListener(this);
        backButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == nextButton) {
//            // 등록 버튼이 눌렸을 때의 처리
//            // 예: 입력된 내용을 가져와서 처리하거나 다른 동작 수행
//            System.out.println("등록 버튼이 눌렸습니다.");
//        } else if (e.getSource() == backButton) {
//            // 취소 버튼이 눌렸을 때의 처리
//            // 예: 창을 닫거나 초기화 등의 동작 수행
//            System.out.println("취소 버튼이 눌렸습니다.");
//        }
    }

    public static void main(String[] args) {
        new ProductFrame();
    }
}