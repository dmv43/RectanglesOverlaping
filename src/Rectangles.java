/**
 * Created by Lubimka on 26.12.2016.
 */
public class Rectangles {
    final double x11 = 0;
    final double y11 = 0;
    final double x12 = 3.5;
    final double y12 = 3.9;

    final double x21 = 2.7;
    final double y21 = 2.9;
    final double x22 = 4.0;
    final double y22 = 5.7;

    int testingValue = 0; //testing GitHub patches
    public void calculate() {
        double middleX1 = (x11 + x12) / 2;
        //System.out.println(middleX1);
        double middleX2 = (x22 + x21) / 2;
      //  System.out.println(middleX2);
        double middleY1 = (y11 + y12) / 2;
     //   System.out.println(middleY1);
        double middleY2 = (y22 + y21) / 2;
     //   System.out.println(middleY2);


        double overlappedLengthX = (x12 - middleX1) + (x22 - middleX2) - (middleX2 - middleX1);

        double overlappedLengthY = (y12- middleY1) + (y22 - middleY2) - (middleY2 - middleY1);

        System.out.println(overlappedLengthX * overlappedLengthY);
    }

}
