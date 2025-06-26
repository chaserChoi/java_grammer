package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

// 핵심 로직을 구현하는 계층
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService() {
        this.memberRepository = new MemberRepository();
    }

    // 회원 가입
    public void register(String name,  String email, String password) {
        // DB에 이메일이 중복일 경우 예외 발생
        // 비밀번호가 너무 짧은 경우, 예외 발생
        // 객체를 조립 후, repository을 통해 register
        Member member = new Member(name, email, password);
        try {
            memberRepository.register(member);
        } catch (IllegalArgumentException e) {
            System.out.println("회원 가입 중 오류가 발생했습니다. " + e.getMessage());
            e.printStackTrace();
        }

//        if (memberRepository.findByEmail(email).isPresent()) {
//            throw new IllegalArgumentException("이메일 증복입니다.");
//        }
//        Member member = new Member(name, email, password);
//        memberRepository.register(member);
    }

    // 회원 상세 조회
    public Member findById(Long id) {
        // Optional 객체에 값이 없을 경우 예외 발생 - 있으면 Member를 꺼내서 return
        // 내 코드
//        try {
//            return memberRepository.findById(id);
//        } catch (IllegalArgumentException e) {
//            System.out.println("회원 상세 조회 중 오류가 발생했습니다. " + e.getMessage());
//            e.printStackTrace();
//            return null;
//        }

        return memberRepository.findById(id).orElseThrow(() -> new NoSuchElementException("id가 없는 회원입니다.`"));
    }

    public Member findByEmail(String email) {
        try {
            return memberRepository.findByEmail(email)
                    .orElseThrow(() -> new IllegalArgumentException("해당 이메일이 존재하지 않습니다."));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 회원 목록 조회
    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
