package br.com.desafio

import java.util.*

class DigitalHouseManager {
    val listaDeAlunos = mutableListOf<Aluno>()
    val listaProfessorTitular = mutableListOf<ProfessorTitular>()
    val listaProfessorAdjunto = mutableListOf<ProfessorAdjunto>()
    val listaDeCurso = mutableListOf<Curso>()
    val listaDeMatricula = mutableListOf<Matricula>()



    fun registrarCurso(nomeCurso: String, codigoCurso: Int, quantMaxAlunos: Int) {
        val curso = Curso(nomeCurso, codigoCurso, quantMaxAlunos)
        listaDeCurso.add(curso)
        println("Curso adicionado! $nomeCurso")


    }

    fun excluirCurso(codigoCurso: Int) {
        listaDeCurso.removeAt(codigoCurso)
        println("Curso excluído! $codigoCurso")
    }

    fun registrarProfessorAdjunto(
        nome: String, sobrenome: String, tempoCasa: Int,
        codigoProfessor: Int, quantHorasMonitoria: Int
    ) {
        val professorAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantHorasMonitoria)
        listaProfessorAdjunto.add(professorAdjunto)
        println("Professor Adjunto $nome registrado!")

    }

    fun registrarProfessorTitular(
        nome: String, sobrenome: String, tempoCasa: Int,
        codigoProfessor: Int, especialidade: String
    ) {
        val professorTitular = ProfessorTitular(nome, sobrenome, tempoCasa, codigoProfessor, especialidade)
        listaProfessorTitular.add(professorTitular)

        println("Professor Titular $nome, registrado com sucesso")

    }


    fun excluirProfessor(nomeProfessor: String, sobrenome: String, tempoCasa: Int, codigoProfessor: Int) {
        listaProfessorTitular.removeAt(codigoProfessor)
        listaProfessorAdjunto.removeAt(codigoProfessor)

        println("Professor Titular $nomeProfessor, excluido com sucesso")
        println("professor Adjunto $nomeProfessor, excluido com sucesso")
    }

    fun matricularAluno(nomeAluno: String, sobrenome: String, codigoAluno: Int) {
        val novoAluno = Aluno(nomeAluno, sobrenome, codigoAluno)
        listaDeAlunos.add(novoAluno)

        println("Matrícula do aluno $nomeAluno efetuada com sucesso!")
    }

    fun matricularAlunoCurso(codigoCurso: Int, codigoAluno: Int) {
        val aluno = encontrarAluno(codigoAluno)
        val curso = encontrarCurso(codigoCurso)
        val dataMatricula = Date()
        val novaMatricula = Matricula(aluno, curso, dataMatricula)

        if (aluno != null && curso != null) {
            listaDeMatricula.add(novaMatricula)


        }
        println("Aluno ${aluno} matriculado no curso de ${curso} com sucesso! \n Data da matrícula: ${novaMatricula.dataMatricula}")

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

    fun excluirAluno (nome: String, sobrenome: String, codigoAluno: Int){
        listaDeAlunos.removeAt(codigoAluno)

    }

    }





