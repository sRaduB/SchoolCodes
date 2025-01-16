function Primi(){
    var j = 2;
    var i = 2;
    var cont = 0;
    var x = 0;
    document.write("Il numero " + j + " è primo<br>");

    while(cont<9){
        j++;
        for(i=2; i<j; i++){
            if(j%i == 0){
                x++;
            }
        }
        if(x==0){
            document.write("Il numero " + j + " è primo<br>");
            cont++;
        }
        x=0;
    }
}