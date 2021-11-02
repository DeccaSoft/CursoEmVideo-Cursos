function carregar(){
    var num = document.getElementById('numero');
    var sel = document.getElementById('select');

    if(num.value.length == 0){
        alert('Por favor, digite pelo menos um número');
    }else{
        var v = Number(num.value);
        var item = document.createElement('option');
        item.text = v;
        select.appendChild(item);
    }
}