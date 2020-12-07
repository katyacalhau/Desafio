package br.com.desafio

open class Curso (val nomeCurso: String, val codigoCurso: Int, val quantMaxAlunos: Int)  {


val listaAlunosMatriculados = mutableListOf<Aluno>()



fun adicionarAluno (aluno: Aluno): Boolean {
    return if (listaAlunosMatriculados.size <= quantMaxAlunos) {
        listaAlunosMatriculados.add(aluno)
        return true
    } else false
}


fun excluirAluno(aluno: Aluno) {
    listaAlunosMatriculados.remove(aluno)
}
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigoCurso != other.codigoCurso) return false

        return true
    }




}