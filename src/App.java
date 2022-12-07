//To get started: add image to src folder
//If using Google Image, select Tools > Color > Transparent

import javadraw.*;

public class App extends Window{

    //Global Image variable
    Image java;
    public static void main(String[] args) throws Exception {
        Window.open();
    }

    public void start(){
        //Creates Image from image in src folder at Location (0,0)
        java = new Image(screen, "src/java.png", 0, 0);

        //Image was a little large, so change width and height
        java.width(40);
        java.height(40);

        //Alternatively you can use:
        // java.transform(40,40,0);
        //First variable changes width, second height, third is unused but would do angle
    }

    //Turning image into a mouse icon
    public void mouseMove(Location loc){
        java.center(loc);
    }
}
