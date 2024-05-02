package com.example.calculator;

import java.awt.event.ActionEvent;

import javax.annotation.processing.Generated;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class CalculatorUITest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private CalculatorUI createTestSubject() {
		return new CalculatorUI();
	}

	@Test
	public void testActionPerformed() throws Exception {
		CalculatorUI testSubject;
		ActionEvent e = null;

		testSubject = createTestSubject();
		testSubject.actionPerformed(e);
	}

	@Test
	public void testAddition() {
		CalculatorUI calculator = new CalculatorUI();
		calculator.num1Field.setText("5");
		calculator.num2Field.setText("3");
		calculator.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "+"));
		assertEquals("Kết quả: 9.0", calculator.resultLabel.getText());
	}

	@Test
	public void testSubtraction() {
		CalculatorUI calculator = new CalculatorUI();
		calculator.num1Field.setText("10");
		calculator.num2Field.setText("7");
		calculator.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "-"));
		assertEquals("Kết quả: 3.0", calculator.resultLabel.getText());
	}

	@Test
	public void testMultiplication() {
		CalculatorUI calculator = new CalculatorUI();
		calculator.num1Field.setText("4");
		calculator.num2Field.setText("6");
		calculator.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "*"));
		assertEquals("Kết quả: 24.0", calculator.resultLabel.getText());
	}

	@Test
	public void testDivision() {
		CalculatorUI calculator = new CalculatorUI();
		calculator.num1Field.setText("10");
		calculator.num2Field.setText("2");
		calculator.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "/"));
		assertEquals("Kết quả: 5.0", calculator.resultLabel.getText());
	}
}
