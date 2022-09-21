package wk2;
import javax.swing.*;

public class lab3ex1 {
    public static void main( String args[] ) {
        lab3ex1 b = new lab3ex1();
        b.interactiveArray();
    }
    public void interactiveArray() {

        int[] numberBlueTits = new int[7];
        String strInput;
        int intInput;

        for (int i = 0; i < numberBlueTits.length; i++) {
            strInput = JOptionPane.showInputDialog("Enter daily Blue Tit count " + (i + 1));
            intInput = Integer.parseInt(strInput);
            numberBlueTits[i] =intInput;
        }

        String outputHistogramHeading = "Day\tNo. of Blue Tits\tHistogram";

        for (int counter = 0; counter < numberBlueTits.length; counter++){
            outputHistogramHeading += "\n" + counter + "\t" + numberBlueTits[counter] + "\t";

            for (int histogramStars = 0; histogramStars < numberBlueTits[counter]; histogramStars++)
                outputHistogramHeading += "*";

        }

        JTextArea outputArea = new JTextArea();
        outputArea.setText(outputHistogramHeading);

        JOptionPane.showMessageDialog(null, outputArea, "Blue Tit Counter", JOptionPane.INFORMATION_MESSAGE);
    }

}