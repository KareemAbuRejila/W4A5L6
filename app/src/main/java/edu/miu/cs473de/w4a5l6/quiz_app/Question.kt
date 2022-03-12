package edu.miu.cs473de.w4a5l6.quiz_app

class Question {
    var id:Long?=0
    var ques:String?=""
    var answer:String?=""
    var chosenAnswer:String?=null
    var quesScore:Int?=0
    var choices:ArrayList<String>?= ArrayList()

    constructor()
    constructor(
        id: Long?,
        ques: String?,
        answer: String?,
        quesScore: Int?,
        choices: ArrayList<String>?
    ) {
        this.id = id
        this.ques = ques
        this.answer = answer
        this.quesScore = quesScore
        this.choices = choices
    }


}