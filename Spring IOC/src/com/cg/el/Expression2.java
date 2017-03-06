package com.cg.el;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Expression2 {
		public static void main(String[] args) {
			ExpressionParser parser=new SpelExpressionParser();
			Expression expression=parser.parseExpression("'Hello world '.concat('!').length()");
			String message=(String) expression.getValue();
			System.out.println(message);
		}
}
