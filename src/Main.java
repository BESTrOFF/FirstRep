import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("������� ������: ");
            String string = scanner.nextLine();

            URL url = null;
            url = new URL(string);

            System.out.println("��� ������� ����?");
            String name = scanner.nextLine();
            String download = "C:\\Users\\�������\\Downloads\\" + name + ".png";
            InputStream input = null;

            input = url.openStream();
            Path path = Path.of(download);
            Files.copy(input, path);

            input.close();
        } catch (MalformedURLException e) {
            System.out.println("�������� �� ����� ������ ���.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Ssss

    }
}
