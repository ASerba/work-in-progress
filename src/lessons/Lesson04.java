package lessons;

public class Lesson04 {
    static String arrayToString(int [] arr) {
        StringBuilder stringBuilder =  new StringBuilder("(");
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
            if (i != arr.length-1) {
                stringBuilder.append(", ");
            }

        }
        stringBuilder.append(")");
        String result = stringBuilder.toString();
        return result;
    }


}
