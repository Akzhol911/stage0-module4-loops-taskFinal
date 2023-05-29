package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int x=cathetusLength;x>=1;x--){
            for(int y=x ;y>=1;--y){
                System.out.print(x);
                }
            System.out.println("");
            }


    }



    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
