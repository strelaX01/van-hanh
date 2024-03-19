package com.example.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field;
    private JLabel resultLabel, errorLabel;

    public CalculatorUI() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel num1Label = new JLabel("Số 1:");
        inputPanel.add(num1Label);

        num1Field = new JTextField();
        inputPanel.add(num1Field);

        JLabel num2Label = new JLabel("Số 2:");
        inputPanel.add(num2Label);

        num2Field = new JTextField();
        inputPanel.add(num2Field);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton addButton = new JButton("+");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);

        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        buttonPanel.add(subtractButton);

        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        buttonPanel.add(multiplyButton);

        JButton divideButton = new JButton("/");
        divideButton.addActionListener(this);
        buttonPanel.add(divideButton);

        JPanel resultPanel = new JPanel(new GridLayout(2, 1));
        resultPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        resultLabel = new JLabel("", SwingConstants.CENTER);
        resultPanel.add(resultLabel);

        errorLabel = new JLabel("", SwingConstants.CENTER);
        resultPanel.add(errorLabel);

        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);
        add(resultPanel, BorderLayout.SOUTH);

        setSize(400, 200);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result;
            switch (e.getActionCommand()) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    result = 0;
            }
            resultLabel.setText("Kết quả: " + result);
            errorLabel.setText("");
        } catch (NumberFormatException | ArithmeticException ex) {
            errorLabel.setText("Error: " + ex.getMessage());
            resultLabel.setText("");
        }
    }
}
