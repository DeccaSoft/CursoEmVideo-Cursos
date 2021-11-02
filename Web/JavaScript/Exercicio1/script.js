function carregar(){
    var msg = window.document.getElementById('msg');
    var img = window.document.getElementById('imagem');
    var data = new Date();
    var hora = data.getHours();
    //hora = 22
    msg.innerHTML = `Agora são ${hora} horas.`;


    if(hora >= 0 && hora < 5){
        //Boa Madrugada
        img.src = 'Madrugada.jpg';
        document.body.style.background = 'rgb(10, 16, 68)'
    }else if(hora >= 5 && hora < 12){
        //Bom Dia
        img.src = 'Manha.jpg'
        document.body.style.background = '#e2cd9f'
    }else if(hora >=12 && hora < 17){
        //Boa Tarde
        img.src = 'Tarde.jpg'
        document.body.style.background = 'rgb(179, 232, 241)'
    }else if(hora >= 17 && hora < 19){
        //Boa Tardinha
        img.src = 'Tardinha.jpg'
        document.body.style.background = 'rgb(224, 96, 21)'

    }else if(hora >=19 && hora < 24){
        //Boa Noite
        img.src = 'Noite.jpg'
        document.body.style.background = 'rgb(25, 4, 99)'
    }else{
        //Hora Inválida
    }
}