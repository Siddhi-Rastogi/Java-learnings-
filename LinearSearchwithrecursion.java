import java.util.ArrayList;

public class LinearSearchwithrecursion {
    public static void main(String... s) {
        int[] arr = { 1, 2, 3, 5, 4, 2, 9, 6, 45, 8 };
        int target = 2;
        // int res=search(arr,target,0);
        // System.out.println(res);
        // findAllIndexes(arr, target, 0);
         // System.out.println(list);
        // Findallindex(arr,target,0,list);
        // System.out.println(list);
       
        System.out.println( InsideArrayList(arr, target, 0));

    }

    //This Approach is not optimized as it is creating arryalist object again and again              
    static ArrayList<Integer> InsideArrayList(int[] arr, int target, int i){
        ArrayList<Integer> list= new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer> answerfrombelow= InsideArrayList(arr, target, i+1);
        list.addAll(answerfrombelow);
        return list;
    }

    static ArrayList<Integer> list  = new ArrayList<>();
    static void findAllIndexes(int[] arr, int target, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
             list.add(i);
        }
        findAllIndexes(arr, target, i + 1);
    }

    static ArrayList<Integer> Findallindex(int[] arr, int target,int i,  ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return Findallindex(arr,target,i+1,list);

    }

    static int search(int[] arr, int target, int i) {
        if (i == arr.length - 1 && arr[i] != target) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return search(arr, target, i + 1);
    }
}
