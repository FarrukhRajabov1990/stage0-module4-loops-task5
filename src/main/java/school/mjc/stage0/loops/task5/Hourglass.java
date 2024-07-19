package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        for (int i= 0; i < height; i++) {
            for (int j=0; j<height; j++) {
                if (i == 0 || i == height-1 || i == j || i + j == height){
                    System.out.print(8);
                }
            }
            System.out.println();
        }
    }
}
