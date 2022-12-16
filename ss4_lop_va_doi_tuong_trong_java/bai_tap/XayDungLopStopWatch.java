package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class XayDungLopStopWatch {
    private double startTime;
    private double endTime;
    public XayDungLopStopWatch() {
        this.endTime = 0;
        this.startTime = 0;
    }
    public XayDungLopStopWatch(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public double getStartTime() {
        return startTime;
    }
    public double getEndTime() {
        return endTime;
    }
    public void Start() {
        this.startTime = System.currentTimeMillis();
        System.out.println("Time Begin accessing the algorithm selection sort is : " + this.startTime);
    }
    public void End() {
        this.endTime = System.currentTimeMillis();
        System.out.println("Time Ending accessing the algorithm selection sort is : " + this.endTime);
    }
    public double getElapsedTime() {
        return (this.endTime - this.startTime);
    }
    public static void main(String[] args) {
        XayDungLopStopWatch wacth = new XayDungLopStopWatch();
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 20;
        int max = arr[0];
        wacth.Start();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Max is : " + max);
        wacth.End();
        System.out.println(wacth.getElapsedTime());
    }
}
