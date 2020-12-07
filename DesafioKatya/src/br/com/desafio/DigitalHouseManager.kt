package br.com.desafio

class DigitalHouseManager {
    val listaDeAlunos = mutableListOf<Aluno>()
    val listaProfessorTitular = mutableListOf<ProfessorTitular>()
    val listaProfessorAdjunto = mutableListOf<ProfessorAdjunto>()
    val listaDeCurso = mutableListOf<Curso>()
    val listaDeMatricula = mutableListOf<Matricula>()


    fun registrarCurso(nomeCurso: String, codigoCurso: Int, quantMaxAlunos: Int) {
        val curso = Curso(nomeCurso, codigoCurso, quantMaxAlunos)
        listaDeCurso.add(curso)


    }

    fun excluirCurso(codigoCurso: Int) {
        listaDeCurso.removeAt(codigoCurso)

    }

    fun registrarProfessorAdjunto(
        nome: String, sobrenome: String, tempoCasa: Int,
        codigoProfessor: Int, quantHorasMonitoria: Int
    ) {
        val professorAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantHorasMonitoria)
        listaProfessorAdjunto.add(professorAdjunto)

    }

    fun registrarProfessorTitular(
        nome: String, sobrenome: String, tempoCasa: Int,
        codigoProfessor: Int, especialidade: String
    ) {
        val professorTitular = ProfessorTitular(nome, sobrenome, tempoCasa, codigoProfessor, especialidade)
        listaProfessorTitular.add(professorTitular)

    }


    fun excluirProfessor(nomeProfessor: String, sobrenome: String, tempoCasa: Int, codigoProfessor: Int) {
        listaProfessorTitular.removeAt(codigoProfessor)
        listaProfessorAdjunto.removeAt(codigoProfessor)

    }

    fun matricularAluno(nomeAluno: String, sobrenome: String, codigoAluno: Int) {
        val novoAluno = Aluno(nomeAluno, sobrenome, codigoAluno)
        listaDeAlunos.add(novoAluno)
    }

    fun matricularAlunoCurso(codigoCurso: Int, codigoAluno: Int) {
        val aluno = encontrarAluno(codigoAluno)
        val curso = encontrarCurso(codigoCurso)
        val novaMatricula = Matricula(aluno, curso)

        if (aluno != null && curso != null)
            if (curso.adicionarAluno(aluno)) {
                listaDeMatricula.add(novaMatricula)
                println("Aluno ${aluno} matriculado no curso de ${curso} com sucesso! \n Data da matrícula: ${novaMatricula.dataMatricula}")

            } else {
                println("Não foi possível realizar a matrícula! Quantidade de alunos de  ${curso.quantMaxAlunos} excedida.")

            }

        }


        fun encontrarAluno(codigoAluno: Int): Aluno? {
            var alunoEncontrado: Aluno? = null
            listaDeAlunos.forEach { aluno ->
                if (aluno.codigoAluno == codigoAluno) {
                    alunoEncontrado = aluno
                }
            }
            return alunoEncontrado


        }

        fun encontrarCurso(codigoCurso: Int): Aluno? {
            var cursoEncontrado: Aluno? = null
            listaDeAlunos.forEach { aluno ->
                if (aluno.codigoAluno == codigoCurso) {
                    cursoEncontrado = aluno
                }
            }
            return cursoEncontrado


        }

    fun alocarProfessor (codigoCurso: Int, codigoProfessor: Int){
        var professorTitular: ProfessorTitular ? = listaProfessorTitular [codigoProfessor]
        var professorAdjunto: ProfessorAdjunto ? = listaProfessorAdjunto [codigoProfessor]
        listaDeCurso [codigoCurso] ?.professorTitular = professorTitular
        listaDeCurso [codigoCurso] ?.professorAdjunto = professorAdjunto
    }


    }





