package mapper

/**
 * Class that takes String and produce Int.
 */
class NumberWordsMapper : Mapper<String,Int> {
    /**
     * Takes string as an input and returns number of words in the string. Trailing spaces should be removed.
     * @param param input string
     * @return count of words in the string with removed trailing spaces
     */
    override fun map(param:String ):Int {
        if (param.trim().isEmpty()) {
            return 0
        }
        val word=param.trim().split(Regex( "\\s+"))
        return word.size
    }
}