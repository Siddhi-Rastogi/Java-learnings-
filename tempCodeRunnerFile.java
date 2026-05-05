
import java.util.*;
import java.util.List;
import java.lang.String;

public class MoreREcurssion {
    public static void main(String... s) {
        // skip("","sambhav");
        // String ans= reskip("sambhav");
        // String ans = skipWord("","samapplebhav");
        // System.out.println(ans);

        // int[] arr = { 1, 2, 3 };
        // List<List<Integer>> ans = notRecursionButIteration(arr);
        // for (List<Integer> num : ans) {
        //     System.out.print(num);
        // }
        dice("", 4);
        System.out.println(diceRet("", 4));
        System.out.println(FaceDice("", 8, 2));
        

    }

    static void skip(String p, String up) { // p=processed , up=unprocessed
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String reskip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return reskip(up.substring(1));
        } else {
            return ch + reskip(up.substring(1));
        }
    }

    static String skipword(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipword(up.substring(5));
        } else {
            return up.charAt(0) + skipword(up.substring(1));
        }
    }

    static String skipWord(String p, String up) {
        if (up.isEmpty()) {

            return p;
        }
        if (up.startsWith("apple")) {
            return skipWord(p, up.substring(5));

        } else {
            return skipWord(p + up.charAt(0), up.substring(1));
        }
    }

    static List<List<Integer>> notRecursionButIteration(int[] arr){
        List<List<Integer>>  outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner= new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        } 
        return outer;
    }
    static void dice(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target ;i++){
            dice(p+i, target-i);
        }
    }
    static ArrayList<String> diceRet(String p, int target){
        if(target==0){
            ArrayList<String> list=  new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            list.addAll(diceRet(p+i, target-i));
        }
        return list;
    }
    static ArrayList<String> FaceDice(String p, int target, int face)
{
    if(target==0)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;
    }
    ArrayList<String> ans=new ArrayList<>();
    for(int  i=1;i<=face &&i<=target;i++){
        ans.addAll(FaceDice(p+i,target-i,face));
    }
    return ans;
}
}
