#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

void pa() {
    printf("Progresão Aritimetica\n");
    printf("Digite os 2 primeiros numeros entre espaço: ");

    int num1, num2;
    scanf("%d %d", &num1, &num2);

    int r = num2 - num1;

    printf("Quantos termos vc deseja: ");
    int n;
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {

        int form = num1 + i * r;

        printf("%d° Termos:%d\n", i + 1, form);
    }

    printf("\n");
    printf("Razão: %d\n", r);
}

void pg() {
    printf("Progresão Geometrica\n");
    printf("Digite os 2 primeiros numeros entre espaço: ");

    int num1, num2;
    scanf("%d %d", &num1, &num2);

    float r = (float)num2 / num1;

    printf("Quantos termos vc deseja: ");
    int n;
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {

        float form = num1 * pow(r, i);

        printf("%d° Termos:%f\n", i + 1, form);
    }

    printf("\n");
    printf("Razão: %f\n", r);
}

void mf() {
    printf("Multiplicão Fatorial\n");
    printf("Digite um número inteiro positivo para calcular o fatorial: ");

    int n;
    scanf("%d", &n);

    if (n < 0) {
        printf("Fatorial não é definido para números negativos.\n");
    }
    else if (n == 0) {
        printf("O fatorial de 0 é 1.\n");
    }
    else {

        int resultado = 1;

        printf("\nCálculo: ");

        for (int i = n; i > 0; i--) {

            resultado *= i;

            printf("%d", i);

            if (i > 1) {
                printf(" * ");
            }
        }

        printf("\nResultado de %d! é: %d\n", n, resultado);
    }
}

void sobre() {
    printf("Criado por Edcley em 20 minutos\n");
    printf("Para ponto extra e aula de Math\n");
}

int main() {

    printf("BEM VINDO AO SEU SISTEMA MATH\n");

    printf("Escolhas as funçoes desejadas: \n");
    printf("1. PA - Progresão Aritemetica\n");
    printf("2. PG - Progresão Geometrica\n");
    printf("3. CMP - Principio Multipicativo da Contagem\n");
    printf("3. MF - Multiplicão Fatorial\n");
    printf("4. Sobre\n");

    printf("Qual vc escolheu? ");

    int escmain;
    scanf("%d", &escmain);

    if (escmain == 1) {
        pa();
    }
    else if (escmain == 2) {
        pg();
    }
    else if (escmain == 3) {
        mf();
    }
    else if (escmain == 4) {
        sobre();
    }

    return 0;
}
