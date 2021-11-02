function parImpar(n){
    if(n%2==0){
        return 'Par'
    }else{
        return 'Ímpar'
    }
}

let res1 = parImpar(4)
console.log(res1)
let res2 = parImpar(7)
console.log(res2)

console.log(parImpar(11))
console.log(parImpar(96))

function soma(n1=0, n2=0){ //Parâmetros pré-definidos, se forem passados assumem o valor padrão, no caso, zero
    return n1 + n2
}

console.log(soma(2, 5))
console.log(soma(4))

var z = function(x){
    return x * 2
}

console.log(z(5))

function fatorial(k){ //Não testa 0!
    let fat = 1
    for(let c=k; c > 1; c--){
        fat *= c
    }
    return fat
}

console.log(fatorial(5))

//Recursividade

/*
5! = 5 * 4 * 3 * 2 * 1
5! = 5 * 4! ...
n! = n * (n-1)!
1! = 1
*/

function fatorialRecursivo(r){
    if(r == 1){
        return 1
    }else{
        return r * fatorialRecursivo(r - 1)
    }
}

console.log(fatorialRecursivo(5))
