package oppgave2;

import java.util.Stack;
import java.util.StringTokenizer;

public class Calculator {
	
	public final String input;
	
	public Calculator(String input){
		this.input = input;
	}
	
	public String getInput(){
		return this.input;
	}
	
	public boolean isInputValid(){
		return true;
	}
	
	public double getResult(){
		//Kode for å konvertere og regne ut.
		StringTokenizer st = new StringTokenizer(this.input, " "); 
		Stack<Double> stack = new Stack<Double>();
		
		while(st.hasMoreTokens()) { 
			double sistStack, nestSistStack;
			String val = st.nextToken(); 
			
			if      (val.equals("+")){
				sistStack = stack.pop();
				nestSistStack = stack.pop();
				 stack.push(nestSistStack + sistStack);	
			}
			else if (val.equals("-")) {
				sistStack = stack.pop();
				nestSistStack = stack.pop();
				stack.push(nestSistStack - sistStack);	
			}
			else if (val.equals("*")) {
				sistStack = stack.pop();
				nestSistStack = stack.pop();
				stack.push(nestSistStack * sistStack);	
			}
			else if (val.equals("/")) {
				sistStack = stack.pop();
				nestSistStack = stack.pop();
				stack.push(nestSistStack / sistStack);	
			}
			else if (val.equals("%")) {
				sistStack = stack.pop();
				nestSistStack = stack.pop();
				stack.push(nestSistStack % sistStack);	
			}

            else stack.push(Double.valueOf(val));
		} 
	
		
		
		return stack.pop();
	}

}
