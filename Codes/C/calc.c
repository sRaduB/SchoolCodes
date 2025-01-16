#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, char *argv[]){
    int op1 = atoi(argv[1]);
    int op2 = atoi(argv[3]);
    char op = argv[2][0];
    int out;

    switch (op) {
        case '+':
            out = op1 + op2;
            break;

        case '-':
            out = op1 - op2;
            break;

        case '*':
            out = op1 * op2;
            break;

        case '/':
            if (op2 == 0) {
                printf("Errore: divisione per zero\n");
                return 0;
            }
            out = op1 / op2;
            break;

        case '^':
            out = pow(op1, op2);
            break;
            
        default:
            printf("Operatore non supportato");
            return 0;
    }

    printf("= %d", out);
    return 0;
}


//cd desktop/PROGRAMMI/sistemi/2024-10-9 calcolatrice