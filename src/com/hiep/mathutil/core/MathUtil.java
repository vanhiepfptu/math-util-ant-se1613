/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiep.mathutil.core;

/**
 *
 * @author Admin
 */
//đây là class mô phỏng lại các hàm tiện ích/ dùng chung vho mọi class khác, mô phỏng lại class tiện ích java.Math của JDK
public class MathUtil {

    public static final double PI = 3.14;

    //hàm tiện ích tính n!= 1 2 3 n
    //Luu ý quy ước
    //Không tính giai thừa số âm
    //0!= 1! = 1
    //Vì giai thừa tăng cực nhanh,nên 21! đã vượt quá 18 số 0
    //tràn kiểu long
    //ta k tính 21! trở lên
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0..20");
        } else if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1; // biena cong don nhan don bien con heo dat
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        //song sot den day sure n = 2..20
        //k xai else vi da co return
        return product;
    }

}
//Coding convention: quy tac viet code Cty ep phai theo!!
//Alt Shift F = format
//Ta sẽ học sơ về khái niệm TDD - Test Driven Development
//Là kỹ thuật lâp trình /áp dụng cho dân Dev để gia tăng
//chất lượng code/giảm thiểu công sức tìm bug/phát hiện bug từ sớm
//TDD yêu cầu dev khi viết code/viết hàm.class phải viết luoob cách sử dung hàm này/viết luôn 
//các bộ kiểm thử/viết luôn các test case/viết luôn các đoạn code dùng thử hàm để kiểm tra tính đúng đắn của hàm/class
//viết code akemf với viết test cases
//viết code có ý thức viết luôn phần kiểm thử hàm/code/class
//development driven                              test
//Sau khi có được tên hàm(chỉ tên hàm mà th)
//Ta viết luôn các tình hướng xài hàm
//chấp nhận khi chạy hàm chạy sai - do code ch xong
//sau đó ta tối ưu/ chỉnh sửa code để đảm bảo code chạy đúng
//Qua trình sai đúng sai đúng diễn ra liên tục (cycle)
