package person;

public class Patient {
    private String fio;
    private long snils;

    public Patient(String fio, long snils) {
        this.fio = fio;
        this.snils = snils;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public long getSnils() {
        return snils;
    }

    public void setSnils(int snils) {
        this.snils = snils;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (object instanceof Patient) {
            Patient patient = (Patient) object;
            if (this.snils == patient.snils) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return /*Long.hashCode(snils);*/fio.hashCode();
    }
}

