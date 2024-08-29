package departamento;

import java.util.Date;

public class Funcionario
{
    public static String nomeFuncionario;
    public static double salarioFuncionario;
    public static Date dataAdmissao;

    public static String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public static void setNomeFuncionario(String nomeFuncionario) {
        Funcionario.nomeFuncionario = nomeFuncionario;
    }

    public static double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public static void setSalarioFuncionario(double salarioFuncionario) {
        Funcionario.salarioFuncionario = salarioFuncionario;
    }

    public static Date getDataAdmissao() {
        return dataAdmissao;
    }

    public static void setDataAdmissao(Date dataAdmissao) {
        Funcionario.dataAdmissao = dataAdmissao;
    }
}
