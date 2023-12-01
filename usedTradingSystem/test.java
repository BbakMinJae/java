package usedTradingSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class test extends JFrame {
    private JLabel[] imageLabel;
    private int currentIndex = 0;

    public test() {
        setTitle("이미지 업로드");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        
        // imageLabel 배열 초기화
        imageLabel = new JLabel[5];
        for(int i = 0; i < 5; i++) {
        	imageLabel[i] = new JLabel();
//            imageLabel[i].setHorizontalAlignment(JLabel.CENTER);	//가운데 정렬
            gbc.gridx = i;
            gbc.gridy = 0;
            
            mainPanel.add(imageLabel[i], gbc);
        }
        

        JButton uploadButton = new JButton("이미지 업로드");
        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uploadImage();
            }
        });
        add(uploadButton, BorderLayout.SOUTH);

        add(mainPanel, BorderLayout.PAGE_START);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void uploadImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            displayImage(selectedFile.getAbsolutePath());
        }
    }

    private void displayImage(String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(200, 150, Image.SCALE_SMOOTH);

        imageIcon = new ImageIcon(scaledImage);
        imageLabel[currentIndex].setIcon(imageIcon);
        // 다음 이미지를 표시할 라벨 인덱스로 이동
        currentIndex = (currentIndex + 1) % 5;
        // % 5를 사용함으로써 인덱스가 5가 되면 다시 0으로 돌아가게 되어
        // 배열의 범위를 벗어나지 않게 됩니다.
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new test());
    }
}
