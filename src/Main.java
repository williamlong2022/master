import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,3,4,4,4};
        System.out.println(sort(arr));
    }

    public static List<Integer> sort(int[] arr){
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(pair->{
            for(int i = 0;i<pair.getValue();i++){
                list.add(pair.getKey());
            }
        });
        return list;
    }

    public static void print(int a, int b){
        IntStream.range(a,b).filter(x->x%2 == 0).forEach(System.out::println);
    }

    public static void print1(int a, int b){
        for(int i = a ;i<= b;i++){
            if(a%2 ==0){
                System.out.println(i);
            }
        }
    }

    public static void print2(int a, int b){
        IntStream.range(a,b).filter(e->e%2 ==0).forEach(System.out::println);
    }




























}

