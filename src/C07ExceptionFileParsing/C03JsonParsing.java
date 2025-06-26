package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C03JsonParsing {

    public static void main(String[] args) throws IOException {
        // ObjectMapper : json 직렬화 역직렬화를 위한 라이브러리
        ObjectMapper o1 = new ObjectMapper();
//        // 사용법1. 객체 생성 : 클래스명 객체명 = o1.readValue(문자열, 클래스명);
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/myjson1.json");
//        String st1 = Files.readString(filePath);
//        Map<String, String> myMap = o1.readValue(st1, Map.class);
//        System.out.println(myMap.get("name"));
//        System.out.println(myMap);
//
//        Student s1 = o1.readValue(st1, Student.class);
//        System.out.println(s1);
//
//        // 사용법2 : 트리 구조의 JsonNode로 변환 : JsonNode 객체명 = o1.readTree(문자열);
//        // 복잡한 json 자료구조일 경우에 트리 구조의 JsonNode 사용
//        JsonNode jsonNodes = o1.readTree(st1);
//        Map<String, String> myMap2 = new HashMap<>();
//        myMap2.put("id", jsonNodes.get("id").asText());
//        myMap2.put("name", jsonNodes.get("name").asText());
//        myMap2.put("classNumber", jsonNodes.get("classNumber").asText());
//        myMap2.put("city", jsonNodes.get("city").asText());
//        System.out.println(myMap2);

        // 실습 : myJson2를 가지고 List<Student> 객체 방식으로 변환
        Path filePath2 = Paths.get("src/C07ExceptionFileParsing/myjson2.json");
        String st2 = Files.readString(filePath2);
        JsonNode jsonNodes2 = o1.readTree(st2);
        List<Student> studentList = new ArrayList<>();
        for (JsonNode j : jsonNodes2) {
            Student s1 = o1.readValue(j.toString(), Student.class);
            studentList.add(s1);
        }
        System.out.println(studentList);

        // json 직렬화 : 객체 -> json 변환. writeValueAsString(객체)
        String returnSt = o1.writeValueAsString(studentList);
        System.out.println(returnSt);
    }
}

// 실제 값의 setting은 private이라 할지라도 직접 접근하여 setting (reflection 기술 활용하여 접근)
// objectMapper는 getter의 메서드명을 통해 필드값을 유추하므로, 반드시 기본 생성자 + getter는 있어야 한다.
class Student {
    private int id;
    private String name;
    private String classNumber;
    private String city;

    public Student(int id, String name, String className, String city) {
        this.id = id;
        this.name = name;
        this.classNumber = className;
        this.city = city;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}