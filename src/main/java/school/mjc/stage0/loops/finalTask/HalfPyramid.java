package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {

            for(int x=cathetusLength;x>=1;x--){
                for(int y=cathetusLength ;y>=1;y--){
                    if((y<cathetusLength-x+2)&&x<cathetusLength-y+2){
                    System.out.print("x");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }


        }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
