package org.example.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        DevState devState = new DevState();

        devState.setActivity(activity);
        for (int i = 0; i < 10; i++) {
            devState.justDoIt();
            devState.changeActivity();
        }


        // День будет зависеть от того, что мы пропишем в changeActivity()
    }
}
