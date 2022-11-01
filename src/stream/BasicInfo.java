package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class BasicInfo {
    public static void main(String[] args) {
        //1 from collection: collection.stream()
        Collection<String> collection = Arrays.asList("a1", "a2", "a3");
        Stream<String> streamFromCollection = collection.stream();
        //Returns a sequential Stream with this collection as its source.

        //2 from values: Stream.of(1,...,N)
        //(mind Stream here)
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");
        //Returns a sequential _ordered_ stream whose elements are the specified values.

        //3 from array: Arrays.stream(array)
        String[] stringArray = {"a1", "a2", "a3"};
    }

}
