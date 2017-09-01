package src;

/**
 * Created by Bobo on 01.09.2017.
 */
public abstract class NrTel {
private String tipAbonament;
private String numar;

    protected NrTel(String tipAbonament, String numar) {
        this.tipAbonament = tipAbonament;
        this.numar = numar;
    }

    @Override
    public String toString() {
        return "Abonatul are " +
                "tipul de abonament " + tipAbonament +
                " cu numarul de telefon " + numar;
    }
}
