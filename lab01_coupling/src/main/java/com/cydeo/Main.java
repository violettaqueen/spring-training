package com.cydeo;
import com.cydeo.tightlyCoupling.BalanceService;
import com.cydeo.tightlyCoupling.BalanceService;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        UUID user = UUID.randomUUID();

        CustomerBalance customerBalance = new CustomerBalance(user, BigDecimal.ZERO);
        GiftCardBalance giftCardBalance = new GiftCardBalance(user, BigDecimal.ZERO);

        customerBalance.addBalance(new BigDecimal(150));
        giftCardBalance.addBalance(new BigDecimal(120));

        BalanceService balanceService =
                new BalanceService(customerBalance, giftCardBalance);

        System.out.println(balanceService.checkoutFromCustomerBalance(new BigDecimal(80)));
        System.out.println(balanceService.checkoutFromGiftBalance(new BigDecimal(80)));
    }

}