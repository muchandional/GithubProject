package flowControlDemo;

public class NestedForLoop {
    public static void main(String args[]){
        for(int i = 1; i <= 4; i++){
            System.out.println();
            for(int j = 1; j <= 7; j++){
                System.out.print(5 + "\t");
            }
        }
    }
}
