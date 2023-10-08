package com.example.learnjavabackend.ExWeek1;
import java.util.Arrays;
import java.util.Collections;
public class Ex2SortArrAscDes {

    public static void sortAscending(int[] arr) {
        Arrays.sort(arr); // Sắp xếp mảng tăng dần
    }

    public static void sortDescending(int[] arr) {
        Integer[] arrBoxed = Arrays.stream(arr) // Chuyển mảng int thành mảng Integer
                .boxed() // boxed() để đóng gói mỗi số nguyên thành một đối tượng Integer,
                .toArray(Integer[]::new); // chuyển luồng này thành một mảng

        Arrays.sort(arrBoxed, Collections.reverseOrder()); // Sắp xếp mảng Integer giảm dần

        for (int i = 0; i < arr.length; i++) { //Duyệt qua từng phần tử i của mảng arrBoxed và gán chúng cho mảng arr tương ứng.
            arr[i] = arrBoxed[i]; // Chuyển kết quả sắp xếp trở lại mảng int ban đầu
        }
    }

}
