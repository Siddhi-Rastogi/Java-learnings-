import java.util.*;
public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        List<Integer> ls=Arrays.asList(10,20,3,4,5);
        for(int num:ls){
            st.push(num);
        }
        int element=1;
        // System.out.println(st);
        // st.pop();
        // System.out.println(st);
        // System.out.println(st.peek());
        
        // reverse(st);
        // System.out.println(st);
        // reverseO1(st, element);
        // System.out.println(st);
        pushAtBottom(st,element);
        System.out.println(st);

    }

    //with Auxilary space of O(n):-


    static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            for(int item:st)
              System.out.println(item);
            return;
        }
        int top=st.peek();
        st.pop();
        reverse(st);
        Stack<Integer> temp =new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.peek());
            st.pop();
        }
        st.push(top);
        while(!temp.isEmpty()){
            st.push(temp.peek());
            temp.pop();
        }
    }

    //now with Auxilary space of O(1):-

    static void reverseO1(Stack<Integer> st, int element){
        if(st.isEmpty()){
            st.push(element);
            return;
        }
        int top=st.peek();
        st.pop();
        reverseO1(st,element);
        st.push(top);
    }

    static void pushAtBottom(Stack<Integer> st, int element){
        if(st.isEmpty()){
            st.push(element);
            return;
        }
        int top=st.peek();
        st.pop();
        pushAtBottom(st, element);
        st.push(top);
    }

}
