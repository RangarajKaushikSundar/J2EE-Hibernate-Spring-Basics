package com.cg.el;

import java.lang.reflect.Method;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class MathOperations {
		public static boolean isEven(Integer no){
			return no%2==0?true:false;
		}
		public static boolean isOdd(Integer no){
			return no%2!=0?true:false;
		}
		
		public static void main(String[] args) throws SecurityException, NoSuchMethodException {
			ExpressionParser parser=new SpelExpressionParser();
			StandardEvaluationContext context=new StandardEvaluationContext();
			Method method=MathOperations.class.getMethod("isEven",Integer.class);
			context.registerFunction("isEven", method);
			Expression expression=parser.parseExpression("#isEven(15)");
			Boolean b=expression.getValue(context,Boolean.class);
			System.out.println(b);
			
			Method method2=MathOperations.class.getMethod("isOdd", Integer.class);
			context.registerFunction("isOdd", method2);
			Expression expression2=parser.parseExpression("#isOdd(13)");
			Boolean b2=expression2.getValue(context,Boolean.class);
			System.out.println(b2);
		}
}
