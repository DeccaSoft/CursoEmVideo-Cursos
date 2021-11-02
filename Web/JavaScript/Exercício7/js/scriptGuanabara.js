let num = document.querySelector('input#fnum');
let lista = document.querySelector('select#flista');
let res = document.querySelector('div#res');
let valores = [];

function isNumero(n){
    if(Number(n) >=1 && Number(n) <= 100){
        return true;
    }else{
        return false;
    }
}

function inLista(n, l){
    //Se indexOf retornar -1, significa que o valor NÃO foi encontrado na lista
    if(l.indexOf(Number(n)) != -1){ 
        return true;
    }else{
        return false;
    }
}

function adicionar(){
    if(isNumero(num.value) && !inLista(num.value, valores)){
        valores.push(Number(num.value));
        let item = document.createElement('option');
        item.text = `Valor ${num.value} Adicionado com Sucesso!`;
        lista.appendChild(item);
        res.innerHTML = '';
    }else{
        alert("Valor Inválido ou já adicionado à Lista!");
    }
    num.value = '';
    num.focus();
}

function finalizar(){
    if(valores.length == 0){
        alert('Nào existem valores na lista... Impossível Finalizar!')
    }else{
        let tot = valores.length;
        let menor = valores[0];
        let maior = valores[0];
        let soma = 0;
        let media = 0;
        for(let pos in valores){
            soma += valores[pos];
            if(valores[pos] > maior){
                maior = valores[pos];
            }
            if(valores[pos] < menor){
                menor == valores[pos];
            }
        }
        media = soma / tot;

        res.innerHTML = '';
        res.innerHTML += `<p>Total de Elementos da Lista: ${tot}.</p>`;
        res.innerHTML += `<p>Menor Elementos da Lista: ${menor}.</p>`;
        res.innerHTML += `<p>Maior Elementos da Lista: ${maior}.</p>`;
        res.innerHTML += `<p>Soma dos Elementos da Lista: ${soma}.</p>`;
        res.innerHTML += `<p>Média dos Elementos da Lista: ${media}.</p>`;
    }
}