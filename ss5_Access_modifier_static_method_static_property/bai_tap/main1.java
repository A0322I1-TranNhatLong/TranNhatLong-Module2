package ss5_Access_modifier_static_method_static_property.bai_tap;

public class main1 {
    public static void main(String[] args) {
        Access_modifier access_modifier=new Access_modifier();
        System.out.println(access_modifier.getRadius()+" "+access_modifier.getArea());
        access_modifier.setRadius(3);
        System.out.println(access_modifier.getRadius()+" "+access_modifier.getArea());
    }
}
