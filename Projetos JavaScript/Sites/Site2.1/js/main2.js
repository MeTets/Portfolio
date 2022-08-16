// callAPI("https://superheroapi.com/api.php/10207244891555840/542", function(response){
//     console.log("callback");
//     console.log(response);
// });

var heroes = [];
var numHeroes = 4;

for(var i=0; i<numHeroes; i++){
    callAPI("https://superheroapi.com/api.php/10207244891555840/"+getRandomInt(1,731), function(response){
        createHero(response);
    });
}

function createHero(response){
    var hero = new Hero( response.id, 
                         response.name,
                         response.image.url,
                         (response.powerstats.intelligence == "null") ? 0 : parseInt(response.powerstats.intelligence),
                         (response.powerstats.strength == "null") ? 0 : parseInt(response.powerstats.strength),
                         (response.powerstats.speed == "null") ? 0 : parseInt(response.powerstats.speed),
                         (response.powerstats.durability == "null") ? 0 : parseInt(response.powerstats.durability),
                         (response.powerstats.power == "null") ? 0 : parseInt(response.powerstats.power),
                         (response.powerstats.combat == "null") ? 0 : parseInt(response.powerstats.combat) );
    heroes.push(hero);
    showHero(hero);
    checkHeroes();
}

function checkHeroes(){
    if(heroes.length == numHeroes){
        var maxIntelligence = heroes[0].intelligence;
        var maxStrength = heroes[0].strength;
        var maxSpeed = heroes[0].speed;
        var maxDurability = heroes[0].durability;
        var maxPower = heroes[0].power;
        var maxCombat = heroes[0].combat;
        var maxHero = 0;
        var pontMax = 0;
        var pont = [numHeroes];
        for(var i=0; i<heroes.length; i++){
            if(heroes[i].intelligence > maxIntelligence) {
                maxIntelligence = heroes[i].intelligence;
                pont[i] += 1;
            }
            if(heroes[i].strength > maxStrength) {
                pont[i] += 1;
            }
            if(heroes[i].speed > maxSpeed) {
                pont[i] += 1;
            }
            if(heroes[i].durability > maxDurability) {
                pont[i] += 1;
            }
            if(heroes[i].power > maxPower) {
                pont[i] += 1;
            }
            if(heroes[i].combat > maxCombat) {
                pont[i] += 1;
            }

        }
        for(var i=0; i<pont.length; i++){
             if(pont[i] > pontMax){
                 pontMax = pont[i];
                 maxHero = pont[i];
             }  
        }
        alert("O personagem mais inteligente é: "+heroes[maxHero].name);
    } 
}

function getRandomInt(min, max) {
    return parseInt(Math.random() * (max - min) + min);
}

function showHero(hero){

    var str = "<article> <h3>" + hero.name + "</h3>";
    str += "<img alt='imagem' src='" + hero.imageURL + "'/>";

    str += "<p> Inteligência: " + hero.intelligence + "</p>";
    str += "<div style='width: "+hero.intelligence+"%; background-color: #f00'></div>";

    str += "<p> Força: " + hero.strength + "</p>";
    str += "<div style='width: "+hero.strength+"%'></div>";

    str += "<p> Velocidade: " + hero.speed + "</p>";
    str += "<div style='width: "+hero.speed+"%'></div>";

    str += "<p> Durabilidade: " + hero.durability + "</p>";
    str += "<div style='width: "+hero.durability+"%'></div>";

    str += "<p> Poder: " + hero.power + "</p>";
    str += "<div style='width: "+hero.power+"%'></div>";

    str += "<p> Combate: " + hero.combat + "</p>";
    str += "<div style='width: "+hero.combat+"%'></div>";

    str += "</article>";
    document.body.innerHTML += str;
}

function callAPI(url, callback){
    var xhr = new XMLHttpRequest();
    xhr.open("GET", url, true);
    xhr.responseType = 'json';
    xhr.onload = function(){
        if(xhr.status === 200){
            callback(xhr.response);
        } else {
            alert("Houve um problema ao acessar o banco de dados de heróis.");
        }
    }
    xhr.send();
}

class Hero {
    constructor(id, name, imageURL, intelligence, strength, speed, durability, power, combat){
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.intelligence = intelligence;
        this.strength = strength;
        this.speed = speed;
        this.durability = durability;
        this.power = power;
        this.combat = combat;
    }
}