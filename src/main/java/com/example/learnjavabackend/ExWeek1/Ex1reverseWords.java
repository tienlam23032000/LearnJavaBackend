package com.example.learnjavabackend.ExWeek1;

public class Ex1reverseWords {
    // Tạo ra một method không trả về, nhận tham số vào là một mảng chuỗi befor
    public void reverse(String[] befor) {
        String after = "";  //Khởi tạo một biến after kiểu chuỗi rỗng. Biến này sẽ được sử dụng để lưu trữ kết quả đảo ngược của mảng befor.

        //Vòng lặp for dùng để duyệt qua mảng befor từ cuối về đầu.
        for (int i = befor.length - 1; i >= 0; i--) { //Bắt đầu từ phần tử cuối cùng của mảng i = befor.length - 1;lặp đến khi i không còn lớn hơn hoặc bằng 0 (i >= 0), và sau mỗi lần lặp giảm i đi 1 (i--).
            after = after + befor[i] + " "; //Mỗi lần lặp, chuỗi after được cộng thêm vào giá trị của phần tử hiện tại của mảng befor tại vị trí i, cộng thêm một khoảng trắng (" ") sau mỗi phần tử
        }
        System.out.println("Chuỗi được đảo ngược thành: " +after);

    }
}
