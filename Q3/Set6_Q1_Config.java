import java.io.*;

class Config implements Serializable {
    int volume;
    int brightness;
    transient String wifiPassword;
}

public class Set6_Q1_Config {
    public static void main(String[] args) throws Exception {
        Config c1 = new Config();
        c1.volume = 70;
        c1.brightness = 50;
        c1.wifiPassword = "secret123";

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("config.ser"));
        out.writeObject(c1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("config.ser"));
        Config c2 = (Config) in.readObject();
        in.close();

        System.out.println("Volume: " + c2.volume);
        System.out.println("Brightness: " + c2.brightness);
        System.out.println("WiFi Password: " + c2.wifiPassword);
    }
}
