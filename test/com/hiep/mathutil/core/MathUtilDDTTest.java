/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.hiep.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.hiep.mathutil.core.MathUtil.getFactorial;

/**
 *
 * @author admin
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    //1. Chuẩn bị bộ data là mảng 2 chiều, 2 cột ứng với Expected và n
    //dòng ứng với test case
    
    //mảng Object, số thì dùng wrapper class - class gói các primitive
    @Parameterized.Parameters
    public static Object[] initData() {
//        int a[] = {5, 10, 15, 20, 25};//liệt kê các phần tử mảng
//        int b[][] = {{1,0},{1,1},{2,2},{6,3},{24,4},{120,5}};
        return new Integer[][] {
            {1,0},
            {1,1},
            {2,2},
            {6,3},
            {24,4},
            {120,5}
        };
    }
    
    //Ta sẽ map các cột với mỗi dòng, ví dụ dòng đầu tiên
    //có 2 cột là 1 0 -> ta sẽ ánh xạ 1 vào biến expected, 0 vào biến n
    //tương tự cho các dòng còn lại
    @Parameterized.Parameter(value = 0)
    public long expected; // map vào cột 0 của mảng
    
    @Parameterized.Parameter(value = 1)
    public int n;//
    
    @Test 
//kiểm thử các test case với data được trích ra từ mảng và map vào 2 biến tương ứng
    public void TestFactorialGivenRightArgumentReturnWell() {
        assertEquals(expected, getFactorial(n));
    }
}
//phân tích cách ta vode cho phần test hàm getF() hôm trước
//Assert.assertEquals(1, MathUtil.getFactorial(0)); lệnh dùng để test
//hàm/method. Lệnh này lặp đi lặp lại cho các data ta đưa vào
//để ta kt các tình huống xài hàm/test case
//Lát hồi ta thay data 1 0 thành data tương ứng khsac
//Ví dụ
//Expected n!
//1        0 -> có ổn ko ?
//1        1 
//2        2
//6        3
//.....
//Assert.assertEquals(1, MathUtil.getFactorial(?));
//Nếu ta có được cách nào đó, mà tách data ra riêng 1 chỗ
//sau đó từ từ feed data này vào câu lệnh test hàm ở trên
//coi như chỉ cần 1 lệnh gọi test hàm, data cứ thế tuần tự đẩy vào
//kt tách data ra khỏi các câu lệnh test, sau đó nhồi nó vô
//cái câu lệnh test, giúp rút gọn số câu lệnh test, giúp dễ dàng
//kiểm tra tính thiếu đủ của các test case
//kt này gọi là DDT - Data Driven Testing
//viết code kiểm thử hướng theo tách data
//Còn gọi 1 cách khác là : kiểm thử theo kiểm tham số hóa - patameterize
//Dấu ? ở câu lệnh gọi hàm chính là tên biến dùng để nhận
//Data từ tập data đã tách ra - convert data thành biến

//chơi vs ddt ta cần
//bộ data test - tách riêng
//các tham số ứng với bộ data - các biến được tách ra
//gọi hàm kiểm thử xài các tham số

//toàn bộ code trong class này được viết ra dùng để test code chính ở bên src pkg
//code đc viết ra dùng để đi test code khác
//thì code này được gọi là test script
//1 test script sẽ chứa nhiều code để test hàm chính
//1 test script sẽ chứa nhiều test case
//                            test case : các tình huốgn xài hàm
// 1 test script có thể xài DDT để dễ bảo trì code test
// code chính có thể xài TDD


