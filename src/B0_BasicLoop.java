public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.pausetime = 0;

        for (int a = 10; a > 0; a--) {
            for (int z = 10; z > 0; z--) {


                plane.setColor(a*15, 50, 35 / z);
                // plane.startingAngle(360);
                plane.teleport(a * 80, z * 80);

                plane.square(70);
                // plane.move(70);


            }

            }

        }
    }
