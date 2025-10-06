

const resultado = document.querySelector('#numero-resultado')
const botoes = document.querySelectorAll('.botoes-numero button')

resultado.textContent = 0

let primeiroValor = null
let esperandoProximoValor = false
let operador = null

const atualizarResultado = (numero) => {
    if (esperandoProximoValor) {
        resultado.textContent = numero
        esperandoProximoValor = false
    } else {
        const valorAtualResultado = resultado.textContent
        resultado.textContent = valorAtualResultado === '0' ? numero : valorAtualResultado + numero
    }
}

const lidarComOperador = (proximoOperador) => {
    const valorResultado = parseFloat(resultado.textContent)
    if (operador && !esperandoProximoValor) {
        const resultadoCalculado = calcular()
        resultado.textContent = String(resultadoCalculado)
        primeiroValor = resultadoCalculado
    } else {
        primeiroValor = valorResultado
    }

    operador = proximoOperador
    esperandoProximoValor = true
}

const calcular = () => {
    if (primeiroValor === null || operador === null) {
        return resultado.textContent
    }

    const segundoValor = parseFloat(resultado.textContent)
    let calculo = 0

    switch (operador) {
        case '+':
            calculo = primeiroValor + segundoValor
            break;
        case '-':
            calculo = primeiroValor - segundoValor
            break;
        case '*':
            calculo = primeiroValor * segundoValor
            break;
        default:
            return segundoValor;
    }
    return calculo
}

const resetarCalculadora = () => {
    resultado.textContent = '0';
    primeiroValor = null;
    operador = null;
    esperandoProximoValor = false;
};

botoes.forEach(botao => {
    botao.addEventListener('click', () => {
        const valorBotao = botao.dataset.numero
        const tipoBotao = botao.dataset.tipo

        if (tipoBotao === 'numero') {
            atualizarResultado(valorBotao)
        }

        if (tipoBotao === 'operador') {
            lidarComOperador(valorBotao)
        }

        if (tipoBotao == "limpar") {
            resetarCalculadora()
            
        }
        if (tipoBotao === 'igual') {
            const resultadoFinal = calcular();
            resultadoDisplay.textContent = String(resultadoFinal); 

            primeiroValor = resultadoFinal;
            operador = null;
            esperandoProximoValor = false;
            
        }
    })
})
