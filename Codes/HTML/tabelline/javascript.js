function calcolaSomma(){
    var numero1 = parseFloat(prompt("inserisci il numero:"));
    var i = 1;

    for(i = 1; i < 11; i++){
        prodotto = numero1 * i;
        document.write("<tr>");
        document.write(numero1 + "*" + i + "=" + prodotto + "<br>");
    }
}