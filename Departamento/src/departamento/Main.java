package departamento;

import java.util.Scanner;




public class Main
{
    public static void main (String[] args)
    {
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------\n");
        System.out.println("|Sistema para Criar Empresas - AULA RAFAEL");
        System.out.println("|Digite a opcao desejada");
        System.out.println("|1 - Criar Empresa");
        System.out.println("|2 - Adicionar Funcionarios a Empresa");
        System.out.println("|3 - Adicionar Departamento a Empresa");
        System.out.println("|4 - Dar aumento salarial para departamento a Empresa");
        System.out.println("|5 - Consultar informacoes de uma Empresa ");
        System.out.println("|6 - Adicionar Departamento");
        System.out.println("|7 - Sair");
        System.out.println("----------------------------------------------\n");
        opcao = sc.nextInt();

        do
        {
            switch(opcao)
            {
                case 1:
                    sc.nextLine();
                    System.out.println("Por favor Digite o nome da Empresa: ");
                    Empresa.setNomeEmpresa(sc.nextLine());

                    System.out.println("Digite o CNPJ da Empresa: ");
                    Empresa.setCnpjEmpresa(sc.nextLine());
                    break;

                    case 2:
                        break;
                        case 3:
                            break;
                            case 4:
                                break;
                                case 5:
                                    break;
                                    case 6:
                                        break;
                                         case 7:
                                            break;
            }

        }
        while(opcao != 7);
    }
}
