var index = 0;
window.onload = function(){
    let botaoRestart = document.getElementById("botao");
    botaoRestart.onclick = function(){
        var div1 = document.getElementById("content");
        var str = "<p> Task " +  index +"  <input type='checkbox' id='check"+index+"'/><label for='check" + index +"'></label></p>";
        div1.innerHTML += str;
        index ++;
    }
}
