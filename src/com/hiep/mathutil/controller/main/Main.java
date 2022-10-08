/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiep.mathutil.controller.main;

import com.hiep.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {

    //hàm này được viết ra để dùng thử kx thuật vvieets code kiểu TDD
    //Gọi thử dung thử hàm chính trên core bên MathUtil
    //Xem nó 
    public static void tryTDDFirst() {
        //Test case #1 (tình huống kiểm thử hàm số 1/xài thử hàm):
        // Input n = 1;
        //Gọi hàm getFactorial(1)
        //Hy vong ham tra ve 1, ve 1!=1

        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        //so sánh expected vs atual coi chúng giống nhau k?
        //giống -> hàm đúng với case đang test
        //sai -> bug rồi!! với case đang test
        System.out.println("Test 1! | status " + " | Expected : " + expected + " | Actual : " + actual);

        //Test getFactorial(2)
        long actual2 = MathUtil.getFactorial(2);
        System.out.println("Test 2! | status " + " | Expected : 2" + " | Actual : " + actual2);
    }

    public static void main(String[] args) {
        System.out.println("Thí statement comes form the main() method");
        tryTDDFirst();
        //testFactorailGivenWrongArgumentThrowsException();
    }

    public static void testFactorailGivenWrongArgumentThrowsException() {
        //Test case 3: dua data ca n am , n qua lon   
        //ham duoc thiet ke nem ve ngoai le
        //thay ngoai le mung roi nuocc mat
        //khi dua vao -5
        //thay ngoai le xuat hien nh ki vong -> passed cai test -> mau xanh
        System.out.println("Hope to see Exception illegal Argument Exception");
        MathUtil.getFactorial(-5);
        
    }
}
//Test case là gì?
// là 1 tính huống xài app/kiểm thử app/kiểm thử tihs năng/màn hình 
//chức năng/xử lí của app
//Test case là tình huống kiểm thử app/chức năng mà khi đó
//ta phải đưa vào data giả/mẫu/test, 
//đưa ra giá trị kì vọng ta mong chờ app trả ra
//sau đó chờ hàm tính năng xử lí xong trả ra kết quả
// và ta nhìn kết quả và ta só sánh với kỳ vọng trước đó
//để kết luận hàm ổn/tính năng ổn, test case  passed
//                                    test case failed
