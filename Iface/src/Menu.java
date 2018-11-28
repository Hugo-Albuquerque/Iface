import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        int opc, cont = 0, indice = 0, inicio = 0, opcaoS = 0, deletado = 1, aux = 0;
        int login = 0, senha = 0, idade = 0;
        String nome = null, vida = null, cidade = null, resposta = null, nomeA = null, descricao = null, genero = null, mensagem = null, amigo = null;

        Scanner input = new Scanner(System.in);

        ArrayList logins = new ArrayList();
        ArrayList senhas = new ArrayList();
        ArrayList nomes = new ArrayList();
        ArrayList idades = new ArrayList();
        ArrayList generos = new ArrayList();
        ArrayList cidades = new ArrayList();
        ArrayList vidas = new ArrayList();
        ArrayList amigos = new ArrayList();
        ArrayList amigosT = new ArrayList();
        ArrayList nomesC = new ArrayList();
        ArrayList descricoes = new ArrayList();
        ArrayList membros = new ArrayList();
        ArrayList mensagens = new ArrayList();

        do {
            while(inicio == 0) {
                System.out.println("*********************");
                System.out.println(" Bem-Vindo ao Iface! ");
                System.out.println("*********************");
                System.out.println("1 - Criar conta");
                System.out.println("2 - Fazer login");
                System.out.println("0 - Sair do Iface");
                System.out.println("O que deseja fazer?");
                opc = input.nextInt();

                switch (opc) {

                    case 1: {

                        do {
                            System.out.println("Login:");
                            login = input.nextInt();
                            if (logins.contains(login)) {
                                System.out.println("Login já existe!");
                            }
                        }while (logins.contains(login)) ;
                        System.out.println("Senha:");
                        senha = input.nextInt();
                        input.nextLine();
                        System.out.println("Nome:");
                        nome = input.nextLine();

                        logins.add(login);
                        senhas.add(senha);
                        nomes.add(nome);

                        System.out.println("CONTA CRIADA COM SUCESSO!");
                        System.out.println();

                        cont++;
                        break;

                    }

                    case 2: {

                            if(aux == 0) {

                                    System.out.println("Login:");
                                    login = input.nextInt();

                                    indice = logins.indexOf(login);

                                do {
                                    System.out.println("Senha:");
                                    senha = input.nextInt();
                                    if (!senhas.get(indice).equals(senha)) {
                                        System.out.println("Senha incorreta");
                                    }
                                }while(!senhas.get(indice).equals(senha));
                            }
                        inicio++;
                        deletado = 1;
                        break;
                    }
                    case 0: {
                        return;
                    }
                }
            }

            do {
                if(deletado == 1) {
                    System.out.print("   Bem-Vindo ");
                    System.out.println(nomes.get(indice));

                    System.out.println("1 - Criar/editar perfil");
                    System.out.println("2 - Adicionar amigo");
                    System.out.println("3 - Enviar mensagem");
                    System.out.println("4 - Criar comunidade");
                    System.out.println("5 - Adicionar membro na comunidade");
                    System.out.println("6 - Informações de outro perfil");
                    System.out.println("7 - Deletar conta");
                    System.out.println("0 - Sair da conta");
                    System.out.println("");
                    System.out.println("O que deseja fazer?");

                    opc = input.nextInt();

                    switch (opc) {

                        case 1: {

                            do {
                                System.out.println("O que deseja criar/editar no perfil?");
                                System.out.println("1 - Idade");
                                System.out.println("2 - Gênero");
                                System.out.println("3 - Cidade atual");
                                System.out.println("4 - O que faz da vida");
                                System.out.println("5 - Mudar nome");
                                System.out.println("5 - Mudar senha");
                                System.out.println("0 - Voltar para o menu");

                                opc = input.nextInt();

                                switch (opc) {

                                    case 1: {
                                        System.out.println("Digite sua idade: ");
                                        idade = input.nextInt();
                                        idades.add(indice, idade);
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Digite o seu gênero ");
                                        input.nextLine();
                                        genero = input.nextLine();
                                        generos.add(indice, genero);
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("Digite sua cidade: ");
                                        input.nextLine();
                                        cidade = input.nextLine();
                                        cidades.add(indice, cidade);
                                        break;
                                    }
                                    case 4: {
                                        System.out.println("Digite o que faz da vida(Trabalha, estuda, ...): ");
                                        input.nextLine();
                                        vida = input.nextLine();
                                        vidas.add(indice, vida);
                                        break;
                                    }
                                    case 5: {
                                        System.out.println("Digite seu nome");
                                        input.nextLine();
                                        nome = input.nextLine();
                                        nomes.add(indice, nome);
                                    }
                                    case 6: {
                                        System.out.println("Digite a nova senha");
                                        senha = input.nextInt();
                                        senhas.add(indice, senha);
                                    }
                                }
                            } while (opc != 0);
                            break;
                        }

                        case 2: {
                            //Não consegui
                            System.out.println("Não implementado");
                            break;
                        }
                        case 3: {
                            //Não consegui
                            System.out.println("Não implementado");
                            break;

                        }
                        case 4: {
                            System.out.println("Digite o nome da comunidade");
                            input.nextLine();
                            nomeA = input.nextLine();
                            nomesC.add(indice, nomeA);

                            System.out.println("Dê uma descrição para sua comunidade");
                            descricao = input.nextLine();
                            descricoes.add(indice, descricao);
                            break;

                        }
                        case 5: {
                            // Não consegui
                            System.out.println("Não implementado");
                            break;

                        }

                        case 6: {

                            System.out.println("Informações do seu perfil");
                            System.out.println();

                            System.out.print("Idade: " );
                            if(idades.contains(idade)) {
                                System.out.println(idades.get(indice));
                            }else {
                                System.out.println("Idade não informada");
                            }
                            System.out.print("Gênero: ");
                            if(generos.contains(genero)) {
                                System.out.println(generos.get(indice));
                            }else {
                                System.out.println("Gênero não informada");
                            }
                            System.out.print("Cidade atual: ");
                            if(cidades.contains(cidade)) {
                                System.out.println(cidades.get(indice));
                            }else {
                                System.out.println("Cidade não informada");
                            }
                            System.out.print("O que faz da vida: ");
                            if(vidas.contains(vida)) {
                                System.out.println(vidas.get(indice));
                            }else {
                                System.out.println("Não informado");
                            }

                           System.out.print("Comunidades: ");
                            if(nomesC.contains(nomeA)) {
                                System.out.println(nomesC.get(indice));
                            }else {
                                System.out.println("Não está participando de nenhuma comunidade");

                            }

                            System.out.print("Amigos: ");
                            if(amigos.contains(amigo)) {
                                System.out.println(amigos.get(indice));
                            }else {
                                System.out.println("Nenhum");
                            }

                            System.out.print("Mensagens: ");
                            if(mensagens.contains(mensagem)) {
                                System.out.println(mensagens.get(indice));
                            }else {
                                System.out.println("Nenhuma");
                            }

                            System.out.println();
                            break;

                        }
                        case 7: {

                            System.out.println();
                            System.out.println("1 - Deletar conta");
                            System.out.println("0 - Voltar ao menu");
                            System.out.println("O que deseja fazer?");

                            opcaoS = input.nextInt();

                            if (opcaoS == 1) {

                                do {
                                    System.out.println("Deseja mesmo deletar sua conta? Responda S ou N");
                                    input.nextLine();
                                    resposta = input.next();
                                    if (resposta.equalsIgnoreCase("S")) {

                                        logins.remove(indice);
                                        senhas.remove(indice);
                                        nomes.remove(indice);
                                        cont--;
                                        System.out.println("CONTA DELETADA COM SUCESSO!");
                                        deletado = 0;
                                        System.out.println("");
                                    } else if(resposta.equalsIgnoreCase("N")) {
                                        deletado = 1;
                                    } else {
                                        System.out.println("Opção Inválida");
                                    }
                                } while (!resposta.equalsIgnoreCase("N") && !resposta.equalsIgnoreCase("S"));
                            } else if (opcaoS == 0) {
                                opc = 1;
                            }
                            break;

                        }
                        case 0: {
                            System.out.println("1 - Sair da conta");
                            System.out.println("2 - Sair do Iface");
                            System.out.println("0 - Voltar ao menu");
                            System.out.println("O que deseja fazer?");
                            opcaoS = input.nextInt();

                            if (opcaoS == 1) {
                                inicio = 0;
                            }
                            if (opcaoS == 0) {
                                opc = 1;
                            }
                            break;
                        }
                    }

                } else {
                    opc = 0;
                    opcaoS = 1;
                    inicio = 0;
                }
            } while (opc != 0 && opcaoS != 2);

            if(opcaoS == 2)
            {
                opc = 3;
            }
        }while(opc != 3);
    }
}