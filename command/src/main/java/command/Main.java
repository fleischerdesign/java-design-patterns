package command;

/**
 * Demonstrating the Command pattern.
 * We use the remote control to fire commands and then undo them.
 */
public class Main {
    public static void main(String[] args) {
        // The Receiver (actual device)
        Light livingRoomLight = new Light("Living Room");
        
        // Concrete commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // The Invoker (controller)
        RemoteControl remote = new RemoteControl();

        System.out.println("--- Executing commands ---");
        remote.pressButton(lightOn);
        remote.pressButton(lightOff);

        System.out.println("\n--- Using Undo ---");
        // These will reverse the order of our actions
        remote.pressUndo(); 
        remote.pressUndo(); 
        remote.pressUndo(); 
    }
}
