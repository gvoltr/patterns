package behavioral.observer.pattern

interface Observer<T> {

    fun update(data : T)

}