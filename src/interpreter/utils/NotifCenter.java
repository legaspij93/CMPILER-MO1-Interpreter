package interpreter.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class NotifCenter {

    private static NotifCenter sharedInstance = null;

    private final static String TAG = "NotificationCenter";

    private HashMap<String, ArrayList<NotifListener>> notificationMap;
    private NotifCenter() {
        this.notificationMap = new HashMap<String, ArrayList<NotifListener>>();
    }

    public void addObserver(String notificationString, NotifListener listener) {

        //if there is already an existing key, put listener to array list
        if(this.notificationMap.containsKey(notificationString)) {
            ArrayList<NotifListener> listenerList = this.notificationMap.get(notificationString);
            listenerList.add(listener);
        }
        //create new arraylist
        else {
            ArrayList<NotifListener> listenerList = new ArrayList<NotifListener>();
            listenerList.add(listener);
            this.notificationMap.put(notificationString, listenerList);
        }
    }

    public void removeObserver(String notificationString, NotifListener listener) {
        if(this.notificationMap.containsKey(notificationString)) {
            ArrayList<NotifListener> listenerList = this.notificationMap.get(notificationString);
            if(listenerList.remove(listener)) {
                System.out.println(TAG + ": " + "Removed observer " +listener);
            }
            else {
                System.out.println(TAG + ": " + "Listener not found. Doing nothing");
            }
        }
    }

    public void clearObservers() {
        this.notificationMap.clear();
    }

    public void postNotification(String notificationString, Parameters parameters) {
        ArrayList<NotifListener> listenerList = this.notificationMap.get(notificationString);

        if(listenerList != null) {
            for(NotifListener listener : listenerList) {
                listener.onNotify(notificationString, parameters);
            }
        }
    }

    public void postNotification(String notificationString) {
        ArrayList<NotifListener> listenerList = this.notificationMap.get(notificationString);

        if(listenerList != null) {
            for(NotifListener listener : listenerList) {
                listener.onNotify(notificationString, null);
            }
        }
    }

    public static NotifCenter getInstance() {
        if(sharedInstance == null) {
            sharedInstance = new NotifCenter();
        }

        return sharedInstance;
    }
}
