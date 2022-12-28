
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Simone
 */
public class quadrinhos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Revista> revista = new ArrayList();

        Colecao colecao = new Colecao();

        ArrayList<Caixa> caixa = new ArrayList();

        Caixa caixa1 = new Caixa(123, "Ab123", "Branca");
        Caixa caixa2 = new Caixa(134, "ab134", "Verde");

        List<Amigo> amigo = new ArrayList();

        ArrayList<Emprestimo> emprestimo = new ArrayList();

        int i = 3;
        int j = 2;
        int o = 0;
        int corCaixa = 0;
        int contavetor = 0;
        boolean amigoPresente = false;
        boolean emprestimoPresente = false;
        boolean revistaPresente = false;

        caixa.add(caixa1);
        caixa.add(caixa2);

        revista.add(new Revista("cebolinha", "2", "1994", caixa1));
        revista.add(new Revista("pato donald", "3", "1997", caixa1));
        revista.add(new Revista("mulher maravilha", "5", "1999", caixa1));

        colecao.addColecao(revista.get(0));
        colecao.addColecao(revista.get(1));
        colecao.addColecao(revista.get(2));

        int escolhe = 10;

        while (escolhe != 0) {

            System.out.println("                MENU   ");
            System.out.println("Adicionar Coleção-----------------digite 1");
            System.out.println("Emprestar Revista-----------------digite 2");
            System.out.println("Mostrar coleções de Revista-------digite 3");
            System.out.println("Mostrar Empréstimos de Revistas---digite 4");
            System.out.println("sair do programa------------------digite 0");

            Scanner tec = new Scanner(System.in);
            escolhe = tec.nextInt();

            switch (escolhe) {

                case 1:

                    System.out.println("digite o Nome da Revista");
                    Scanner nrevista = new Scanner(System.in);
                    String n = nrevista.nextLine();
                    System.out.println("digite o Numero da edicão");
                    Scanner nedicao = new Scanner(System.in);
                    String e = nedicao.nextLine();
                    System.out.println("digite o Numero do ano");
                    Scanner aano = new Scanner(System.in);
                    String a = aano.nextLine();
                    System.out.println("Precisa-se de nova caixa?   sim/nao");
                    Scanner leia = new Scanner(System.in);
                    String le = leia.nextLine();
                    if ("sim".equals(le)) {

                        System.out.println("digite o numero da caixa");
                        Scanner wnumero = new Scanner(System.in);
                        int numero = wnumero.nextInt();

                        System.out.println("digite o id  da etiqueta");
                        Scanner wetiqueta = new Scanner(System.in);
                        String etiqueta = wetiqueta.nextLine();

                        System.out.println("digite a cor");
                        Scanner wcor = new Scanner(System.in);
                        String cor = wcor.nextLine();
                        caixa.add(new Caixa(numero, etiqueta, cor));
                        revista.add(new Revista(n, e, a, caixa.get(j)));
                        j++;
                           colecao.addColecao(revista.get(i));
                    System.out.println(revista.get(i) + " Adicionada");
                    i++;

                    } else {
                        System.out.println("escolha a caixa para guardar a colecão");
                        for (int cv = 0; cv < caixa.size(); cv++) {
                            System.out.println(caixa.get(cv).getCor());
                        }
                        Scanner sescolheCor = new Scanner(System.in);
                        String escolheCor = sescolheCor.nextLine();
                        for (int c = 0; c < caixa.size(); c++) {

                            if (escolheCor.equals(caixa.get(c).getCor())) {
                                corCaixa = c;
                            }
                        }
                        if(escolheCor.equals(caixa.get(corCaixa).getCor())){
                         revista.add(new Revista(n, e, a, caixa.get(corCaixa)));
                        corCaixa = 0;
                        colecao.addColecao(revista.get(i));
                    System.out.println(revista.get(i) + " Adicionada");
                    i++;
                    }else{System.out.println("Deu errado,verifique se digitou corretamente a cor da caixa");}}

                    

                    break;

                case 2:

                    System.out.println(" digite o Nome do Amigo");
                    Scanner y = new Scanner(System.in);
                    String nome = y.nextLine();

                    System.out.println(" digite o Telefone");
                    Scanner ç = new Scanner(System.in);
                    String tel = ç.nextLine();

                    System.out.println(" digite o Local de trabalho");
                    Scanner m = new Scanner(System.in);
                    String loc = m.nextLine();

                    if (amigo.isEmpty()) {
                        System.out.println("Digite o nome da revista\r\n");
                        for (int cont = 0; cont < revista.size(); cont++) {
                            System.out.println(revista.get(cont).getNomeRevista());
                        }
                        Scanner ds = new Scanner(System.in);
                        String nrev = ds.nextLine();
                        System.out.println("Digite a data do Empréstimo");
                        Scanner gg = new Scanner(System.in);
                        String dempres = gg.nextLine();
                        System.out.println("Digite a data da devolução");
                        Scanner ff = new Scanner(System.in);
                        String ddevol = ff.nextLine();

                        for (int w = 0; w < revista.size(); w++) {

                            if (revista.get(w).getNomeRevista().contentEquals(nrev)) {
                                contavetor = w;
                                revistaPresente = true;
                            }
                        }

                        if (revistaPresente == true) {
                            amigo.add(new Amigo(nome, tel, loc));
                            emprestimo.add(new Emprestimo(amigo.get(o), dempres, ddevol, revista.get(contavetor)));
                            System.out.println(emprestimo.get(o) + "\r\n");
                            o++;
                            contavetor = 0;
                            revistaPresente = false;
                            amigoPresente = false;
                        } else {
                            System.out.println("Deu errado, verifique o nome da revista");
                        }
                    } else {
                        for (int x = 0; x < amigo.size(); x++) {
                            if (amigo.get(x).getNomeAmigo().contentEquals(nome)) {
                                amigoPresente = true;
                            }
                        }

                        if (amigoPresente == false) {

                            System.out.println("Digite o nome da revista\r\n");
                            for (int cont = 0; cont < revista.size(); cont++) {
                                System.out.println(revista.get(cont).getNomeRevista());
                            }
                            Scanner ds = new Scanner(System.in);

                            String nrev = ds.nextLine();
                            System.out.println("Digite a data do Empréstimo");
                            Scanner gg = new Scanner(System.in);
                            String dempres = gg.nextLine();
                            System.out.println("Digite a data da devolucao");
                            Scanner ff = new Scanner(System.in);
                            String ddevol = ff.nextLine();

                            for (int z = 0; z < emprestimo.size(); z++) {
                                if (emprestimo.get(z).revista.getNomeRevista().contentEquals(nrev)) {

                                    emprestimoPresente = true;
                                }
                            }

                            for (int w = 0; w < revista.size(); w++) {
                                if (revista.get(w).getNomeRevista().contentEquals(nrev)) {
                                    contavetor = w;
                                    revistaPresente = true;
                                }
                            }

                            if (emprestimoPresente == true) {

                                System.out.println("Deu errado, verifique empréstimos de revista");
                                contavetor = 0;
                                revistaPresente = false;
                                amigoPresente = false;
                                emprestimoPresente = false;

                            } else if (revistaPresente == true) {
                                amigo.add(new Amigo(nome, tel, loc));
                                emprestimo.add(new Emprestimo(amigo.get(o), dempres, ddevol, revista.get(contavetor)));
                                System.out.println(emprestimo.get(o) + "\r\n");

                                contavetor = 0;
                                o++;

                                revistaPresente = false;
                                amigoPresente = false;
                                emprestimoPresente = false;

                            } else {
                                System.out.println("Deu errado, verifique o nome da revista");
                                revistaPresente = false;
                                amigoPresente = false;
                                emprestimoPresente = false;
                                contavetor = 0;
                            }
                        } else {
                            System.out.println("Impossível Emprestar, já possui uma revista");
                            for (int s = 0; s < amigo.size(); s++) {
                                if (emprestimo.get(s).amigo.getNomeAmigo().contentEquals(nome)) {
                                    System.out.println(amigo.get(s) + " possui a revista: " + emprestimo.get(s).revista.getNomeRevista());
                                }

                            }
                            amigoPresente = false;
                            revistaPresente = false;
                            emprestimoPresente = false;
                            contavetor = 0;
                        }
                    }

                    break;

                case 3:

                    colecao.imprimir();

                    break;

                case 4:
                    if (o == 0) {
                        System.out.println("Não há Empréstimos");
                    } else {

                        for (int fd = 0; fd < emprestimo.size(); fd++) {

                            System.out.println(emprestimo.get(fd));
                        }
                    }

                    break;
            }
        }
    }
}
