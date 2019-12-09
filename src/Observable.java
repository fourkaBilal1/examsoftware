public interface Observable {

    /** Add specified observer to the list of instance to be notified.
     */
    void addObserver(Observer o);

    /** Remove specified observer to the list of instance to be notified.
     */
    void removeObserver(Observer o);

    /** Notify all registered Observer
     */
    void sendNotification(Integer val);
}
