public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else
                System.out.print(arr[i]);
        }
        System.out.println();
        double[] dub = {1.57, 7.654, 9.986};
        for (int i = 0; i < dub.length; i++) {
            if (i < dub.length - 1) {
                System.out.print(dub[i] + ",");
            } else
                System.out.print(dub[i]);
        }
        System.out.println();
        int[] weight = {63, 54, 67, 95, 77};
        for (int i = 0; i < weight.length; i++) {
            if (i < weight.length - 1) {
                System.out.print(weight[i] + ",");
            } else
                System.out.print(weight[i]);
        }
        System.out.println("\n-------------------------------------------------------------");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr[i] + ",");
            } else
                System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = dub.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(dub[i] + ",");
            } else
                System.out.print(dub[i]);
        }
        System.out.println();
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(weight[i] + ",");
            } else
                System.out.print(weight[i]);
        }
        System.out.println("\n-------------------------------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] % 2 == 0)) {
                arr[i] += 1;
            }
            if (i < arr.length - 1) {
                System.out.printf(arr[i] + ",");
            } else System.out.print(arr[i]);
        }

    }


}