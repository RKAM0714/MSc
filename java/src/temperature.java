public class temperature {
    //1.Create a reference to an array (of doubles) called temperature
    double  [ ]  temperature;

    //The the array could have been created and populated by the following line
    //  double [ ] temperature = {9, 11.8, 18, 12.7};

    public Temperature()
    {
        //2.Allocate memory to store the array
        temperature = new  double[4];
    }

    public void basicArrayAccess()
    {
        //3. Populate the array
        temperature[0] = 9;
        temperature[1] = 11.8;
        temperature[2] = 18;
        temperature[3] = 12.7;

        //Output 2nd element
        System.out.println("Second element =  " + temperature[1]);

        //Try uncommenting the line below - what happens
        // System.out.println("Seventh element =  " + temperature[7]);

        //output all 4 temperatures
        for (int i = 0 ; i < temperature.length ; i++)
        {
            System.out.println("Element at position " + i + " = " + temperature[i]);
}
