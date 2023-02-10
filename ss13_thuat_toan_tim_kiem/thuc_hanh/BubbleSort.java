package ss13_thuat_toan_tim_kiem.thuc_hanh;

public class BubbleSort {
    static int[] list = {2,5,6,8,1,4,9,0,12,3};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int j : list) System.out.print(j + " ");
    }
}
