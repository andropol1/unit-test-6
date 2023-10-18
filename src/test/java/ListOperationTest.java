
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListOperationTest {
    private List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
    private  List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
    private  List<Integer> list3 = new ArrayList<>(Arrays.asList(0,1,2));
    private  List<Integer> list4 = new ArrayList<>(Arrays.asList(2,3,4));

    @Test
    public void getAverageNumberTest(){
        double expectedResult = 2;
        assertEquals(expectedResult, ListOperation.getAverageNumber(list1), 0.001);
    }

    @Test
    public void getGreaterNumberTest(){
        String expectedResult1 = "Средние значения равны";
        String expectedResult2 = "Первый список имеет большее среднее значение";
        String expectedResult3 = "Второй список имеет большее среднее значение";
        assertEquals(expectedResult1, ListOperation.getGreaterNumber(list1, list2));
        assertEquals(expectedResult2, ListOperation.getGreaterNumber(list1, list3));
        assertEquals(expectedResult3, ListOperation.getGreaterNumber(list2, list4));
    }
}
