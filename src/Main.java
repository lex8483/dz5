public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < 2; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[2]);
        System.out.println();
        double[] dub = {1.57, 7.654, 9.986};
        for (int i = 0; i < 2; i++) {
            System.out.print(dub[i] + ",");
        }
        System.out.print(dub[2]);
        System.out.println();
        int[] weight = {63, 54, 67, 95, 77};
        for (int i = 0; i < 4; i++) {
            System.out.print(weight[i] + ",");
        }
        System.out.print(weight[4]);
        System.out.println("\n-------------------------------------------------------------");
        for (int i = 2; i > 0; i--) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[0]);
        System.out.println();
        for (int i = 2; i > 0; i--) {
            System.out.print(dub[i] + ",");
        }
        System.out.print(dub[0]);
        System.out.println();
        for (int i = 4; i > 0; i--) {
            System.out.print(weight[i] + ",");
        }
        System.out.print(weight[0]);
        System.out.println("\n-------------------------------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] % 2 == 0)) {
                arr[i] += 1;
            }
            System.out.printf(arr[i] + " ");
        }

    }


}