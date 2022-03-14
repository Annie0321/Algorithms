import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = s.substring(2);
        int[] countOne = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};
        char[] chars = str.toCharArray();
        int count = 0;
        for(int i = 0;i < chars.length;i++){
            if(chars[i] >= 'a' && chars[i] <= 'f'){
                count += countOne[chars[i] - 'a' + 10];
            }else{
                count += countOne[chars[i] - '0'];
            }
        }
        System.out.println(count);
    }
}