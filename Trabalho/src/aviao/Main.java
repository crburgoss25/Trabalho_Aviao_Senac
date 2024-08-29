package aviao;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Aeronave aviao = new Aeronave();
        Scanner sc = new Scanner(System.in);
        int qtd;
        int opcao;
        boolean find = false;

        do
        {
            System.out.println("***********************************");
            System.out.println("Escolha uma opção no menu:");
            System.out.println("1 - Cadastrar Aeronave");
            System.out.println("2 - Excluir Aeronave");
            System.out.println("3 - Visualizar Aeronaves");
            System.out.println("4 - Buscar Aeronave");
            System.out.println("5 - Sair");
            System.out.println("***********************************");
            opcao = sc.nextInt();

            switch (opcao)
            {
                case 1:
                    if (aviao.contadorAeronave < aviao.MAX_AERONAVES) // CAPACIDADE 5 AERONAVES
                    {
                        sc.nextLine();
                        System.out.println("***********************************");
                        System.out.println("Informe o Modelo da Aeronave:");
                        aviao.modeloAeronave[aviao.contadorAeronave] = sc.nextLine();

                        System.out.println("***********************************");
                        System.out.println("Informe o Registro da Aeronave:");
                        aviao.registroAeronave[aviao.contadorAeronave] = sc.nextLine();


                        System.out.println("***********************************");
                        System.out.println("Informe a Capacidade da Aeronave:");
                        aviao.capacidadeAeronave[aviao.contadorAeronave] = sc.nextInt();

                        aviao.contadorAeronave++;
                        System.out.println("Aeronave Cadastrada com sucesso!");
                    } else {
                        System.out.println("Capacidade maxima de aeronaves atingidas");// SE ATINGER, ENVIA A MENSAGEM
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("***********************************");
                    System.out.println("Informe o Registro da Aeronave que deseja remover:");
                    String registroRemover = sc.nextLine();  //

                    boolean encontrado = false;
                    for (int i = 0; i < aviao.contadorAeronave; i++)
                    {
                        if (aviao.registroAeronave[i].equals(registroRemover))
                        {
                            for (int j = i; j < aviao.contadorAeronave - 1; j++)
                            {
                                aviao.modeloAeronave[j] = aviao.modeloAeronave[j + 1];
                                aviao.registroAeronave[j] = aviao.registroAeronave[j + 1];
                                aviao.capacidadeAeronave[j] = aviao.capacidadeAeronave[j + 1];
                            }
                            aviao.contadorAeronave--;  // Reduz o contador de aeronaves
                            encontrado = true;  // Marca que a aeronave foi encontrada
                            System.out.println("Aeronave removida com sucesso!");
                            break;
                        }
                    }
                    if (!encontrado)
                    {
                        System.out.println("Aeronave com registro " + registroRemover + " não encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("***********************************");
                    System.out.println("Lista de Aeronaves Cadastradas:");
                    if (aviao.contadorAeronave == 0)
                    {
                        System.out.println("Não possui aeronaves registradas");
                    }
                    else
                    {
                        for (int i = 0; i < aviao.contadorAeronave; i++)
                        {
                            System.out.println("Aeronave " + (i + 1) + ":");
                            System.out.println("Modelo: " + aviao.modeloAeronave[i]);
                            System.out.println("Registro: " + aviao.registroAeronave[i]);
                            System.out.println("Capacidade: " + aviao.capacidadeAeronave[i]);
                            System.out.println("***********************************");
                        }
                    }
                    break;
                case 4:
                    if (aviao.contadorAeronave == 0)
                    {
                        System.out.println("Não possui aeronaves registradas");
                    }
                    else
                    {
                        sc.nextLine();
                        System.out.println("Digite o Numero do registro da aeronave Que deseja buscar:\n");
                        String verRegistro = sc.nextLine();

                            for (int i = 0; i < aviao.contadorAeronave; i++)
                            {
                                if (aviao.registroAeronave[i].equalsIgnoreCase(verRegistro))
                                {
                                    find = true;
                                    System.out.println("Aeronave encontrada:");
                                    System.out.println("Modelo: " + aviao.modeloAeronave[i]);
                                    System.out.println("Registro: " + aviao.registroAeronave[i]);
                                    System.out.println("Capacidade: " + aviao.capacidadeAeronave[i]);
                                    break;
                                }
                            }
                        if (!find)
                        {
                            System.out.println("Aeronave com registro " + verRegistro + " não encontrada.");
                            break;
                        }
                    }
                    break;
                    }
            }
        while(opcao!= 5);
        }
    }