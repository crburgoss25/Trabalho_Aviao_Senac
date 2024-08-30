package departamento;

import java.util.Date;

public class Empresa
{
    public static int MAX_DEPARTAMENTOS = 5;
    static String nomeEmpresa;
    static String cnpjEmpresa;
    public static int idEmpresa = 0;
    public static int qtdDepartamento;
    public static int  qtdEmpresa = 0;
    public static int MAX_FUNCIONARIO = 3;
    public static int[] qtdFuncionario = new int[MAX_FUNCIONARIO];


    public Empresa(String nomeEmpresa, String cnpjEmpresa, int idEmpresa, int qtdDepartamento, int qtdEmpresa)
    {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
        this.idEmpresa = idEmpresa;
        this.qtdDepartamento = qtdDepartamento;
        this.qtdEmpresa = qtdEmpresa;
    }


    public static int[] getQtdFuncionario()
    {
        return qtdFuncionario;
    }

    public static void setQtdFuncionario(int[] qtdFuncionario)
    {
        Empresa.qtdFuncionario = qtdFuncionario;
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

    /*public static int[] getQtdDepartamento()
    {
        return qtdDepartamento;
    }

    public static void setQtdDepartamento(int[] qtdDepartamento)
    {
        Empresa.qtdDepartamento = qtdDepartamento;
    }*/
}