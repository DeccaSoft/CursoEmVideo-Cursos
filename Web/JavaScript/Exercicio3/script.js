function contar(){
    var ini = document.getElementById('inicio');
    var fim = document.getElementById('fim');
    var pas = document.getElementById('passo');
    var res = document.getElementById('res');

    if( ini.value.length == 0 || fim.value.length == 0 || pas.value.length == 0 ){
        res.innerHTML = 'Impossível Contar !!!'
    }else{
        res.innerHTML = 'Contando...'
        let i = Number(ini.value);
        let f = Number(fim.value);
        let p = Number(pas.value);
        if(p <=0){
            alert('Passo Inválido... Considerando passo = 1');
            p=1;
        }
        if(i < f){
            for(var x = i; x <= f; x += p){
                res.innerHTML += `${x} \u{1F449} `;
            }
        }else{
            for(var x = i; x >= f; x -= p){
                res.innerHTML += `${x} \u{1F449} `;
            }
        }
        res.innerHTML += ` \u{1F3C1}`;
    }

    

    
}