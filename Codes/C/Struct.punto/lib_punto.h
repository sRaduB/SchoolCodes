#ifndef PUNTO_H
#define PUNTO_H

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define DIM 10

typedef struct {
    char *pName;
    float x, y, z;
}punto_t;

void copyPunto(punto_t *pDst, punto_t pSrc) {
    pDst->x = pSrc.x;
    pDst->y = pSrc.y;
    pDst->z = pSrc.z;
}

void stampaPunto(punto_t p) {
    printf("%s: (%.2f; %.2f; %.2f)\n", p.pName, p.x, p.y, p.z);
}

void scanPunto(punto_t *p) {
    char str[DIM];
    gets(str);
    p->pName = malloc(strlen(str) + 1); // Il malloc è necessario per salvare una zona di memoria dedicata al puntatore per non intaccare altro
    strncpy(p->pName, str, DIM);        // senza il malloc la variabile viene salvata nello stack in maniera dinamica
    scanf("%f", &p->x);                 // con il malloc vine salvata nell'"heap" e viene dichiarata in maniera statica
    scanf("%f", &p->y);
    scanf("%f", &p->z);
}

#endif // PUNTO_H