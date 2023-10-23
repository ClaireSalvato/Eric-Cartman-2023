public class Project1 extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {


        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        eric();
        // This outer for loop begins on line 25 and ends on line 33
        for (int row = 0; row < 800; row = row + 1) {
            // This inner for loop begins on line 28 and ends on line 32
            for (int col = 0; col < 1000; col = col + 1) {
                plane.teleport(col, row);
                plane.setPixelColor(1, (int) col / 4, (int) row / 5); // Fills a pixel the red, green, blue (RGB) values you set
            }
        }
        eric2();

        plane.teleport(800, 700);

        squares();

    }

    public void squares() {

        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.pausetime = 2;
        plane.setColor(50, 50, 50);

        plane.startingAngle(90);
        square();

    }

    public void square() {
        plane.teleport(900, 20);
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(360);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(360);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(360);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(360);
        plane.setColor(225, 225, 225);
        plane.move(50);

        plane.teleport(50, 600);

        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(360);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(360);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(360);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(90);
        plane.setColor(225, 225, 225);
        plane.move(50);
        plane.turn(360);
        plane.setColor(225, 225, 225);
        plane.move(50);


    }

    public void eric(){

        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        for (int row = 1; row < 300; row = row + 1) {
            for (int col = 5; col < 327; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
              //  plane.teleport(col+400, row);

                if(10<red&green<40&blue>10){
                    plane.setPixelColor(red / 2, 200, blue);
                } else

                {
                    plane.setPixelColor(col/4,0,0);
                }
            }
        }

        plane.teleport(500,500);
//        plane.showBackGround();
    }
    public void eric2(){

        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
       // plane.showBackGround();
        System.out.println(plane.howMuchRed());

        for (int row = 1; row < 300; row = row + 1) {
            for (int col = 5; col < 327; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(col, 488 - row);
                  plane.teleport(col+300, row+250);

                if(10<red&green<50&blue>10){
                    plane.setPixelColor(red / 5, 200, blue);
                } else

                {
                    plane.setPixelColor(col/4,0,0);
                }
            }
        }

        plane.teleport(500,500);
//        plane.showBackGround();
    }

    public void loops () {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);

        // This outer for loop begins on line 25 and ends on line 33
        for (int row = 0; row < 500; row = row + 1) ;}


    }










