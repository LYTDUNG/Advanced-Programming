package lab6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainProgram extends JFrame {
    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JPanel buttonPanel;

    public MainProgram() {
        super("String Manipulation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);

        JPanel panel = new JPanel(new GridLayout(3, 1));

        inputTextArea = new JTextArea();
        JScrollPane inputScrollPane = new JScrollPane(inputTextArea);

        outputTextArea = new JTextArea();
        JScrollPane outputScrollPane = new JScrollPane(outputTextArea);

        panel.add(inputScrollPane);
        panel.add(outputScrollPane);

        buttonPanel = new JPanel(new GridLayout(5, 4));
        panel.add(buttonPanel);

        addButton("Reverse String", e -> outputTextArea.setText(Ex1.reverseString(inputTextArea.getText())));
        addButton("Check Palindrome", e -> outputTextArea.setText(String.valueOf(Ex1.reverseString(inputTextArea.getText()))));
        // Add buttons for other methods similarly

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));
        buttonPanel.add(exitButton);

        add(panel);
    }

    private void addButton(String buttonText, ActionListener listener) {
        JButton button = new JButton(buttonText);
        button.addActionListener(listener);
        button.setPreferredSize(new Dimension(150, 50));
        buttonPanel.add(button);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainProgram program = new MainProgram();
            program.setVisible(true);
        });
    }
}
