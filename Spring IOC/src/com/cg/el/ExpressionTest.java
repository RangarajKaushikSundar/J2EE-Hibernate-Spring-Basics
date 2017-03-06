package com.cg.el;
 
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
 
public class ExpressionTest {
 
	public static void main(String[] args) {
 
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("'Testing Spring Expression Framework'");
		String message = (String) expression.getValue();
		System.out.println("Message is " + message);
	}
}