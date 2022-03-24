package com.example.mquizapp

object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_arg,
            "Argentina", "Australia", "Brazil", "India",
          1
        )

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_br,
            "Brazil", "Australia", "Georgia", "Uk",
            1
        )

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_ger,
            "German", "Uk", "France", "US",
            1
        )
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_geo,
            "Georgia", "Australia", "None", "India",
            1
        )

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_in,
            "India", "Australia", "Georgia", "Uk",
            1
        )

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_it,
            "Italy", "German", "France", "US",
            1
        )
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_tur,
            "Turky", "Australia", "Brazil", "India",
            1
        )

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_uk,
            "Uk", "Australia", "Georgia", "Ukrain",
            1
        )

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fr,
            "France", "German", "France", "US",
            1
        )


        questionList.add(que1)
        return questionList
    }
}