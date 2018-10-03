package behavioral.observer.usage

import org.junit.Test
import org.mockito.Mockito.*

class BreakingNewsSubjectTest {

    val testSubject = BreakingNewsSubject()

    @Test
    fun `observable is notified with breaking news`() {
        val newsText = "Awesome news"
        val newsObserver = mock(NewsObserver::class.java)

        testSubject.registerObserver(newsObserver)
        testSubject.postBreakingNews(newsText)

        verify(newsObserver, times(1)).update(newsText)
    }

    @Test
    fun `observable isn't notified with breaking news after unsubscribe`() {
        val newsText = "Awesome news"
        val newsObserver1 = mock(NewsObserver::class.java)
        val newsObserver2 = mock(NewsObserver::class.java)
        testSubject.registerObserver(newsObserver1)
        testSubject.registerObserver(newsObserver2)
        testSubject.postBreakingNews(newsText)

        verify(newsObserver1, times(1)).update(newsText)
        verify(newsObserver2, times(1)).update(newsText)

        testSubject.removeObserver(newsObserver2)

        val secondBreakingNewsText = "Another very interesting news"
        testSubject.postBreakingNews(secondBreakingNewsText)
        verify(newsObserver1, times(1)).update(secondBreakingNewsText)
        verify(newsObserver2, times(0)).update(secondBreakingNewsText)
    }

}