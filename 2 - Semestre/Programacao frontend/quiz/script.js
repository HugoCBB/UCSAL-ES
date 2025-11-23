const data = [
  {
    id: 1,
    pergunta: "Qual é a capital do Brasil?",
    alternativas: {
      a: { descricao: "São Paulo", status: false },
      b: { descricao: "Brasília", status: true },
      c: { descricao: "Rio de Janeiro", status: false },
      d: { descricao: "Salvador", status: false }
    }
  },
  {
    id: 2,
    pergunta: "Qual é o maior planeta do sistema solar?",
    alternativas: {
      a: { descricao: "Marte", status: false },
      b: { descricao: "Terra", status: false },
      c: { descricao: "Júpiter", status: true },
      d: { descricao: "Saturno", status: false }
    }
  },
  {
    id: 3,
    pergunta: "Quem escreveu 'Dom Casmurro'?",
    alternativas: {
      a: { descricao: "Machado de Assis", status: true },
      b: { descricao: "José de Alencar", status: false },
      c: { descricao: "Carlos Drummond", status: false },
      d: { descricao: "Joaquim Nabuco", status: false }
    }
  },
  {
    id: 4,
    pergunta: "Qual elemento químico tem o símbolo 'O'?",
    alternativas: {
      a: { descricao: "Ouro", status: false },
      b: { descricao: "Oxigênio", status: true },
      c: { descricao: "Osmio", status: false },
      d: { descricao: "Cálcio", status: false }
    }
  },
  {
    id: 5,
    pergunta: "Quantos lados tem um hexágono?",
    alternativas: {
      a: { descricao: "Cinco", status: false },
      b: { descricao: "Sete", status: false },
      c: { descricao: "Oito", status: false },
      d: { descricao: "Seis", status: true }
    }
  },
  {
    id: 6,
    pergunta: "Em que ano a Proclamação da República do Brasil ocorreu?",
    alternativas: {
      a: { descricao: "1822", status: false },
      b: { descricao: "1889", status: true },
      c: { descricao: "1901", status: false },
      d: { descricao: "1500", status: false }
    }
  },
  {
    id: 7,
    pergunta: "Qual oceano banha a costa leste do Brasil?",
    alternativas: {
      a: { descricao: "Pacífico", status: false },
      b: { descricao: "Atlântico", status: true },
      c: { descricao: "Índico", status: false },
      d: { descricao: "Ártico", status: false }
    }
  },
  {
    id: 8,
    pergunta: "Qual é a raiz quadrada de 144?",
    alternativas: {
      a: { descricao: "10", status: false },
      b: { descricao: "11", status: false },
      c: { descricao: "12", status: true },
      d: { descricao: "14", status: false }
    }
  },
  {
    id: 9,
    pergunta: "Quem pintou a 'Mona Lisa'?",
    alternativas: {
      a: { descricao: "Vincent van Gogh", status: false },
      b: { descricao: "Pablo Picasso", status: false },
      c: { descricao: "Leonardo da Vinci", status: true },
      d: { descricao: "Claude Monet", status: false }
    }
  },
  {
    id: 10,
    pergunta: "Qual o metal mais abundante na crosta terrestre?",
    alternativas: {
      a: { descricao: "Ferro", status: false },
      b: { descricao: "Alumínio", status: true },
      c: { descricao: "Ouro", status: false },
      d: { descricao: "Cobre", status: false }
    }
  },
  {
    id: 11,
    pergunta: "Quantos estados tem a região Nordeste do Brasil?",
    alternativas: {
      a: { descricao: "7", status: false },
      b: { descricao: "8", status: false },
      c: { descricao: "9", status: true },
      d: { descricao: "10", status: false }
    }
  },
  {
    id: 12,
    pergunta: "O que significa a sigla 'HTML'?",
    alternativas: {
      a: { descricao: "Hyper Text Markup Language", status: true },
      b: { descricao: "High Tech Modern Language", status: false },
      c: { descricao: "Home Tool Markup Language", status: false },
      d: { descricao: "Hyperlink and Text Management Link", status: false }
    }
  },
  {
    id: 13,
    pergunta: "Em que país fica o Monte Everest?",
    alternativas: {
      a: { descricao: "Índia e China", status: false },
      b: { descricao: "Butão e China", status: false },
      c: { descricao: "Nepal e China", status: true },
      d: { descricao: "Paquistão e Índia", status: false }
    }
  },
  {
    id: 14,
    pergunta: "Qual o nome do inventor da lâmpada elétrica funcional?",
    alternativas: {
      a: { descricao: "Nikola Tesla", status: false },
      b: { descricao: "Alexander Graham Bell", status: false },
      c: { descricao: "Thomas Edison", status: true },
      d: { descricao: "Guglielmo Marconi", status: false }
    }
  },
  {
    id: 15,
    pergunta: "Qual a unidade de medida de frequência?",
    alternativas: {
      a: { descricao: "Ohm", status: false },
      b: { descricao: "Volt", status: false },
      c: { descricao: "Hertz", status: true },
      d: { descricao: "Ampère", status: false }
    }
  },
  {
    id: 16,
    pergunta: "Quem foi o primeiro presidente do Brasil?",
    alternativas: {
      a: { descricao: "Getúlio Vargas", status: false },
      b: { descricao: "Deodoro da Fonseca", status: true },
      c: { descricao: "Floriano Peixoto", status: false },
      d: { descricao: "Prudente de Morais", status: false }
    }
  },
];

const cardContainer = document.getElementById("cards")

const renderCards = () => {
    cardContainer.innerHTML = ""
    if(data.length == 0){
        cardContainer.innerHTML = "<p>Sem perguntas para ser renderizado</p>"
        return
    }
    
    data.forEach((item, index) =>{
        const card = document.createElement("div")

        const h3 = document.createElement("h3");
        h3.textContent = `${index + 1} - ${item.pergunta}`
        card.appendChild(h3);

        const altContainer = document.createElement("div")

        Object.keys(item.alternativas).forEach((key) => {
            const alternativas = item.alternativas[key]
            
            const btn = document.createElement("button")
            btn.textContent = `${key} - ${alternativas.descricao}`
            btn.dataset.correct = String(Boolean(alternativas.status))
    
            btn.addEventListener('click', () => {
                if(btn.dataset.correct === "true") {
                    btn.style.backgroundColor = "green"
                    btn.style.color = "white";

                } else {
                    btn.style.backgroundColor = "red"
                    btn.style.color = "white"
                }
            })

            altContainer.appendChild(btn)
        })
        card.appendChild(altContainer)
        cardContainer.appendChild(card)
    })
}

renderCards()
