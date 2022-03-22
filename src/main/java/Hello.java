import com.github.javafaker.Faker;
import io.DataIo;

import java.io.IOException;
import java.io.Reader;
import java.io.InputStream;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Hello {
    public static void main(String[] args) throws IOException {
        DataIo dataIo = new DataIo("./data.txt",true);
        List<Integer> list = new ArrayList<>();
        Faker faker = new Faker(new Locale("zh-CN"));
        list.add(1);
        list.add(3);
        list.add(2);
        dataIo.write(list);
        dataIo.close();
    }
}
