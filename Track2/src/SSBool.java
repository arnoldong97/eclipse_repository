public class SSBool {
    public void test() {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        if ( b1 & b2 | b2 & b3 | b2 ) /* Line 8 */
            System.out.print("ok ");
        if ( b1 & b2 | b2 & b3 | b2 | b1 ) /*Line 10*/
            System.out.println("dokey");
        char c1 = 064770;
       // char c2 = 'face';
//        char c3 = 0xbeef;
//        char c4 = ''\u0022;
//        char c5 = '\iface';
//        char c6 = '\uface';



    }
}
