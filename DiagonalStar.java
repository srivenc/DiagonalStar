public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid value");
        } else {

            for (int rowNumber = 1; rowNumber <= number; rowNumber++) {
                if(rowNumber == 1){
                    for(int i = 1;i<=number;i++){
                        System.out.print("*");
                    }
                    continue;
                } else if(rowNumber == number){
                    System.out.println("");
                    for(int i = 1;i<=number;i++){
                        System.out.print("*");
                    }
                    continue;
                }
                System.out.println("");
                for(int columnNumber = 1; columnNumber<= number; columnNumber++){
                    if(columnNumber == 1 || columnNumber == number){
                        System.out.print("*");
                    }else if(columnNumber == rowNumber){
                        System.out.print("*");
                    } else if(columnNumber == number - rowNumber + 1){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
