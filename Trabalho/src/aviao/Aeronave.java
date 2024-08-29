package aviao;

public class Aeronave
{
    public static final int MAX_AERONAVES = 5;
    public static String[] modeloAeronave = new String[MAX_AERONAVES];
    public static String[] registroAeronave = new String[MAX_AERONAVES];
    public static int[] capacidadeAeronave = new int[MAX_AERONAVES];
    public static int contadorAeronave = 0;

    public void CadastroAeronaves (String[] modeloAeronave, String[] registroAeronave, int[] capacidadeAeronave)
    {
        this.modeloAeronave = modeloAeronave;
        this.capacidadeAeronave = capacidadeAeronave;
        this.registroAeronave = registroAeronave;
    }

    public static String[] getModeloAeronave() {
        return modeloAeronave;
    }

    public static void setModeloAeronave(String[] modeloAeronave) {
        Aeronave.modeloAeronave = modeloAeronave;
    }

    public static String[] getRegistroAeronave() {
        return registroAeronave;
    }

    public static void setRegistroAeronave(String[] registroAeronave) {
        Aeronave.registroAeronave = registroAeronave;
    }

    public static int[] getCapacidadeAeronave() {
        return capacidadeAeronave;
    }

    public static void setCapacidadeAeronave(int[] capacidadeAeronave) {
        Aeronave.capacidadeAeronave = capacidadeAeronave;
    }
}
