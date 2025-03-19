import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(3,"Fizz");
        map.put(5,"Buzz");

        for(int i = 0 ; i <= 100 ; i++){
            String output = new String();
            for(Map.Entry<Integer,String> entry : map.entrySet()){
                int key = entry.getKey();
                String value = entry.getValue();
                if(i % key == 0){
                    output += value + "";
                }
            }
            if(output.isEmpty()){
                System.out.println(i);
            }
            else{
                System.out.println(output);
            }
        }
    }
}