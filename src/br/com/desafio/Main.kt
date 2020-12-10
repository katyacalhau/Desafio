package br.com.desafio

fun main() {


   val gerencia = DigitalHouseManager()

    //CURSO
    gerencia.registrarCurso("Full Stack", 20001, 3)
    gerencia.registrarCurso("Android", 20002, 2)







    // PROFESSOR TITULAR
    gerencia.registrarProfessorTitular("Alexandre", "De Vitto", 3, 3344, "Programação" )
    gerencia.registrarProfessorTitular("Claudio", "Milani", 5, 2255, "Design")

    //PROFESSOR ADJUNTO
    gerencia.registrarProfessorAdjunto("Maria", "Dolores", 1, 2233, 72)
    gerencia.registrarProfessorAdjunto("Fernando", "Felisberto", 0, 7698, 48)



       //MATRICULAR ALUNO
     gerencia.matricularAluno("Rafaela", "Calhau", 8899)
     gerencia.matricularAluno("João", "lamussi", 6677)
     gerencia.matricularAluno("Leon", "Milani", 1111)
     gerencia.matricularAluno("Carolina", "Moutinho", 1044)
     gerencia.matricularAluno("Lucia", "Silva", 1101)

   // MATRICULAR FULL STACK
     gerencia.matricularAlunoCurso(20001, 8899)
     gerencia.matricularAlunoCurso(20001, 6677)




   // MATRICULAR ANDROID
      gerencia.matricularAlunoCurso(20002, 3344)
      gerencia.matricularAlunoCurso(20002, 1044)
      gerencia.matricularAlunoCurso(20002, 1101)



 // ALOCAR
 gerencia.alocarProfessor(20001, 3344)
 gerencia.alocarProfessor(20002, 2255)


 gerencia.excluirCurso(20002)




}