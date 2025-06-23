package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C10BoardService {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();

        System.out.println("***** Choi's 게시판 *****");
        System.out.println("| 1. 회원가입           |");
        System.out.println("| 2. 회원 전체 목록 조회  |");
        System.out.println("| 3. 회원 상세 조회      |");
        System.out.println("| 4. 게시글 작성        |");
        System.out.println("| 5. 게시물 목록 조회    |");
        System.out.println("| 6. 게시물 상세 조회    |");
        System.out.println("| 7. 서비스 종료        |");
        System.out.println("***********************");

        while (true) {
            System.out.print("원하시는 서비스 번호를 입력해 주세요. : ");
            int serviceNumber = Integer.parseInt(br.readLine());

            switch (serviceNumber) {
                case 1: // 회원 가입
                    System.out.println("***** 회원 가입 *****");
                    System.out.print("- 이름 : ");
                    String name = br.readLine();
                    if (name.isEmpty()) {
                        System.out.println("이름은 필수 입력 사항입니다. 다시 입력해 주세요.");
                        continue;
                    }
                    System.out.print("- 이메일 : ");
                    String email = br.readLine();
                    if (email.isEmpty()) {
                        System.out.println("이메일은 필수 입력 사항입니다. 다시 입력해 주세요.");
                        continue;
                    }
                    System.out.print("- 비밀번호 : ");
                    String password = br.readLine();
                    if (password.isEmpty()) {
                        System.out.println("비밀번호는 필수 입력 사항입니다. 다시 입력해 주세요.");
                        continue;
                    }

                    // 회원 가입 처리
                    authorList.add(new Author(name, email, password));
                    System.out.println("회원 가입 완료!");
                    break;
                case 2: // 회원 전체 목록 조회
                    System.out.println("***** 회원 전체 목록 조회 *****");
                    if (authorList.isEmpty()) {
                        System.out.println("등록된 회원이 없습니다ㅠㅠ");
                    } else {
                        System.out.println("ID\t이메일");
                        for (Author author : authorList) {
                            System.out.println(author.selectId() + "\t" + author.selectEmail());
                        }
                    }
                    break;
                case 3:
                    System.out.println("***** 회원 상세 조회 *****");
                    if (authorList.isEmpty()) {
                        System.out.println("등록된 회원이 없습니다ㅠㅠ");
                    } else {
                        System.out.print("조회할 회원의 ID를 입력해주세요. : ");
                        Long id = Long.parseLong(br.readLine());
                        boolean found = false;
                        for (Author author : authorList) {
                            if (author.selectId() == id) {
                                System.out.println("ID : " + author.selectId());
                                System.out.println("Email : " + author.selectEmail());
                                System.out.println("Name : " + author.selectName());
                                System.out.println("Password : " + author.selectPassword());
                                // 람다 및 스트림 없이 구현할 것
                                int postCount = author.getPostCount(postList);
                                System.out.println("작성글 수 : " + postCount);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("해당 ID의 회원이 없습니다.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("***** 개시글 작성 *****");
                    if (authorList.isEmpty()) {
                        System.out.println("게시글을 작성하려면 먼저 회원 가입이 필요합니다.");
                        continue;
                    } else {
                        System.out.print("- 제목 : ");
                        String title = br.readLine();
                        if (title.isEmpty()) {
                            System.out.println("제목은 필수 입력 사항입니다. 다시 입력해 주세요.");
                            continue;
                        }
                        System.out.print("- 내용 : ");
                        String contents = br.readLine();
                        System.out.print("- 작성자 Email : ");
                        String authorEmail = br.readLine();
                        boolean found = false;
                        for (Author author : authorList) {
                            if (author.selectEmail().equals(authorEmail)) {
                                Post post = new Post(title, contents, author);
                                postList.add(post);
                                System.out.println("게시글 작성 완료!");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("해당 이메일로 등록된 회원이 없습니다!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("***** 게시물 목록 조회 *****");
                    if (postList.isEmpty()) {
                        System.out.println("등록된 게시글이 없습니다ㅠㅠ");
                    } else {
                        System.out.println("ID\t제목");
                        for (Post post : postList) {
                            System.out.println(post.selectId() + "\t" + post.selectTitle());
                        }
                    }
                    break;
                case 6:
                    System.out.println("***** 게시물 상세 조회 *****");
                    if (postList.isEmpty()) {
                        System.out.println("등록된 게시글이 없습니다ㅠㅠ");
                    } else {
                        System.out.print("조회할 게시물의 ID를 입력해주세요. : ");
                        Long postId = Long.parseLong(br.readLine());
                        boolean found = false;
                        for (Post post : postList) {
                            if (post.selectId().equals(postId)) {
                                found = true;
                                System.out.println("ID : " + post.selectId());
                                System.out.println("제목 : " + post.selectTitle());
                                System.out.println("내용 : " + post.selectContents());
                                System.out.println("작성자 Email : " + post.selectAuthorEmail().selectEmail());
                            }
                        }
                        if (!found) {
                            System.out.println("해당 ID의 게시물이 없습니다.");
                        }
                    }
                    break;
                case 7:
                    System.out.println("서비스를 종료합니다.");
                    br.close();
                    return;
                default:
                    System.out.println("잘못된 서비스 입력입니다. 다시 입력해 주세요!");
                    break;
            }
        }
    }


}

class Author {
    // 필드
    // 일반적으로 클래스를 정의할 때 원시 자료형은 Wrapper 클래스로 정의
    private static Long sequence = 1L; // auto_increment 역할
    private Long id;
    private String name;
    private String email;
    private String password;
    // Author 객체에 본인이 쓴 글 목록인 postList 객체를 만들어둠으로서 편의성 향상
//    private List<Post> postList = new ArrayList<>();

    // 생성자
    public Author(String name, String email, String password) {
        this.id = sequence++;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long selectId() {
        return id;
    }

    public String selectName() {
        return name;
    }

    public String selectEmail() {
        return email;
    }

    public String selectPassword() {
        return password;
    }

    // 람다 및 스트림 없이 작성글 수 계산
    public int getPostCount(List<Post> postList) {
        int postCount = 0;
        for (Post post : postList) {
            if (post.selectAuthorEmail().selectId() == this.id) {
                postCount++;

            }
        }
        return postCount;
    }
}

class Post {
    // 필드
    private static Long sequence = 1L;
    private Long id;
    private String title;
    private String contents;
    private Author author;

    // 생성자
    public Post(String title, String contents, Author authorEmail) {
        this.id = sequence++;
        this.title = title;
        this.contents = contents;
        this.author = authorEmail;
    }

    public Long selectId() {
        return id;
    }

    public String selectTitle() {
        return title;
    }

    public String selectContents() {
        return contents;
    }

    public Author selectAuthorEmail() {
        return author;
    }
}


