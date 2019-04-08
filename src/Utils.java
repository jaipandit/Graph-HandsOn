import java.util.Stack;

public class Utils {
	
	public static <T> String printArray(T[] array) {
		StringBuilder sb = new StringBuilder("Array: [");
		for(int i=0; i<array.length;i++) {
			if(i != 0) {
				sb.append(",");
			}
			sb.append(array[i].toString());
		}
		sb.append("]");
		return sb.toString();
	}
	
	public static <T> void printStack(Stack<T> stack){
		while(!stack.isEmpty())
		System.out.println(stack.pop() + "\n");
	}
}
