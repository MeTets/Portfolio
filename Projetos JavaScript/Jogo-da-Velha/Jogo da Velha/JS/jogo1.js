window.onload = function(){
    var player = "X";
    var cells = document.getElementsByClassName("celula");
    var jogador = document.getElementById("jogadorJogo");
    const botao = document.getElementById("botaoRestart");
    var jogadas = ["", "", "", "", "", "", "", "", ""];
    celativas = [0, 0, 0, 0, 0, 0, 0, 0, 0];


    console.log(player);
    console.log(jogador);
    console.log(cells);
    console.log(jogadas);
    console.log(botao);
    console.log(celativas);

    const condicoesVitoria = [
        [0, 1, 2],
        [3, 4, 5],
        [6, 7, 8],
        [0, 3, 6],
        [1, 4, 7],
        [2, 5, 8],
        [0, 4, 8],
        [6, 2, 4]
    ];

    console.log(condicoesVitoria);
    document.querySelectorAll(".celula").forEach(celula => celula.addEventListener('click', Clica));
    document.querySelectorAll(".celula").forEach(celula => celula.addEventListener('click', ResultadoJogo));
    
    botao.addEventListener('click', function(){
        for(var i = 0; i < cells.length; i++){
            cells[i].innerHTML = "";
        }
        player = "X";
        jogador.innerHTML = `É a vez do jogador ${player}`;
        jogadas = ["", "", "", "", "", "", "", "", ""];
        celativas = [0, 0, 0, 0, 0, 0, 0, 0, 0];
    });

    function Clica( event ){
        let celulaclicada = event.target;
        let celulaindex = celulaclicada.getAttribute('data-index');
        if(celativas[celulaindex] == 0){
        jogadas[celulaindex] = player;
        cells[celulaindex].innerHTML = player;
        player = player === "X" ? "O": "X";
        jogador.innerHTML = `É a vez do jogador ${player}`;
        celativas[celulaindex] = 1;
        }
    }

    function ResultadoJogo(){
        for(var i = 0; i < 8; i++){
            const condvitoria =  condicoesVitoria[i];
            let a = jogadas[condvitoria[0]];
            let b = jogadas[condvitoria[1]];
            let c = jogadas[condvitoria[2]];
            if(a === "" || b === "" || c === ""){
                continue;
            }
            if(a === b && b === c){
                if(b === "X"){
                    jogador.innerHTML = "O Vencedor foi o jogador X";
                    celativas = [1, 1, 1, 1, 1, 1, 1, 1, 1];
                    break;
                }
                else if(b === "O"){
                    jogador.innerHTML = "O vencedor foi o jogador O";
                    celativas = [1, 1, 1, 1, 1, 1, 1, 1, 1];
                    break;
                }
            }
        }
        if(!jogadas.includes("")){
            jogador.innerHTML = "Empate";
        }
    }
    }