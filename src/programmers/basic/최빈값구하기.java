package programmers.basic;

import java.util.*;

public class 최빈값구하기 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4};
        System.out.println(solution(arr));
        int[] arr1 = {1, 1, 2, 2};
        System.out.println(solution(arr1));
        int[] arr2 = {1};
        System.out.println(solution(arr2));
    }

    public static int solution(int[] array) {
//        int mode = 0; //최빈값이 담길 그릇
//        int[] index = new int[array.length+1]; //인덱스의 카운터
//        int max = Integer.MIN_VALUE;
//        //[2] 처리
//        for (int i = 0; i < array.length; i++) {
//            index[array[i]]++; //COUNT
//        }
//        for (int i=0; i< index.length; i++){
//            if(max == index[i]){
//                mode = -1;
//            }else if(max<index[i]){
//                max = index[i]; //MAX
//                mode = i; //최빈값 : MODE
//            }
//        }
//        return mode;
//    }

        int n = array.length;
        Map<Integer, Integer> mp = new HashMap<>();

        if (n == 1) {
            return array[0];
        }
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(array[i])) {
                mp.put(array[i], mp.get(array[i]) + 1);
            } else {
                mp.put(array[i], 1);
            }
        }
        int maxValue = Collections.max(mp.values());
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 가장 많이 나온 값
        for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
            if (m.getValue() == maxValue) {
                arrayList.add(m.getKey());
            }
        }
        Collections.sort(arrayList);
        // 가장 많이 나온 값이 여러개일 경우 두번째로 작은 값
        if (arrayList.size() > 1)
            return -1;
        else // 가장 많이 나온 값이 하나면
            return arrayList.get(0);
    }
}
