package person;

public class ObjEnjine {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Ivanov Ivan Ivanovich", 123_123_123_123_12L);
        Patient patient2 = new Patient("Ivanov Ivan Ivanovich2", 123_123_123_123_13L);
        Patient patient3 = new Patient("Ivanov Ivan Ivanovich", 123_123_123_123_12L);
        System.out.println(patient1.equals(patient2));
        System.out.println(patient1.equals(patient3));
        System.out.println(patient1.equals(patient1));
        System.out.println(patient1.equals(new Object()));
    }
}
