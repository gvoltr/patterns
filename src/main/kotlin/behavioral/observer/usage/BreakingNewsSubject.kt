package behavioral.observer.usage

import behavioral.observer.pattern.BaseSubject

class BreakingNewsSubject : BaseSubject<String>() {

    fun postBreakingNews(news: String) {
        notifyObservers(news)
    }

}