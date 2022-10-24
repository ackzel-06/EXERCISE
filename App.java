public class App {
    public static void main(String[] args) throws Exception {



    //    // Outer loop
    //     for (int hours = 0; hours < 12; hours++) {



    //        // inner loop
    //         for (int minutes = 0; minutes < 60; minutes++) {
    //                 System.out.println(hours + " : " + minutes );
    //                     for (int seconds =  0; seconds < 60; seconds++) {
    //                         System.out.println( hours + " : " +  minutes + " : " + seconds) ;
    //         }       
    String[][] tiles4x3 = {{ "A", "B", "C"}, {"D","E","F"}, {"I", "J", "K"}, {"L", "M", "L" }};
    for (int rows = 0; rows  < tiles4x3.length; rows++) {
    
    
        // inner loop
         for (int column = 0; column < 3; column++ ) {
            System.out.println(tiles4x3[rows][column]);
        
         }
        }

    }
}   

// String[][] array4x3 = {{ "A", "B", "C"}, {"D","E","F"}, {"I", "J", "K"}, {"L", "M", "LI" }};
// for (int rows = 0; rows  < array4x3.length; rows++) {


//     // inner loop
//      for (int column = 0; column < 3; column++ ) {
//         System.out.println(array4x3[rows][column]);
    
//      }