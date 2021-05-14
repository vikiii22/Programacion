package DatosFicheros;

import java.util.Objects;

public class Ordenador {
    private final String numeroSerie;
    private int tamnyoDisco;
    private int tamanyoRAM;
    private String CPU;

    public Ordenador(String numeroSerie, int tamnyoDisco, int tamanyoRAM, String CPU) {
        this.numeroSerie = numeroSerie;
        this.tamnyoDisco = tamnyoDisco;
        this.tamanyoRAM = tamanyoRAM;
        this.CPU = CPU;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || getClass() != obj.getClass()) return false;
        Ordenador ordenador=(Ordenador) obj;
        return numeroSerie.equals(ordenador.numeroSerie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroSerie);
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public int getTamnyoDisco() {
        return tamnyoDisco;
    }

    public void setTamnyoDisco(int tamnyoDisco) {
        this.tamnyoDisco = tamnyoDisco;
    }

    public int getTamanyoRAM() {
        return tamanyoRAM;
    }

    public void setTamanyoRAM(int tamanyoRAM) {
        this.tamanyoRAM = tamanyoRAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "numeroSerie='" + numeroSerie + '\'' +
                ", tamnyoDisco=" + tamnyoDisco +
                ", tamanyoRAM=" + tamanyoRAM +
                ", CPU='" + CPU + '\'' +
                '}';
    }
}
