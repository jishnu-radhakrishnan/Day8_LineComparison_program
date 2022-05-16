public class Equality_Of_Two_Lines extends LengthOfLine{
    //To get length of 1st line
    public double distance1(){
        LengthOfLine L1=new LengthOfLine();
        int [] coordinate1=new int[4];
        coordinate1=L1.coordinatescollection();
        double distance1=L1.length(coordinate1);
        return distance1;
    }
    //To get length of 2nd line
    public double distance2(){
        LengthOfLine L2=new LengthOfLine();
        int [] coordinate2=new int[4];
        coordinate2=L2.coordinatescollection();
        double distance2=L2.length(coordinate2);
        return distance2;
    }
    //To check the equality of 2 lines
    public String equality(){
        if (distance1()==distance2())
            return "Equal";
        else
            return "Not Equal";
    }

    public static void main(String[] args) {
        Equality_Of_Two_Lines Line=new Equality_Of_Two_Lines();
        System.out.println("The two lines are "+ Line.equality());
    }
}
