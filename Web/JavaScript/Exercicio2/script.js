function verificar(){
    var data = new Date();
    var ano = data.getFullYear();
    var fano = document.getElementById('txtano');
    var res = document.querySelector('div#res') // ou .getElementById('res');
    if(fano.value.length == 0 || fano.value > ano){
        alert('[ERRO] Ano Inválido! Verifique os dados e tente novamente...');
    }else{
        var fsex = document.getElementsByName('radsex');
        var idade = ano - Number(fano.value);
        var genero = '';
        var img = document.createElement('img');
        img.style.width = '250px';
        //img.style.border-radius = '125px';
        img.setAttribute('id', 'foto')
        if(fsex[0].checked){
            genero = 'Homem';
            if(idade >= 0 && idade < 4){
                //Bebê
                img.setAttribute('src', 'BebeHomem.jpg');
            }else if(idade >= 4 && idade < 11){
                //Criança
                img.setAttribute('src', 'CriancaHomem.jpg');
            }else if(idade >= 11 && idade < 16){
                //Adolescente
                img.setAttribute('src', 'AdolescenteHomem.jpg');
            }else if(idade >= 16 && idade < 24){
                //Jovem
                img.setAttribute('src', 'JovemHomem.jpg');
            }else if(idade >= 24 && idade < 60){
                //Adulto
                img.setAttribute('src', 'AdultoHomem.jpg');
            }else if(idade >= 60){
                //Idoso
                img.setAttribute('src', 'IdosoHomem.jpg');
            }else{
                //Inválida
                alert('Data Inválida! Verifique os dados e tente novamente...')
            }
        }else if(fsex[1].checked){
            genero = 'Mulher';
            if(idade >= 0 && idade < 4){
                //Bebê
                img.setAttribute('src', 'BebeMulher.jpg');
            }else if(idade >= 4 && idade < 11){
                //Criança
                img.setAttribute('src', 'CriancaMulher.jpg');
            }else if(idade >= 11 && idade < 16){
                //Adolescente
                img.setAttribute('src', 'AdolescenteMulher.jpg');
            }else if(idade >= 16 && idade < 24){
                //Jovem
                img.setAttribute('src', 'JovemMulher.jpg');
            }else if(idade >= 24 && idade < 60){
                //Adulto
                img.setAttribute('src', 'AdultoMulher.jpg');
            }else if(idade >= 60){
                //Idoso
                img.setAttribute('src', 'IdosoHomem.jpg');
            }else{
                //Inválida
                alert('Data Inválida! Verifique os dados e tente novamente...')
            }
        }
        res.style.textAlign = 'center';
        res.innerHTML = `Detectamos ${genero} com ${idade} anos.`;
        res.appendChild(img);
    }
}