package com.meituan.sample;

import com.meituan.robust.patch.annotaion.Add;

/**
 * Created by mivanzhang on 17/2/8.
 */
@Add
public class InnerTest {
    public String field = "Innertest";

    public String getTextI1(String baidu) {
        SecondActivity main2Activity = new SecondActivity();
        main2Activity.getTextI2("asdasd");
        return "asdasd";
    }
}
