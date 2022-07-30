package net.davidam.candle.model

import java.io.Serializable
import java.time.LocalDate

data class WordDocument(var words: String = "",
                var wordCount: Int = 0,
                var types: MutableList<String>? = null,
                var meanings: MutableList<String>? = null,
                var translations: MutableList<String>? = null,
                var synonyms: MutableList<String>? = null,
                var examples: MutableList<String>? = null,
                var combinations: MutableList<String>? = null
): Serializable

data class Request(var words: String=""): Serializable

data class Response(var docs: MutableList<WordDocument>? = null,
                var error: String = "",
                var errorCode: Int = -1,
                var exactMatch: Boolean = false
): Serializable

data class User(var uid: String,
                var email: String,
                var username: String = "",
                var phone: String = "",
                var photoUrl: String = "",
                var lastLogin: String,
                var lastLogout: String = "")