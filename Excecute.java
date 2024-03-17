package stack;

public class Excecute {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		System.out.println("Empty : "+st.isEmpty());
		st.push(5);
		st.show();
		st.push(6);
		st.show();
		st.push(7);
		st.show();
		st.push(8);
		st.show();
		st.push(9);
		st.show();
		System.out.println();
        System.out.println("Peek is : "+st.peek());
        System.out.println("Empty : "+st.isEmpty());
		System.out.println("Size of : "+st.size());
	    st.pop();
	    st.show();
	    st.pop();
	    st.show();
	    st.pop();
	    st.show();
	    st.pop();
	    st.show();
	    st.pop();
	    st.show();
		System.out.println("Empty : "+st.isEmpty());
		
	

	}

}
