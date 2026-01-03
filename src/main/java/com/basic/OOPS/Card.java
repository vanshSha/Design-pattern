package com.basic.OOPS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
abstract class Card implements PaymentMethod{

    protected String cardNo;

    protected String userName;


}
