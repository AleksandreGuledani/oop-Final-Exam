package oop.finalexam.chat_bot;
import java.io.*;
import java.util.Properties;

public class Config {
    public String url;
    public String name;

    public Config(String filePath) throws IOException {
        Properties props = new Properties();
        try (FileReader reader = new FileReader(filePath)) {
            props.load(reader);
        }
        this.url = props.getProperty("url").trim();
        this.name = props.getProperty("name").trim();
    }
}
