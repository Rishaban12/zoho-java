
    import java.util.Scanner;

    public class Seven {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter percentage: ");
            int percent = sc.nextInt();

            System.out.print("Grade using if-else: ");
            if (percent >= 85 && percent <= 100) {
                System.out.println("A");
            } else if (percent >= 70) {
                System.out.println("B");
            } else if (percent >= 50) {
                System.out.println("C");
            } else {
                System.out.println("Fail");
            }


            int gradeKey = percent / 10;

            System.out.print("Grade using switch: ");
            switch (gradeKey) {
                case 10: // 100
                case 9:  // 90–99
                case 8:  // 80–89
                    if (percent >= 85) {
                        System.out.println("A");
                    } else {
                        System.out.println("B"); // 80–84
                    }
                    break;
                case 7:  // 70–79
                    System.out.println("B");
                    break;
                case 6:  // 60–69
                case 5:  // 50–59
                    System.out.println("C");
                    break;
                default:
                    System.out.println("Fail");
            }

            sc.close();
        }
    }


