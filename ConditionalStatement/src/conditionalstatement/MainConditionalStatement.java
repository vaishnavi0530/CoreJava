package conditionalstatement;

public class MainConditionalStatement {
	public static void main (String[]args) {
		int variable1=10;
		int variable2=20;
		int variable3=30;
		
		ConditionalStatement conditionalStatement=new ConditionalStatement(variable1 == variable2);
		conditionalStatement.testif();
		if(variable1<variable2) {
		}
		ConditionalStatement conditionalStatement1 = new ConditionalStatement();
		conditionalStatement1.setExpression((variable1<variable2)&&(variable1<variable3));
		conditionalStatement1.testif();
		conditionalStatement.testif();
	}
}
