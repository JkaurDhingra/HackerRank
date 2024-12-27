import java.util.*;
class Solution{
	private static boolean isBalanced(String str){
        if(str.length() == 0) return true; // An empty string is considered balanced
        
        // Iterate through the string, using a stack to match opening and closing brackets
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            if(currentChar == '(' || currentChar == '{' || currentChar == '['){
                stack.push(currentChar);
            }
            else if(!stack.isEmpty() && stack.peek() == '(' && currentChar == ')'){
                stack.pop();
            }
            else if(!stack.isEmpty() && stack.peek() == '{' && currentChar == '}'){
                stack.pop();
            }
            else if(!stack.isEmpty() && stack.peek() == '[' && currentChar == ']'){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty(); // Return true if stack is empty (balanced), else false
    }
    
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println(isBalanced(input));
		}
        
        sc.close();
		
	}
}



