package departamento;

import java.util.Scanner;




public class Main
{
    public static void main (String[] args)
    {
        int opcao;
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("----------------------------------------------\n");
            System.out.println("|Sistema para Criar Empresas - AULA RAFAEL");
            System.out.println("|1 - Criar Empresa");
            System.out.println("|2 - Adicionar Funcionarios a Empresa");
            System.out.println("|3 - Adicionar Departamento a Empresa");
            System.out.println("|4 - Dar aumento salarial para departamento a Empresa");
            System.out.println("|5 - Listar Empresas");
            System.out.println("|6 - Adicionar Departamento");
            System.out.println("|7 - Sair");
            System.out.println("----------------------------------------------\n");
            opcao = sc.nextInt();

            switch(opcao)
            {
                case 1:
                    sc.nextLine();
                    if(Empresa.qtdEmpresa >= 6)
                        System.out.println("Maximo de Empresas Cadastradas!!");
                    else
                    {
                        System.out.println("Por favor Digite o nome da Empresa: ");
                        Empresa.setNomeEmpresa(sc.nextLine());

                        System.out.println("Digite o CNPJ da Empresa: ");
                        Empresa.setCnpjEmpresa(sc.nextLine());

                        System.out.println("Empresa Cadastrada com Sucesso!");
                        Empresa.qtdEmpresa++;

                    }
                    break;
                    case 2:
                        sc.nextLine();
                        if(Empresa.qtdEmpresa == 0)
                        {
                            System.out.println("Não possui empresas cadastradas!");
                        }
                        else
                        {
                            System.out.println("Por favor Digite o Id da Empresa\n");
                            Empresa.idEmpresa = sc.nextInt();

                            if(Empresa.idEmpresa > 0)
                            {
                                sc.nextLine();
                                System.out.println("Por favor Digite o nome do funcionario\n");
                                Funcionario.setNomeFuncionario(sc.nextLine());

                                System.out.println("Digite o Salario do Funcionario:\n");
                                Funcionario.setSalarioFuncionario(sc.nextDouble());

                                System.out.println("Funcionario Cadastrado com Sucesso!");
                            }
                        }
                        break;
                        case 3:
                            if(Empresa.qtdEmpresa == 0)
                            {
                                System.out.println("Não existem empresas cadastradas");
                            }
                                else if (Empresa.qtdDepartamento < Empresa.MAX_DEPARTAMENTOS) {
                                    System.out.println("Digite o nome do Departamento que deseja criar:\n");
                                    Departamento.setNomeDepartamento(sc.nextLine());

                                    System.out.println("Departamento Criado com sucesso!\n");
                                    Empresa.qtdDepartamento++;
                                }
                                else
                                {
                                    System.out.println("Maximo de Departamento por empresa criado!");
                                }
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
