import java.security.Permission;
import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            String s = String.valueOf(n);
            if (n == Integer.parseInt(s)) {
                System.out.println("Good Job");
            } else {
                System.out.println("Wrong Answer");
            }
        }catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}


    //The following class will prevent you from terminating the code using exit(0)!
    class DoNotTerminate {

        public static class ExitTrappedException extends SecurityException {

            private static final long serialVersionUID = 1;
        }

        public static void forbidExit() {
            final SecurityManager securityManager = new SecurityManager() {
                @Override
                public void checkPermission(Permission permission) {
                    if (permission.getName().contains("exitVM")) {
                        throw new ExitTrappedException();
                    }
                }
            };
            System.setSecurityManager(securityManager);
        }
    }
