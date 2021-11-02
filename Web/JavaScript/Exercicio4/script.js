function gerarTabuada(){
    var val = document.getElementById('valor');
    var t = document.getElementById('tab');

    if(val.value.length == 0){
        alert('Por Favor Digite um Número')
    }else{
        var v = Number(val.value);
        t.innerHTML = ""
        for(var c = 0; c <= 10; c++){
            var item = document.createElement('option');
            item.text = `${v} x ${c} = ${v*c}`;
            item.value = `t${c}`; //Essa Linha serve pra podermos selecionar os items no select
            t.appendChild(item);
        }
    }
}