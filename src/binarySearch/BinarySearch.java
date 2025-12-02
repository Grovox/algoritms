package binarySearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int e){
        int l = 0, r = arr.length - 1;
        while(l < r){
            int mid = (l + r) / 2;
            int v = arr[mid];
            if(v == e) return mid;
            if(v > e){
                l = mid + 1;
            } else r = mid - 1;
        }
        return l;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(arr, 4));
    }
}
