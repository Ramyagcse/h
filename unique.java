public class unique{
public static void main(String[]args){
public static int[] uniqueRandomElements (int size) {

    int[] a = new int[size];

    for (int i = 0; i < size; i++) {
        a[i] = (int)(Math.random()*10);

        for (int j = 0; j < i; j++) {
            if (a[i] == a[j]) {
                a[j] = (int)(Math.random()*10);
            }
        }   
    }

    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]+" ");
    }
    System.out.println();
    return a;
}
}
}