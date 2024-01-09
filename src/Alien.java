public class Alien {
    //variables
    public int energyLevel;
    public int hostilityLevel;



    //constructor (parameter inside can't have the same name)
    public Alien(int penergyLevel, int phostilityLevel){
        //parameter
        energyLevel = penergyLevel;
        hostilityLevel = phostilityLevel;
    }
    //method
    public void printInfo(){
        System.out.println("Energy Level:"+energyLevel);
     //   System.out.println("Hostility Level:" + hostilityLevel);
    }

}

