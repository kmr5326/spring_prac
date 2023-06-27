package hello.core;

import hello.core.discount.DiscountPolicy;
<<<<<<< HEAD
import hello.core.discount.FixDiscountPolicy;
=======
import hello.core.discount.RateDiscountPolicy;
>>>>>>> a7c6dc50e66ae966fae18928c3d64822fac55638
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
<<<<<<< HEAD

public class AppConfig {

=======
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
>>>>>>> a7c6dc50e66ae966fae18928c3d64822fac55638
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

<<<<<<< HEAD
    private static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    private static DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }


=======
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }

>>>>>>> a7c6dc50e66ae966fae18928c3d64822fac55638
}
