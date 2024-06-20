package conditionalstatement;

public class ConditionalStatement {
private boolean expression;
	
	public ConditionalStatement() {}
	
	public ConditionalStatement(boolean expression) {
		this.expression=expression;
	}

	 public void setExpression(boolean expression) {
		 this.expression=expression;
	 }
	 
	 public boolean getExpression() {
		return expression;
	 }


public void testif() {
	if(expression) {
		System.out.print("If block");
	}
 }

public void testIfelase() {
	if (expression) {
		System.out.println("if blick");
		
	}else {
		System.out.println("else blick");
	}
}
}


