package com.sovon.market;

import java.util.Scanner;
import org.zeromq.ZMQ;
import org.zeromq.ZContext;
import java.net.URI;
import java.net.URISyntaxException;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws URISyntaxException, InterruptedException
    {
        try (ZContext context = new ZContext()) {
            // Socket to talk to clients
            ZMQ.Socket socket = context.createSocket(ZMQ.PUB);
            socket.bind("tcp://*:8000");

            
            BinanceWssClient c = new BinanceWssClient(
                new URI("wss://stream.binance.com:9443/stream?streams=btcusdt@trade"),
                socket
            );
            c.connect();

            new Scanner(System.in).nextLine();
            
            System.out.println("main exited");
        }
    }
}
