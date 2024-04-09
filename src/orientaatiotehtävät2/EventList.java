package orientaatiotehtävät2;

import java.util.PriorityQueue;

class EventList {
    private PriorityQueue<Event> eventQueue;

    public EventList() {
        eventQueue = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        eventQueue.offer(event);
    }

    public Event getNextEvent() {
        return eventQueue.poll();
    }

    public boolean hasNextEvent() {
        return !eventQueue.isEmpty();
    }
}