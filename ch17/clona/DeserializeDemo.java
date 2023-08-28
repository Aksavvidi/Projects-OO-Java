package gr.aueb.cf.ch17.clona;

import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("C:/tmp/trainee.ser")
        )) {
            Trainee alice;
            alice = (Trainee) ois.readObject();
            System.out.println(alice);
            System.out.println("Success in deserialization");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException | ClassNotFoundException e1) {
            System.out.println("Class Not Found Exception " + e1);
            e1.printStackTrace();
        } catch (IOException e2) {
            System.out.println("IOException " + e2);
            e2.printStackTrace();
        }
    }
}
