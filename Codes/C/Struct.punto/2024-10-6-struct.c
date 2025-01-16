#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "lib_punto.h"

int main(void) {
	//Dichiarazione e inizializzazione	
	punto_t p1 = {"P1", 1., 2.3, -5.1};
    //Dichiarazione e assegnazione a posteriori
	punto_t p2;
    p2.pName = "P2";
	p2.x = 2.;
	p2.y = 3.;
	p2.z = 5.2;
	//Falsa copia di p1: perchè?
	punto_t p3;
	p3 = p1; //???
 	//dichiara, leggi e stampa p4
	punto_t p4;
    puts("inserire nome e coordinate del punto: ");
    scanPunto(&p4);
	stampaPunto(p4);
  	//stampare p1,p2,p3
    stampaPunto(p1);
    stampaPunto(p2);
    stampaPunto(p3);
	//modificare p3
    p3.pName = "P3";
    p3.x = 4.5;
    p3.y = 1.1;
    p3.z = 3.2;
	//stampare p1,p3
    printf("\n");
    stampaPunto(p1);
    stampaPunto(p3);
	//Fai in modo che p3 abbia le stesse coordinate di p1
    copyPunto(&p3, p1);
    printf("\n");
    stampaPunto(p1);
    stampaPunto(p3);
	//Stampare e verificare i puntatori:
	//	- A quali indirizzi sono allocati i 4 punti? Quanto distano?
    printf("\np1 --> %p", &p1);		//distano 16 perchè la struct è composta da 3 float(4*3) e 2 char(2*2)
	printf("\np2 --> %p", &p2);
	printf("\np3 --> %p", &p3);
	printf("\np4 --> %p\n", &p4);
	printf("distanza p1-p2: %d\n", (&p1-&p2) * sizeof(punto_t));
	printf("distanza p2-p3: %d\n", (&p2-&p3) * sizeof(punto_t));
    printf("distanza p3-p4: %d\n", (&p3-&p4) * sizeof(punto_t));
	//  - A quali indirizzi sono allocati i membri di p1? E' come ci aspettavamo?
    printf("\np1.pName --> %p\n", &p1.pName);
    printf("p1.x --> %p\n", &p1.x);	            //(sono distanti 4 come ci aspettavamo)
	printf("p1.y --> %p\n", &p1.y);
	printf("p1.z --> %p\n", &p1.z);
	//Dichiarazione di un puntatore a struct:
	punto_t* pP; 
    pP = (punto_t *)malloc(sizeof(punto_t));
	//usando il puntatore leggi pP da tastiera 
    char string[DIM];
    puts("\ninserire il nome del punto: ");
    scanf("%s", &string);
    pP->pName = malloc(strlen(string) + 1);
    strncpy(pP->pName, string, DIM);
    puts("inserire pP.x: ");
	scanf("%f", &pP->x);
	puts("inserire pP.y: ");
	scanf("%f", &pP->y);
	puts("inserire pP.z: ");
	scanf("%f", &pP->z);
	//usando il puntatore stampa pP
    printf("\npP.pName: %s", pP->pName);
	printf("\npP.x: %.2f", pP->x);
	printf("\npP.y: %.2f", pP->y);
	printf("\npP.z: %.2f", pP->z);
 
 	return 0;
}