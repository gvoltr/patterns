package behavioral.iterator


/**
 * This class can be used to iterate though every nth element of the array
 * For showcase standard kotlin Iterator interface is used
 *
 * @property array an array that we will go through
 * @property stepSize size of iteration stepSize
 */
class NthElementIterator<out T>(
        private val array: Array<T>,
        private val stepSize: Int = 1
) : Iterator<T> {

    private var step = 0

    override fun hasNext() = array.size > step * stepSize

    override fun next(): T {
        val position = step * stepSize
        step++
        return array[position]
    }

}