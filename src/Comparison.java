public class Comparison extends Equality_Of_Two_Lines{
    //To Compare 2 lines
    public void compare() {
        double d1=distance1();
        double d2=distance2();
        if (d1==d2){
            System.out.println("The 2 lines are Equal");}
        else if (d1 > d2){
            System.out.println("1st line is greater than 2nd line");}
        else
            System.out.println("2nd line is greater than 1st line");
    }
    public static void main(String[] args) {
        Comparison Comp=new Comparison();
        Comp.compare();
    }
}
