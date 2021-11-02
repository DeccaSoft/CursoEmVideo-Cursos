let amigoObjeto = {};
console.log(typeof amigoObjeto);

let amigoArray = [];
console.log(typeof amigoArray);

amigoObjeto = {
    nome: 'José',
    sexo: 'M',
    peso: 85.4,
    engordar(p=0){
        console.log('Engordou!');
        this.peso += p;
    }
};

console.log(amigoObjeto);

console.log(`${amigoObjeto.nome} pesa ${amigoObjeto.peso}`);
amigoObjeto.engordar(2);
console.log(`${amigoObjeto.nome} pesa ${amigoObjeto.peso}`);

let num = 8
//Exponenciação
num**=2
console.log(num)