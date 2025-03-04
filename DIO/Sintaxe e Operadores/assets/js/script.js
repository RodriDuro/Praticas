function comparaNun(n1,n2){

    const primeiraFrase = criaPrimeiraFrase(n1,n2);
    const segundaFrase = criaSegundaFrase(n1,n2);

    return '${primeiraFrase} ${segundaFrase}';
}

function criaPrimeiraFrase(n1,n2){
    let primeiraFrase = 'Os numeros ${n1} e ${n2}';
    let simNao = 'não';

    if (n1 === n2){
        simNao ='';
    }
    return '${primeiraFrase} ${simNao} são iguais.';
}
function criaSegundaFrase(n1,n2){

    function operaCalculo(n1,n2) {
        const soma = num1 + num2;
        let comparaDez = 'menor';
        let comparaVinte = 'menor';

        if (soma > 10) {
            comparaDez = 'maior';
        }

        if (soma > 20) {
            comparaVinte = 'maior';
        }

        return `Sua soma é ${soma}, que é ${comparaDez} do que 10 e ${comparaVinte} do que 20.`;
    }

    console.log(comparaNumeros(10, 10));

}