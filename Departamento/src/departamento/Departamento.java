package departamento;

public class Departamento
{
    public static String nomeDepartamento;

    public Departamento(String nomeDepartamento)
    {
        this.nomeDepartamento = nomeDepartamento;
    }


    public static String getNomeDepartamento()
    {
        return nomeDepartamento;
    }

    public static void setNomeDepartamento(String nomeDepartamento)
    {
        Departamento.nomeDepartamento = nomeDepartamento;
    }
}
