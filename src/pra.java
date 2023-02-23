import java.util.ArrayList;
import java.util.List;

public class pra {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(2);

        for(int i:list){
            System.out.println(i);
        }
        String s = "wwwwuuuuuuuyyyyyyyyyyyyy";
        System.out.println(s.charAt(10));

        int maxCount =0, maxIndex = -1;
        char re = '\n';

        for(int i = 0;i<s.length();i++){

            char c = s.charAt(i);

            int j  = i;

            while(j<s.length() && s.charAt(j) == c){
                j++;
            }
            int size = j-i;
            if(size>maxCount){
                maxIndex = i;
                maxCount = size;
                re = c;

            }
            i = j-1;
        }

//        System.out.println(maxIndex+" "+maxCount+" "+re);

        for(int i = 0;i<10 && i != 5 ;i++){
            System.out.println(i);
        }

    }
}
