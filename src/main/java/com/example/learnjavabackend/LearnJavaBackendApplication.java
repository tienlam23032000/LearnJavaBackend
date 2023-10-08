package com.example.learnjavabackend;

import com.example.learnjavabackend.ExWeek1.Ex1reverseWords;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

import static com.example.learnjavabackend.ExWeek1.Ex2SortArrAscDes.sortAscending;
import static com.example.learnjavabackend.ExWeek1.Ex2SortArrAscDes.sortDescending;

@SpringBootApplication
public class LearnJavaBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearnJavaBackendApplication.class, args);

        // Run bài 1 tuần 1
        Ex1reverseWords text = new Ex1reverseWords(); // Tạo một đối tượng mới và gán vào text
        String[] str = "NTL học code Java".split(" ");  // Chia text thành một mảng các chuỗi con => str sẽ trở thành một mảng các chuỗi con
        text.reverse(str); //Thực hiện việc đảo ngược các từ trong mảng str.

        // Run bài 2 tuần 1
        int[] arr = {-1, 5, -5, 1, 10, 6};
        // Sắp xếp mảng theo hướng tăng dần
        sortAscending(arr);
        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(arr));

        // Sắp xếp mảng theo hướng giảm dần
        sortDescending(arr);
        System.out.println("Mảng sau khi sắp xếp giảm dần: " + Arrays.toString(arr));
    }

}
