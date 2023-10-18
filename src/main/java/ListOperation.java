import java.util.List;

public class ListOperation {
    public static double getAverageNumber(List<Integer> list) {
        int sum = 0;
        for (int num:
                list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

    public static String getGreaterNumber(List<Integer> list1, List<Integer> list2){
        double avNumber1 = getAverageNumber(list1);
        double avNumber2 = getAverageNumber(list2);
        if (avNumber1 > avNumber2){
            return "Первый список имеет большее среднее значение";
        } else if (avNumber1 < avNumber2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
