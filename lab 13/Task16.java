import java.util.*;
import java.util.stream.Collectors;

public class Task16 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("A", 20, 0),
                new Student("B", 20, 0),
                new Student("C", 22, 0)
        );

        Map<Integer, List<Student>> grouped =
                list.stream()
                    .collect(Collectors.groupingBy(s -> s.age));

        System.out.println(grouped);
    }
}