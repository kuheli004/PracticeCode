import java.util.Stack;

public class LargestRectangularArea {

	static Stack<Integer> st=new Stack<>();
	static int top=0,area=0,max_area=0;
	public static void main(String[] args) {
		int hist[]={6,2,5,4,5,1,6};
		int n=hist.length;
		System.out.println(getMaxArea(hist,n));

	}

	private static int  getMaxArea(int[] hist, int n) {
	int i=0;
	while(i<n){
		if(st.isEmpty()||hist[st.peek()]
				<=hist[i])
			st.push(i++);
		else
		{
			System.out.println(st);
			
			 top=st.peek();
			st.pop();
			System.out.println(top+" ::"+hist[top]);
			area=hist[top]*(st.isEmpty()?i:(i-st.peek()-1));
			System.out.println(area);
			if(area>max_area)
				max_area=area;
		}
	}
	while(!st.isEmpty()){
		top=st.peek();
		st.pop();
		area=hist[top]*(st.isEmpty()?i:i-st.peek()-1);
		if(area>max_area)
			max_area=area;
	}
	return max_area;
	
	}

}
