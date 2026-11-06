public class Main {

    public static void main(String args[]){

        House h1 = new House();
        House h2 = new House();
        House h3 = new House();
        House h4 = new House();
        House h5 = new House();

        h1.houseName = "abc";
        h1.houseNumber = 1;
        h1.laneType = 'A';
        h1.isMultiStoried = false;



        Colony colony = new Colony();

        colony.houses[0] = h1;
        colony.houses[1] = h2;
        colony.houses[2] = h3;
        colony.houses[3] = h4;
        colony.houses[4] = h5;


    }
}
