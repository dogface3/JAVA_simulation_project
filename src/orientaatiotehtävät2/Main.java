package orientaatiotehtävät2;


public class Main {
    public static void main(String[] args) {
        // Create an EventList
        EventList eventList = new EventList();

        // Generate a list of events
        eventList.addEvent(new Event("Event 1", 1000, EventType.EXIT));
        eventList.addEvent(new Event("Event 2", 2000, EventType.EXIT));
        eventList.addEvent(new Event("Event 3", 500, EventType.ARRIVAL));
        eventList.addEvent(new Event("Event 4", 1500, EventType.ARRIVAL));

        // Remove the first event from the list
        Event nextEvent = eventList.getNextEvent();
        if (nextEvent != null) {
            System.out.println("Next Event: " + nextEvent.getName());
        } else {
            System.out.println("No more events in the list.");
        }

        // Print the contents of the EventList
        System.out.println("Events in chronological order:");
        while (eventList.hasNextEvent()) {
            Event event = eventList.getNextEvent();
            System.out.println("Event: " + event.getName() + ", Type: " + event.getEventType() + ", Time: " + event.getEventTime());
        }
    }
}

