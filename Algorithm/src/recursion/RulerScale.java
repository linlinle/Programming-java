package recursion;

/**     画一把英式尺子     */

public class RulerScale {
    /** Draws an English ruler for the given number of inches and major tick length. */
    public static void drawRuler(int nInches,int majorLength){
        drawLine(majorLength,0);
        for (int j=1;j<=nInches;j++){
            drawInterval(majorLength - 1);
            drawLine(majorLength,j);
        }
    }
    private static void drawInterval(int cetralLength){
        if (cetralLength >=1){
            drawInterval(cetralLength - 1);
            drawLine(cetralLength);
            drawInterval(cetralLength - 1);
        }
    }
    private static void drawLine(int tickLength, int tickLabel){
        for (int j=0;j<tickLabel;j++)
            System.out.print("-");
        if (tickLabel>=0)
            System.out.print("\n");
    }
    /** Draws a line with the given tick length (but no label). */
    private static void drawLine(int tickLength){
        drawLine(tickLength,-1);
    }
}
