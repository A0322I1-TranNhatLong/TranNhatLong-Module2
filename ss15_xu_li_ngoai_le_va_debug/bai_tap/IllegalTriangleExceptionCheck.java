package ss15_xu_li_ngoai_le_va_debug.bai_tap;

public class IllegalTriangleExceptionCheck {
    public void IllegalTriangleException(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Lỗi : Tam giác không hợp lệ !");
        } else {
            System.out.println("Tam giác hợp lệ !");
        }
    }
}
