package br.com.desafio

open class ProfessorAdjunto(
        nome: String,
        sobrenome: String,
        tempoCasa: Int,
        codigoProfessorAdjunto: Int,
        val quantHorasMonitoria: Int,
        //codigoProfessor: Int//todo vc esta pedindo duas vezes o codigo do professor, mas não esta passando, como o codigo
        //todo do professor adjunto é o mesmo do professor, vc pode deixar apenas ele e passar pra frente
) : Professor(
        nome,
        sobrenome,
        tempoCasa,
        codigoProfessorAdjunto
) {
}