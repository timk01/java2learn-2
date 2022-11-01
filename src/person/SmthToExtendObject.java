package person;

public class SmthToExtendObject extends Object {
    public static void main(String[] args) {
        System.out.println("yes, i really explicitly extend object. why ?");
    }

    @Override
    public boolean equals(Object object) {
        return false;
    }
}
