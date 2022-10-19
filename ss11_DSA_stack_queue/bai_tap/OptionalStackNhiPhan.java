package ss11_DSA_stack_queue.bai_tap;

import java.util.Stack;

public class OptionalStackNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stackInteger=new Stack<>();
        int numberThapPhan=111;
        int copyNumber=numberThapPhan;
        while (copyNumber>0)
        {
            stackInteger.push(copyNumber%2);
            copyNumber/=2;
        }
        System.out.print(numberThapPhan+" có hệ nhị phân: ");
        while (!stackInteger.empty())
        {
            System.out.print(stackInteger.pop());
        }
    }
}
