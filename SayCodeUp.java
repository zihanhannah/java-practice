/**
 * Exercise 003 - Say Codeup
 *
 * Write a method to return an array of nine strings with the message below using asterisk.
 *
 *
 *             * * * * *                 * *             * * * * * * *          * * * * * * * *     *                 *      * * * * * *
 *           *           *            *       *          *             *        *                   *                 *      *           *
 *         *               *       *             *       *              *       *                   *                 *      *            *
 *       *                        *               *      *               *      *                   *                 *      *           *
 *       *                        *               *      *               *      * * * * * * *       *                 *      * * * * * *
 *       *                        *               *      *               *      *                   *                 *      *
 *         *               *       *             *       *              *       *                    *               *       *
 *           *           *            *       *          *             *        *                       *         *          *
 *             * * * * *                 * *             * * * * * * *          * * * * * * * *            * * *             *
 *
 *
 *
 * LEVEL: BASIC
 *
 * @return      A String array with an asterisks drawing of CODEUP
 */
public class SayCodeUp {
    public static String[] sayCodeUp(){
        String[] message = new String[9];
        message[0] = "             * * * * *                 * *             * * * * * * *          * * * * * * * *     *                 *      * * * * * *";
        message[1] = "           *           *            *       *          *             *        *                   *                 *      *           *";
        message[2] = "         *               *       *             *       *              *       *                   *                 *      *            *";
        message[3] = "       *                        *               *      *               *      *                   *                 *      *           *";
        message[4] = "       *                        *               *      *               *      * * * * * * *       *                 *      * * * * * *";
        message[5] = "       *                        *               *      *               *      *                   *                 *      *";
        message[6] = "         *               *       *             *       *              *       *                    *               *       *";
        message[7] = "           *           *            *       *          *             *        *                       *         *          *";
        message[8] = "             * * * * *                 * *             * * * * * * *          * * * * * * * *            * * *             *";
        return message;
    }
    public static void main(String[] args) {
        String[] codeup = sayCodeUp();
        for(int i = 0; i< codeup.length; i++){
            System.out.println(codeup[i]);
        }

    }
}
