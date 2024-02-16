function cadastra() {
  // recupera os valores do usuário
  var hotel = new Object(); //cria um objeto
  hotel.nome = document.getElementById("nome").value;
  hotel.capacidade = Number(document.getElementById("capacidade").value);
  hotel.estrelas = Number(document.getElementById("estrelas").value);
  //para atualização
  hotel.id = Number(document.getElementById("id").value);

  // consumir API para inserção = POST
  var request = new XMLHttpRequest(); // objeto de requisição
  //abre a requisição
  request.open("POST", "http://localhost:8080/api/hotel", true);
  // ao carregar
  request.onload = function () {
    if (request.status >= 200 && request.status < 400) {
      console.log("Conectou na API");
    } else {
      console.log("Não conectou na API");
    }
  };

  //configura o cabeçalho da requisição
  request.setRequestHeader("Content-Type", "application/json");
  // Envia dados para a requisição
  // converte objeto em JSON
  request.send(JSON.stringify(hotel));
  alert("Hotel inserido com sucesso");
  location.reload();
}

function consulta() {
  //cria um objeto de requisição
  const request = new XMLHttpRequest();
  // abre a conexão
  request.open("GET", "http://localhost:8080/api/hotel", true);
  // ao carregar
  request.onload = function () {
    if (request.status >= 200 && request.status < 400) {
      console.log("Conectou na API");
      // recuperar os dados
      const hoteis = JSON.parse(this.response); // converte de JSON para objeto
      // cria as linhas da tabela
      // recupera a tabela
      const tbody = document.getElementsByTagName("tbody");
      hoteis.forEach((hotel) => {
        // cria a linha da tabela
        const linha = document.createElement("tr");
        // adiciona linha na tabela
        tbody[0].appendChild(linha);
        // cria as colunas da tabela
        const cel1 = document.createElement("td");
        cel1.textContent = hotel.nome;
        const cel2 = document.createElement("td");
        cel2.textContent = hotel.capacidade;
        const cel3 = document.createElement("td");
        cel3.textContent = hotel.estrelas;
        const cel5 = document.createElement("td");
        const buttonRemove = document.createElement('button');
        buttonRemove.setAttribute('type', 'button');
        buttonRemove.setAttribute('class', 'btn btn-danger');
        const removeIcon = document.createElement('i');
        removeIcon.setAttribute('class', 'far fa-trash-alt');
        buttonRemove.appendChild(removeIcon);
        buttonRemove.setAttribute('onclick', `remove(${hotel.id})`);
        const cel6 = document.createElement("td");
        const buttonUpdate = document.createElement('button');
        buttonUpdate.setAttribute('type', 'button');
        buttonUpdate.setAttribute('class', 'btn btn-warning');
        const updateIcon = document.createElement('i');
        updateIcon.setAttribute('class', 'far fa-edit');
        buttonUpdate.appendChild(updateIcon);
        buttonUpdate.setAttribute(
          "onclick",
          `atualiza(${JSON.stringify(hotel)})`
        );

        // colocar as células dentro da linha
        linha.appendChild(cel1);
        linha.appendChild(cel2);
        linha.appendChild(cel3);
        linha.appendChild(cel5);
        linha.appendChild(cel6);
        cel5.appendChild(buttonRemove);
        cel6.appendChild(buttonUpdate);
      });
    } else {
      console.log("Não conectou na API");
    }
  };
  request.send();
}

function remove(id) {
  var request = new XMLHttpRequest();
  request.open("DELETE", `http://localhost:8080/api/hotel/${id}`, true);
  request.onload = function () {
    if (request.status >= 200 && request.status < 400) {
      console.log("Carregou");
    } else {
      console.log("Não carregou");
    }
  };
  request.send();
  alert("Remoção realizada com sucesso");
  location.reload(); // atualiza a página
}

function atualiza(hotel) {
  // copiar o conteúdo da linha para as caixas de texto do cadastro
  document.getElementById("nome").value = hotel.nome;
  document.getElementById("capacidade").value = hotel.capacidade;
  document.getElementById("estrelas").value = hotel.estrelas;
  document.getElementById("id").value = hotel.id;
}