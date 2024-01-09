import java.util.ArrayList;
public class StarshipExplorer {

    //declaring an array
    Alien[] UFO;
    boolean change=true;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        //print statement
        System.out.println("Hello World! Good luck on your exams!");
        StarshipExplorer Starship = new StarshipExplorer();


    }



    //constructor
    public StarshipExplorer() {

        //making the array
        UFO = new Alien[10];
        for (int i = 0; i < UFO.length; i++) {

            UFO[i] = new Alien((int) (Math.random() * 50), (int) (Math.random() * 50));
        }
        displayAliens();
        sortAliens();
        System.out.println("****************");
        displayAliens();
    }

        //new method
        public void displayAliens(){
        //looping through array
          for(int a = 0; a < UFO.length; a++){
              UFO[a].printInfo();
          }
        }

        //new method
        public void sortAliens(){
        while(change==true){
            change=false;
        for(int x=0; x < UFO.length-1; x++) {
            if (UFO[x].energyLevel > UFO[x + 1].energyLevel) {
                //System.out.println("change");
                Alien hold;
                hold = UFO[x];
                UFO[x] = UFO[x + 1];
                UFO[x + 1] = hold;
                change=true;
            }
        }
        }

        }




}