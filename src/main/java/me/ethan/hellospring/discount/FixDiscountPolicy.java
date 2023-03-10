package me.ethan.hellospring.discount;

import me.ethan.hellospring.member.Grade;
import me.ethan.hellospring.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private final static int DISCOUNT_FIX_AMOUNT = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return DISCOUNT_FIX_AMOUNT;
        }
        return 0;
    }
}
