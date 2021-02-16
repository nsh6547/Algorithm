import java.util.Scanner;

public class BaekJoon_2839_설탕배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();
    int count=0;

    while(input > 0){
        if(input % 5 == 0){
            input -=5;
            count++;
        }
        else if(input % 3 ==0){
            input -=3;
            count++;
        }
        else if(input > 5){
            input -=5;
            count++;
        }
        else{
            count = -1;
            break;
        }

    }
    System.out.println(count);
}
}