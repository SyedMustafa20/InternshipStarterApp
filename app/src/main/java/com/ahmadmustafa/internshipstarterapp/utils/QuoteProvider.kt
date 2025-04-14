package com.ahmadmustafa.internshipstarterapp.utils

object QuoteProvider {
    private val quotes=listOf(
        "The only way to do great work is to love what you do. - Steve Jobs",
        "Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful. - Albert Schweitzer",
        "Success usually comes to those who are too busy to be looking for it. - Henry David Thoreau",
        "Don't watch the clock; do what it does. Keep going. - Sam Levenson",
        "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt"
    )

    fun getQuote(): String {
        val randomIndex = (quotes.indices).random()
        return quotes[randomIndex]
    }
}