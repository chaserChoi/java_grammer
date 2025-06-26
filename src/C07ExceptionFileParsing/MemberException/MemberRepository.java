package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// 저장소 역할을 하는 계층
// DB에 CRUD 수행하는 계층
public class MemberRepository {
    private static List<Member> memberList = new ArrayList<>();

    // 회원 가입
    public void register(Member member) {
        memberList.add(member);
    }

    // 회원 상세 조회
    public Optional<Member> findById(Long id) {
        // 내 풀이
//        return memberList.stream()
//                .filter(m -> m.getId().equals(id))
//                .findFirst()
//                .orElseThrow(() -> new IllegalArgumentException("해당 회원이 존재하지 않습니다."));

        return memberList.stream().filter(m -> m.getId() == id).findFirst();
    }

    public Optional<Member> findByEmail(String email) {
        return memberList.stream()
                .filter(m -> m.getEmail().equals(email))
                .findFirst();
    }

    // 회원 목록 조회
    public List<Member> findAll() {
        // 내 풀이
//        return memberList;

        return new ArrayList<>(memberList);
    }
}
