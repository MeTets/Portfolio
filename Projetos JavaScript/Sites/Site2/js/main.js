var a = 5;
var b = 10;

function soma(fatorA, fatorB){
    var res = fatorA + fatorB
    return res;
    
}
function resp(a, b, c){
    console.log("A soma de "+a+" com "+b+" é igual a "+c);
}


var resp1 = soma(a, b);
resp(a, b, resp1);

var nomes = ["Mateus", "Gabriel", "Marcia"];

window.onload = function(){
    //var quadrado = document.getElementById("quadrado");
    // busca um elemento especifico
    //console.log(quadrado);
    //quadrado.style.backgroundColor = "red";
    //quadrado.style.height = "100px";
    //quadrado.style.width = "100px";

    var quadrados = document.getElementsByTagName("div");
    console.log(quadrados);
    console.log(quadrados[0]);
    //busca vários elementos de um tipo
    for(var i = 0; i < quadrados.length; i++){
        quadrados[i].style.backgroundColor = "#f0f0f0";
        quadrados[i].style.margin = "10px";
        quadrados[i].style.height = "100px";
        quadrados[i].style.width = "100px";
        quadrados[i].style.display = "flex";
        quadrados[i].style.justifyContent = "center";
        quadrados[i].style.alignContent = "center";
        quadrados[i].style.fontFamily = "Arial";

    }
    for(var i = 0; i < nomes.length; i++){
        quadrados[i].innerHTML = nomes[i];
    }

}