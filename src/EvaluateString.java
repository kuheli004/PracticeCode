

import java.util.Stack;

public class EvaluateString {

	public static void main(String[] args) {
		
        System.out.println(EvaluateString.evaluate("100 * 2 + 12"));
        System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 )"));
        System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 ) / 14"));

	}

	private static int evaluate(String exp) {
		char token[]=exp.toCharArray();
		Stack<Integer> value=new Stack<>();
		Stack<Character> oper=new Stack<>();
		int result=0,a=0,b=0;
		for(int i=0;i<token.length;i++){
			if(token[i]==' ')
				continue;
			
		else	if(token[i]>='0' && token[i]<='9'){
			
				StringBuffer sbuf = new StringBuffer();
			
				while(i<token.length && token[i]>='0' &&  token[i]<='9')
					sbuf.append(token[i++]);
			//	System.out.println(sbuf);
				value.push(Integer.parseInt(sbuf.toString()));
			}
			
			else if(token[i]=='(')
				oper.push(token[i]);
			else if(token[i]==')')
			{
				while( oper.peek()!='(')
				{
					value.push(applyOp(oper.pop(),value.pop(),value.pop()));
				}
				oper.pop();
			}
			else if (token[i] == '+' || token[i] == '-' ||
                    token[i] == '*' || token[i] == '/')
			{
			
				while(!oper.isEmpty() && hasPrecedence(token[i],oper.peek()))
				value.push(applyOp(oper.pop(),value.pop(),value.pop()));
				
				oper.push(token[i]);
			}
			}
		while(!oper.isEmpty())
			value.push(applyOp(oper.pop(),value.pop(),value.pop()));
		
		return value.pop();
}
	private static boolean hasPrecedence(char op1, char op2) {
		if(op2=='(' || op2==')')
		return false;
		if((op1=='*' || op1== '/') && (op2=='+' || op2=='-'))
			return false;
		else
			return true;
	
	}

	private static int applyOp(char op, int a, int b) {
	switch(op){
	case '+':
		return a+b;
	case '-':
		return a-b;
	case '*':
		return a*b;
	case '/':
		if(b==0)
		throw new UnsupportedOperationException("Cannot divide by zero");
		return (int)Math.ceil(a/b);
	}
		return 0;
	}

}
