package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class BasicTasks {
    public static void main(String[] args) {
        /////////////
        //1. show 11 numbers, from beginning of 2, that are odd
        /////////////
        for (int n = 2; n < 23; n += 2) {
            System.out.print(n + ", ");
        }
        System.out.println();

        //Arrays.sort();

        for (int n = 1; n < 23; n++) {
            if (n % 2 == 0) {
                System.out.print(n + ", ");
            }
        }
        System.out.println();

        System.out.println(Stream.iterate(2, n -> n + 2).limit(11).toList());
        System.out.println();

        /*
        public static <T> Stream<T> iterate(     T seed,
    @NotNull java.util.function.UnaryOperator<T> f )
        Returns an infinite sequential ordered Stream produced by iterative application
         */

        /*
        Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.
        public abstract Stream<T> limit(     long maxSize )
         */

        /*
        collect(Collectors.toList) = stream.toList()
         */

        /////////////
        //2. check userlist, all users must be > 18 age
        /////////////
        List<User> users = new ArrayList<>(1000);

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            users.add(
                    new User(
                            i
                            , i * random.nextInt(1000)
                            , "user" + i
                            , 17 + random.nextInt(120)
                            , random.nextInt(10) % 2 == 1 ? Sex.FEMALE : Sex.MALE
                    ));
        }

        boolean isCorrect = true;
        for (User user : users) {
            if (user.getAge() < 18) {
                isCorrect = false;
                break;
            }
        }
        System.out.println(isCorrect);

        System.out.println(users.stream().allMatch(user -> user.getAge() >= 18));

        /*
        !!!terminal one
        Returns whether all elements of this stream match the provided predicate.
        public abstract boolean allMatch(     java.util.function.Predicate<? super T> predicate )
         */

        //well, if anything...
        if(users.stream().filter(user -> user.getAge() < 18).findFirst().isPresent()) {
            System.out.println(false);
        }

        System.out.println(
                users.stream().filter(user -> user.getAge() < 18)
                        .findFirst().orElse(new User(1, 123, "Ivan", 120, Sex.MALE)));

        //actually lives standalone (orElse is just a part of... Optional(but we need to return smth sensible and User))
        System.out.println(
                users.stream().filter(user -> user.getAge() < 18)
                        .findFirst());

        //users.stream().peek()

        /*
        public abstract Stream<T> filter(     java.util.function.Predicate<? super T> predicate )
        Returns a stream consisting of the elements of this stream that match the given predicate.
        This is an intermediate operation.
         */

        /*
        @NotNull
        public abstract java.util.Optional<T> findFirst()
        Returns an Optional describing the first element of this stream,
        or an empty Optional if the stream is empty.
        If the stream has no encounter order, then any element may be returned.
         */

    }

}
