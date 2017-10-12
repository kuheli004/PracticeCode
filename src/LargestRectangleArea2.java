import java.util.*;

public class LargestRectangleArea2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // scanner.nextInt();
        List<Integer> heights = new ArrayList<>();
       heights.add(6);
       heights.add(2);
       heights.add(5);
       heights.add(4);
       heights.add(5);
       heights.add(1);
       heights.add(6);
       
        System.out.println(areaOfLargestRectangle(heights));
    }

    public static int areaOfLargestRectangle(List<Integer> heights) {
        heights.add(0);
        Stack<Integer> stack = new Stack<>();
        int maxAreaSoFar = -1;
        for(int height : heights) {
            int n = 0;
            while(!stack.isEmpty() && stack.peek() > height) {
                n++;
                System.out.println(n+" :: "+stack.peek());
                maxAreaSoFar = Math.max(maxAreaSoFar, n* stack.pop());
            }
            for(int i = 0; i < n+1; i++) {
                stack.push(height);
            }
            System.out.println(stack);
        }
        return maxAreaSoFar;
    }
}