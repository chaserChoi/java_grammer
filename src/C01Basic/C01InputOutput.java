package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C01InputOutput {

    public static void main(String[] args) throws IOException {
        // 출력 : System.out을 통해 콘솔 출력
        System.out.println(20); // 줄바꿈 있는 출력
        System.out.print("hello world1"); // 줄바꿈 없는 출력
        System.out.println("hello world2");

        // 입력 : Scanner 클래스 => 입력을 위한 클래스, System.in : 키보드 입력
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();// 입력받은 데이터를 한 줄로 읽어서, String으로 리턴
        System.out.println("입력 사항 : " + input);

        // 예를 들어 아래와 같이 입력갓이 주어질 때 처리 방법
        /*
        abc
        bcd
        2
         */
//        Scanner myScanner2 = new Scanner(System.in);
//        String input1 = myScanner2.nextLine();
//        String input2 = myScanner2.nextLine();
//        String input3 = myScanner2.nextLine();
//        System.out.println(myScanner2.nextLine());
//        System.out.println("입력 사항1 : " + input1);
//        System.out.println("입력 사항2 : " + input2);
//        System.out.println("입력 사항3 : " + input2);

        // 입력 : BufferedReader + Ststem.in
        // BufferedReader는 Scanner보다 빠른 입력을 제공
//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//        String input = br1.readLine();
//        System.out.println(input1);

        // 입력값: anc ncd fgd
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br2.readLine().split(" ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // BufferReader + System.in + StringTokenizer
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String input3 = br3.readLine();
        StringTokenizer st = new StringTokenizer(input3);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}
