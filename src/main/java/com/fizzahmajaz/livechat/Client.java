package com.fizzahmajaz.livechat;

import java.net.URI;
import java.util.Scanner;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

public class Client {
    public static void main(String[] args)  throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print(ConsoleColors.CYAN + "\n Enter your name: " + ConsoleColors.RESET);
        String name = scanner.nextLine();

        WebSocketClient client = new WebSocketClient(new URI("ws://localhost:8080/chat")) {

            @Override
            public void onOpen(ServerHandshake handshake){
                System.out.println(ConsoleColors.YELLOW + "Connected to server" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.CYAN + "Type your mesasage bwlow....\n" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.YELLOW + "> " + ConsoleColors.RESET);
            }

            @Override
            public void onMessage(String message){
                String from = message.split("\"from\":\"")[1].split("\"")[0];
                String content = message.split("\"content\":\"")[1].split("\"")[0];

                if(from.equalsIgnoreCase(name)){
                    //own message
                    System.out.println(ConsoleColors.GREEN + "You: " + content + ConsoleColors.RESET);

                }else{
                    System.out.println(ConsoleColors.RED + from + ": " + content + ConsoleColors.RESET);
                }
                System.out.println(ConsoleColors.YELLOW + "> " + ConsoleColors.RESET);
            }

            @Override
            public void onClose(int code, String reason, boolean remote){
                System.out.println(ConsoleColors.RED + "Disconnected " + reason + ConsoleColors.RESET);

            }

            @Override
            public void onError(Exception ex){
                System.out.println(ConsoleColors.RED + "Error: " + ex.getMessage() + ConsoleColors.RESET);
            }
            
        };

        client.connectBlocking(); //wait until connected
        

        while (true) {
            System.out.println(ConsoleColors.YELLOW + "> " + ConsoleColors.RESET);
            String content= scanner.nextLine();
            String json = String.format("{\"from\":\"%s\",\"content\":\"%s\"}", name, content);
            client.send(json);
            
        }


        
        
    }

    
    
}
