package oop.finalexam.chat_bot;

import java.io.IOException;
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        try {
        

            Config config = new Config("config.txt");
            RestClient client = new RestClient(config.url);
            Scanner scanner = new Scanner(System.in);

            System.out.println("🤖 Welcome to " + config.name + "!");

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. View all blog posts");
                System.out.println("2. View site statistics");
                System.out.println("3. Create a new blog post");
                System.out.println("4. Exit");
                System.out.print(">> ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println("📄 Blog Posts:");
                        System.out.println(client.getAllPosts());
                        break;
                    case "2":
                        System.out.println("📊 Site Statistics:");
                        System.out.println(client.getStatistics());
                        break;
                    case "3":
                        System.out.print("Enter post title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter post content: ");
                        String content = scanner.nextLine();
                        String response = client.createPost(title, content, config.name);
                        System.out.println("✅ Server response:");
                        System.out.println(response);
                        break;
                    case "4":
                        System.out.println("👋 Goodbye!");
                        return;
                    default:
                        System.out.println("⚠️ Invalid input. Please try again.");
                }
            }

        } catch (IOException e) {
            System.err.println("❌ Error: " + e.getMessage());
        }
    }
}
