document.addEventListener("DOMContentLoaded", function() {
    function mostrarSecao(secaoId) {
        document.querySelectorAll(".secao").forEach(secao => {
            secao.style.display = "none";
        });
        document.getElementById(secaoId).style.display = "block";
    }
    window.mostrarSecao = mostrarSecao;
    mostrarSecao("alunos");
    
    document.getElementById("formAlunos").addEventListener("submit", function(event) {
        event.preventDefault();
        const aluno = {
            nome: document.getElementById("nomeAluno").value,
            dataNascimento: document.getElementById("dataNascimentoAluno").value,
            endereco: document.getElementById("enderecoAluno").value,
            telefone: document.getElementById("telefoneAluno").value,
            email: document.getElementById("emailAluno").value,
            turma: document.getElementById("turmaAluno").value
        };
        cadastrarAluno(aluno);
    });

    document.getElementById("formProfessores").addEventListener("submit", function(event) {
        event.preventDefault();
        const professor = {
            nome: document.getElementById("nomeProfessor").value,
            disciplina: document.getElementById("disciplinaProfessor").value,
            cpf: document.getElementById("cpfProfessor").value,
            email: document.getElementById("emailProfessor").value,
            telefone: document.getElementById("telefoneProfessor").value
        };
        cadastrarProfessor(professor);
    });

    document.getElementById("formTurmas").addEventListener("submit", function(event) {
        event.preventDefault();
        const turma = {
            nome: document.getElementById("nomeTurma").value,
            turno: document.getElementById("turnoTurma").value
        };
        cadastrarTurma(turma);
    });
});

function cadastrarAluno(aluno) {
    fetch("http://localhost:8080/alunos", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(aluno)
    }).then(response => response.json())
      .then(() => alert("Aluno cadastrado com sucesso!"));
}

function cadastrarProfessor(professor) {
    fetch("http://localhost:8080/professores", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(professor)
    }).then(response => response.json())
      .then(() => alert("Professor cadastrado com sucesso!"));
}

function cadastrarTurma(turma){
    fetch("http://localhost:8080/turmas", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(turma)
    }).then(response => response.json())
      .then(() => alert("Turma cadastrada com sucesso!"));
}

function carregarAlunos() {
    fetch("http://localhost:8080/alunos")
        .then(response => response.json())
        .then(alunos => {
            const lista = document.getElementById("listaAlunos");
            lista.innerHTML = "";
            alunos.forEach(aluno => {
                const li = document.createElement("li");
                li.textContent = `${aluno.id} - ${aluno.nome}`;
                lista.appendChild(li);
            });
        });
}

function carregarProfessores() {
    fetch("http://localhost:8080/professores")
        .then(response => response.json())
        .then(professores => {
            const lista = document.getElementById("listaProfessores");
            lista.innerHTML = "";
            professores.forEach(professor => {
                const li = document.createElement("li");
                li.textContent = `${professor.id} - ${professor.nome}`;
                lista.appendChild(li);
            });
        });
}

function carregarTurmas() {
    fetch("http://localhost:8080/turmas")
        .then(response => response.json())
        .then(turmas => {
            const lista = document.getElementById("listaTurmas");
            lista.innerHTML = "";
            turmas.forEach(turma => {
                const li = document.createElement("li");
                li.textContent = `${turma.id} - ${turma.nome}`;
                lista.appendChild(li);
            });
        });
}