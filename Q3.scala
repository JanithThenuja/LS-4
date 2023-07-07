object StringFormatting {
  def main(args: Array[String]): Unit = {
    println(toUpper("Benny"))
    println(formatNames("Niroshan", 1))
    println(toLower("Saman"))
    println(formatNames("Kumara", 5))
  }

  def toUpper(str: String): String = {
    str.toUpperCase()
  }

  def toLower(str: String): String = {
    str.toLowerCase()
  }

  def formatNames(name: String, index: Int): String = {
    val changedChar = name.charAt(index)
    val modifiedChar = changedChar.toUpper
    name.patch(index, modifiedChar.toString,1)
  }
}
