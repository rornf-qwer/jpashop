package jpabok.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)    // junit에게 spring 테스트 할거라고 알려줌
@SpringBootTest                 // 스프링 기본적인 테스트 어노테이션
public class MemberRepositoryTest {
//    @Autowired
//    MemberRepository memberRepository;
//
//    @Test
//    @Transactional          // test에 선언 하면 DB롤백(데이터가 들어가있으면 반복적인 테스트를 못함??)
//    @Rollback(false)        // test 롤백() 금지
//    public void testMember() {
//        //given
//        Member member = new Member();
//        member.setUsername("memberA");
//
//        //when
//        Long savedId = memberRepository.save(member);       // ctrl + Alt + V  memberRepository.save(member);
//        Member findMember = memberRepository.find(savedId);
//
//        //then
//        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
//        Assertions.assertThat(findMember).isEqualTo(member); //JPA 엔티티 동일성 보장
//        System.out.println("findMember == member : " + (findMember == member));
//
//        // entity를 통한 모든 데이터 변경은 트렌젝션 안에서 이루어져야한다.
//    }
}