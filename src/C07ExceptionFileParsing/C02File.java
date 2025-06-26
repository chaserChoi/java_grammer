package C07ExceptionFileParsing;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C02File {

    public static void main(String[] args) throws IOException {
//        // 콘솔창 입출력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println(input);

//        // 파일에서 읽기 : IO 패키지
//        BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionFileParsing/text.txt"));
//        String line = br2.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = br2.readLine();
//        }

//        // 파일에서 읽기 : NIO 패키지
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/text.txt");
//        // readString : 문자열 전체를 통째로 read
//        String st1 = Files.readString(filePath);
//        System.out.println(st1);
//        // readAllLines : 문자열을 라인 별로 split하여 list 형태로 변환
//        List<String> st2 = Files.readAllLines(filePath);
//        for (String l : st2) {
//            System.out.println(l);
//        }

        // 파일 쓰기
        Path filePath = Paths.get("src/C07ExceptionFileParsing/text1.txt");
        Files.write(filePath, "홍길동0\n".getBytes(), StandardOpenOption.CREATE_NEW); // CREATE_NEW : 새로 입력
        Files.write(filePath, "홍길동1\n".getBytes(), StandardOpenOption.WRITE); // WRITE : 덮어쓰기
        Files.write(filePath, "홍길동2\n".getBytes(), StandardOpenOption.APPEND); // APPEND : 추가모드


    }
}
