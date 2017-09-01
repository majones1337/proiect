package src;

/**
 * Created by Bobo on 01.09.2017.
 */
public class Abonat implements Comparable<Abonat>  {
    private String nume;
    private String prenume;
    private String CNP;
    private NrTel numar;

    public Abonat(String prenume, String nume, String CNP, NrTel numar) {
        this.prenume = prenume;
        this.nume = nume;
        this.CNP = CNP;
        this.numar = numar;
    }

    public String getPrenume() {
        return prenume;
    }


    public String getNume() {
        return nume;
    }

    public String getCNP() {
        return CNP;
    }


    public NrTel getNumar() {
        return numar;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Detalii abonat " +
                "Nume: " + nume +
                " Prenume: " + prenume +
                ", CNP:  " + CNP +
                ", Numar de telefon:" + numar;
    }

    @Override
    public int compareTo(Abonat o) {
        if (this.CNP.equals(o))
            return 1;
        else
            return 0;
    }
}
