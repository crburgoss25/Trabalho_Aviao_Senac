package departamento;

public class Departamento
{
    public static int MAX_DEPARTAMENTOS = 5;
    public static int MAX_FUNCIONARIO = 3;
    public static int[] qtdFuncionario = new int[MAX_FUNCIONARIO];
    public static String nomeDepartamento;



    public Departamento(String nomeDepartamento, int[] qtdFuncionario)
    {
        this.nomeDepartamento = nomeDepartamento;
        this.qtdFuncionario = qtdFuncionario;
    }

    public static int[] getQtdFuncionario()
    {
        return qtdFuncionario;
    }

    public static void setQtdFuncionario(int[] qtdFuncionario)
    {
        Departamento.qtdFuncionario = qtdFuncionario;
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
