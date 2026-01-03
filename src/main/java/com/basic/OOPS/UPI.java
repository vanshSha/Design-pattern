package com.basic.OOPS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UPI implements PaymentMethod {

    String upiID;

    @Override
    public void pay() {
        System.out.println("Making payment via UPIID : " + upiID);
    }
}
