let num= [5, 8, 2, 9, 3];
num.push(7);
num[2] = 1;

console.log(`Vetor: ${num}`);
console.log(`Tamnaho do Vetor: ${num.length}`);
console.log(`Ordenado: ${num.sort()}`);

for(let pos=0; pos<num.length; pos++){
    console.log(`A poisção ${pos} tem o Valor: ${num[pos]}`);
}

console.log('Utilizando For in...')

for(let pos in num){
    console.log(`A poisção ${pos} tem o Valor: ${num[pos]}`);
}

console.log(`Posição do Elemento de Valor 7 = ${num.indexOf(7)}`)
console.log(`Posição do Elemento de Valor 4 = ${num.indexOf(4)}`) //Se não encontrar retorna -1