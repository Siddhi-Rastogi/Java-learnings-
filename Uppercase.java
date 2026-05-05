import java.lang.*;
import java.util.*;
public class Uppercase {
    public static void main(String[] args) {
        String str="siddHi";
        // char res=find(str);
        char res=recursion(str, 0);

        if(res==0){
            System.out.println("No Uppercase is found.");
        }
        else{
            System.out.println(res);
        }

    }
    static char find(String str){
        for(int i=0;i<str.length();i++)
            if(Character.isUpperCase(str.charAt(i)))
                return str.charAt(i);
            
            return 0;
        

    }
    static char recursion(String str,int i){                      //through recursion
        if(str.charAt(i)=='\0'){
            return 0;
        }
        if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }
        return recursion(str, i+1);
       
        // return 0;

    }
}
