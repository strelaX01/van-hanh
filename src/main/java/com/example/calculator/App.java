package com.example.calculator;


import javax.swing.SwingUtilities;

public class App {
	 public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            CalculatorUI calculatorUI = new CalculatorUI();
	            calculatorUI.setVisible(true);
	        });
	    }
}
