package behavioral.observer.pattern

interface Subject <T> {

    fun registerObserver(observer: Observer<T>)

    fun removeObserver(observer: Observer<T>)

    fun notifyObservers(data: T)

}