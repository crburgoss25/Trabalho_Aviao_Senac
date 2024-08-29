package departamento;

public class Empresa
{
    static String nomeEmpresa;
    static String cnpjEmpresa;
    public static int idEmpresa = 0;
    public static int qtdDepartamento[] = new int[Departamento.MAX_DEPARTAMENTOS];


    public Empresa(String nomeEmpresa, String cnpjEmpresa)
    {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public static String getNomeEmpresa()
    {
        return nomeEmpresa;
    }

    public static void setNomeEmpresa(String nomeEmpresa)
    {
        Empresa.nomeEmpresa = nomeEmpresa;
    }

    public static String getCnpjEmpresa()
    {
        return cnpjEmpresa;
    }

    public static void setCnpjEmpresa(String cnpjEmpresa)
    {
        Empresa.cnpjEmpresa = cnpjEmpresa;
    }

    public static int[] getQtdDepartamento()
    {
        return qtdDepartamento;
    }

    public static void setQtdDepartamento(int[] qtdDepartamento)
    {
        Empresa.qtdDepartamento = qtdDepartamento;
    }
}