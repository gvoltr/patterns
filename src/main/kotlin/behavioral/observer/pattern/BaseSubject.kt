package behavioral.observer.pattern

open class BaseSubject <T> : Subject<T> {
    private val observers = ArrayList<Observer<T>>()

    override fun registerObserver(observer: Observer<T>) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer<T>) {
        observers.remove(observer)
    }

    override fun notifyObservers(data: T) {
        observers.forEach { it.update(data) }
    }
}