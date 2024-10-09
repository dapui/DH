package study.data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.data_jpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

//    List<Member> findByUsernameAndAgeGreaterThen(String username, int age);

    List<Member> findTop3HelloBy();

    @Query(name = "Member.findByUsrname")
    List<Member> findByUsername(@Param("username") String username);
}
