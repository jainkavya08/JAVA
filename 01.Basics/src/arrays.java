public class arrays {
    public static void main (String[] args) {

        int[] marks = {90 , 85, 88, 92, 95} ;

        // Access element
        System.out.println(marks[0]);

        // Change element
        marks[2] = 89;

        // Loop through array
        for(int m : marks) {
            System.out.println(m);
        }
    }
}
