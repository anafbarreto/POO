function cadastra() {
  // recupera os valores do usuário
  var cidade = new Object(); //cria um objeto
  cidade.nome = document.getElementById("nome").value;
  cidade.pib = Number(document.getElementById("pib").value);
  cidade.populacao = Number(document.getElementById("populacao").value);
  cidade.prefeito = document.getElementById("prefeito").value;
  //para atualização
  cidade.id = Number(document.getElementById("id").value);
  // consumir API para inserção = POST
  var request = new XMLHttpRequest(); // objeto de requisição
  //abre a requisição
  request.open("POST", "http://localhost:8080/api/cidade", true);
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
  request.send(JSON.stringify(cidade));
  alert("Cidade inserida com sucesso");
  location.reload();
}

function consulta() {
  //cria um objeto de requisição
  const request = new XMLHttpRequest();
  // abre a conexão
  request.open("GET", "http://localhost:8080/api/cidade", true);
  // ao carregar
  request.onload = function () {
    if (request.status >= 200 && request.status < 400) {
      console.log("Conectou na API");
      // recuperar os dados
      const cidades = JSON.parse(this.response); // converte de JSON para objeto
      // cria as linhas da tabela
      // recupera a tabela
      const tbody = document.getElementsByTagName("tbody");
      cidades.forEach((cidade) => {
        // cria a linha da tabela
        const linha = document.createElement("tr");
        // adiciona linha na tabela
        tbody[0].appendChild(linha);
        // cria as colunas da tabela
        const cel1 = document.createElement("td");
        cel1.textContent = cidade.nome;
        const cel2 = document.createElement("td");
        cel2.textContent = cidade.pib;
        const cel3 = document.createElement("td");
        cel3.textContent = cidade.populacao;
        const cel4 = document.createElement("td");
        cel4.textContent = cidade.prefeito;
        const cel5 = document.createElement("td");
        const buttonRemove = document.createElement('button');
        buttonRemove.setAttribute('type', 'button');
        buttonRemove.setAttribute('class', 'btn btn-danger');
        const removeIcon = document.createElement('i');
        removeIcon.setAttribute('class', 'far fa-trash-alt');
        buttonRemove.appendChild(removeIcon);
        buttonRemove.setAttribute('onclick', `remove(${cidade.id})`);
        const cel6 = document.createElement("td");
        const buttonUpdate = document.createElement('button');
        buttonUpdate.setAttribute('type', 'button');
        buttonUpdate.setAttribute('class', 'btn btn-warning');
        const updateIcon = document.createElement('i');
        updateIcon.setAttribute('class', 'far fa-edit');
        buttonUpdate.appendChild(updateIcon);
        buttonUpdate.setAttribute(
          "onclick",
          `atualiza(${JSON.stringify(cidade)})`
        );

        // colocar as células dentro da linha
        linha.appendChild(cel1);
        linha.appendChild(cel2);
        linha.appendChild(cel3);
        linha.appendChild(cel4);
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
  request.open("DELETE", `http://localhost:8080/api/cidade/${id}`, true);
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

function atualiza(cidade) {
  // copiar o conteúdo da linha para as caixas de texto do cadastro
  document.getElementById("nome").value = cidade.nome;
  document.getElementById("pib").value = cidade.pib;
  document.getElementById("populacao").value = cidade.populacao;
  document.getElementById("prefeito").value = cidade.prefeito;
  document.getElementById("id").value = cidade.id;