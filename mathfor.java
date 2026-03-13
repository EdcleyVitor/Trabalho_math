import java.util.*;

public class SistemaMath {

    static Scanner input = new Scanner(System.in);

    public static void pa() {
        System.out.println("Progresão Aritimetica");
        System.out.print("Digite os 2 primeiros numeros entre espaço: ");
        String termos = input.nextLine();
        String[] numeros = termos.split(" ");
        int num1 = Integer.parseInt(numeros[0]);
        int num2 = Integer.parseInt(numeros[1]);

        int r = num2 - num1;
        System.out.print("Quantos termos vc deseja: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {

            int form = num1 + i * r;

            System.out.println((i + 1) + "° Termos:" + form);
        }
        System.out.println();
        System.out.println("Razão: " + r);
    }

    public static void pg() {
        System.out.println("Progresão Geometrica");
        System.out.print("Digite os 2 primeiros numeros entre espaço: ");
        String termos = input.nextLine();
        String[] numeros = termos.split(" ");
        int num1 = Integer.parseInt(numeros[0]);
        int num2 = Integer.parseInt(numeros[1]);

        double r = (double) num2 / num1;

        System.out.print("Quantos termos vc deseja: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {

            double form = num1 * Math.pow(r, i);

            System.out.println((i + 1) + "° Termos:" + form);
        }
        System.out.println();
        System.out.println("Razão: " + r);
    }

    public static void cmp() {
        HashMap<String, Double> classes = new HashMap<>();

        while (true) {
            System.out.print("\n[1]Add [2]Mostrar [3]Del [S]Sair: ");
            String opt = input.nextLine().toUpperCase();

            if (opt.equals("1")) {
                System.out.print("Nome: ");
                String n = input.nextLine();
                System.out.print("Valor para " + n + ": ");
                classes.put(n, Double.parseDouble(input.nextLine()));

            } else if (opt.equals("2")) {

                if (classes.isEmpty()) {
                    System.out.println("Lista vazia.");
                    continue;
                }

                double total = 1;
                System.out.println("\n--- Lista de Classes ---");

                for (String k : classes.keySet()) {
                    double v = classes.get(k);
                    total *= v;
                    System.out.println("• " + k + ": " + v);
                }

                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                System.out.println("Resultado: " + total);

            } else if (opt.equals("3")) {

                System.out.print("Nome para deletar: ");
                String n = input.nextLine();

                if (classes.remove(n) != null) {
                    System.out.println("'" + n + "' removido com sucesso.");
                } else {
                    System.out.println("Erro: Nome não encontrado.");
                }

            } else if (opt.equals("S")) {
                break;
            } else {
                System.out.println("Opção Inválida.");
            }
        }
    }

    public static void mf() {
        System.out.println("Multiplicão Fatorial");
        System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
        int n = Integer.parseInt(input.nextLine());

        if (n < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else if (n == 0) {
            System.out.println("O fatorial de 0 é 1.");
        } else {
            int resultado = 1;
            ArrayList<String> calculo = new ArrayList<>();

            for (int i = n; i > 0; i--) {
                resultado *= i;
                calculo.add(String.valueOf(i));
            }

            String string_calculo = String.join(" * ", calculo);

            System.out.println("\nCálculo: " + string_calculo);
            System.out.println("Resultado de " + n + "! é: " + resultado);
        }
    }

    public static void sobre() {
        System.out.println("Criado por Edcley em 20 minutos");
        System.out.println("Para ponto extra e aula de Math");
    }

    public static void main(String[] args) {

        System.out.println("BEM VINDO AO SEU SISTEMA MATH");

        System.out.println("Escolhas as funçoes desejadas: ");
        System.out.println("1. PA - Progresão Aritemetica");
        System.out.println("2. PG - Progresão Geometrica");
        System.out.println("3. CMP - Principio Multipicativo da Contagem");
        System.out.println("3. MF - Multiplicão Fatorial");
        System.out.println("4. Sobre");

        System.out.print("Qual vc escolheu? ");
        int escmain = Integer.parseInt(input.nextLine());

        if (escmain == 1) {
            pa();
        } else if (escmain == 2) {
            pg();
        } else if (escmain == 3) {
            cmp();
        } else if (escmain == 4) {
            mf();
        }
    }
}
