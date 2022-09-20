package doit.chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 신체 검사 데이터 배열에서 이진 검색하기
public class PhysExamSearch {
    static class PhyscData {
        private final String name;
        private final int height;
        private final double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            PhyscData[] data = {
                    new PhyscData("김일동", 185, 0.3),
                    new PhyscData("박이동", 181, 0.5),
                    new PhyscData("이삼동", 184, 1.3),
                    new PhyscData("최사동", 166, 1.5),
                    new PhyscData("신오동", 178, 1.8),
                    new PhyscData("임육동", 170, 0.9),
                    new PhyscData("진칠동", 177, 0.2)
            };
            System.out.println("몇 cm인 사람을 찾고 있나요?");
            int height = sc.nextInt();
            int idx = Arrays.binarySearch(data, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
            if (idx < 0) {
                System.out.println("요소가 없습니다.");
            } else {
                System.out.println("x[" + idx + "]에 있습니다.");
                System.out.println("찾은 데이터 : " + data[idx]);
            }
        }
    }
}
