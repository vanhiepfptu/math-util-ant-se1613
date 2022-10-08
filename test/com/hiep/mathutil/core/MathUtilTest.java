/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiep.mathutil.core;

import com.hiep.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUtilTest {

    //Ta di test ngoai le tuc la so sanh do luong xem ngoai le
    //thay vi so sanh expected value vs actual value
    //Luc nay ta se di so sanh uoc luong xem ngoai le co xuat hien nhu ki vong hay k
    //Neu ngoai le xuat hien nhu ki vong thi mau xanh -  mau do ngoai le mung roi nuoc mat
    @Test(expected = Exception.class)
    public void testFactorailGivenWrongArgumentThrowsException() {
        //Test case 3: dua data ca n am , n qua lon   
        //ham duoc thiet ke nem ve ngoai le
        //thay ngoai le mung roi nuocc mat
        //khi dua vao -5
        //thay ngoai le xuat hien nh ki vong -> passed cai test -> mau xanh
        System.out.println("Hope to see Exception illegal Argument Exception");
        MathUtil.getFactorial(-5);
    }

    //coding convension - quy tac viet code
    //ten ham kiem thu/ten ham cua test script
    //phai noi len y ngia cua viec kiem thu
    //tinh huong nay, ta muon test ham getF() tham so tu te
    //n = 0..20!!
    @Test
    public void testFactorailGivenRightArgumentReturnsWell() {
        //test case so 1:  check n = 1, hy vong tra ve 1
        // thuc te ham tra ve may, doan xem
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //so sanh gua expected va actual, mahy tu so, k can
        //sout kho cuc
        Assert.assertEquals(expected, actual);
        //Test case so2: n=1, hy vong ham tra ve 1, thuc te??
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        //test case so3: n=2, hy vong ham tra ve 2, thuc te??
        Assert.assertEquals(2, MathUtil.getFactorial(2));

    }

    @Test
    public void testFactorailGivenRightArgumentReturnsWell2() {
        //test case so 1:  check n = 1, hy vong tra ve 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);

        //Test case so2: n=1, hy vong ham tra ve 1, thuc te??
        Assert.assertEquals(1, MathUtil.getFactorial(1));

        //test case so3: n=2, hy vong ham tra ve 2, thuc te??
        Assert.assertEquals(2, MathUtil.getFactorial(2));

        //test case so 4:  check n = 4, hy vong tra ve 24
        Assert.assertEquals(24, MathUtil.getFactorial(4));

        //test case so 5:  check n = 5, hy vong tra ve 120
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }

    //@test se ra lenh cho junit minh da add/import 
    //tu dong generate ra cai ham public static void main()
    //bien ham tryJunitComparison() thanh ham main()
    //va gui main() nay cho JVM chay -java virtual machine
    //@test -- main()
    //k @test thiclass k co main(), lay gi ma chay no runable method
    @Test
    public void tryJUnitComparison() {
        //ham nay thu nghiem viec so san expected vs actual
        //coi sai dung ra mau the nao
        //ta dang xai ham cua thu viena juit nhung k xai bua
        //bai ma phai viet theo quy tac dinh truoc
        //quy tac dinh truoc nam o @ - annotation
        Assert.assertEquals(169, 169);

    }

}

//Class nay ta se dung de test cac ham cua class mathutil
//trong class nay se co nhung loigoi ham getDactorial()
//co nhung lenh so sanh gia expected va actual
//giong minh da lam test o ben main
//nhung khac o day, dung ra xanh,sai ra do
//mat k can nhin cac dong output tu ham s.out cho mat cong mat suc
//mat gio chi nhin 2 mau xanh do
//muon co duocc dieu nay t ss dung them cac unit testing framework
//Vi du JUnit, TestNG (java)
// xUnit, MSTest, NUnit (C#)
// PHPUnit (PHP)
// ...
// Viec viet code de test code goi la unit testing
// Doan code trong class nay dung junit/uniit testing framework
// De kiem thu cua code chinh
// doan code kiem thu nay dgl test script
// code dung de test code (chinh) dgl test script
//test script la cac doan code duoc viet ra de test code chinh (DAO, DTO, controller, API...)
//Muon test thi can phai phac thao cac test case
//Test script se sd cac test case
//VD viet code de test ham getFactorial voi cac case
//n = -5,0, 1,....
//Quy tac xanh do
//xanh khi tat ca deu xanh, tuc la expected == actual cho tat ca cac case
//mau do chci can 1 trong nhung test case , chi can 1 cai expected != actual, ket luan manh tay : ham sai qua sai
//Y nghia cua quy tac neu da test, liet ke cac test case thi chung phai dung het, ham k on dinh ve viec return --> ham sai
//Dung dung het, sai thi chi can 1 thang
//expected == actual -> case dung , test case passed
//expected != actual -> case failed
//neu expected la chinh xac, ham da xu li sai, bug
//bang tay bi sai
