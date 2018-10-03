package behavioral.observer.usage

import behavioral.observer.pattern.Observer

class NewsObserver: Observer<String> {

    override fun update(data: String) {
        print("News observer received $data")
    }
}