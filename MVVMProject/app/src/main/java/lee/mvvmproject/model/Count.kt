package lee.mvvmproject.model

data class Count(
    var count: Int = 0
) {

    fun minusCount() =
        count--

    fun plusCount() =
        count++

    fun getCount() =
        count.toString()
}