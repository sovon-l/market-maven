package com.sovon.market;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.handshake.ServerHandshake;
import com.google.gson.Gson;
import org.zeromq.ZMQ;

/**
 * This example demonstrates how to create a websocket connection to a server. Only the most
 * important callbacks are overloaded.
 */
public class BinanceWssClient extends WebSocketClient {

  private Gson gson = new Gson();
  private ZMQ.Socket socket;

  public BinanceWssClient(URI serverUri, Draft draft) {
    super(serverUri, draft);
  }

  public BinanceWssClient(URI serverURI) {
    super(serverURI);
  }

  public BinanceWssClient(URI serverUri, Map<String, String> httpHeaders) {
    super(serverUri, httpHeaders);
  }

  public BinanceWssClient(URI serverURI, ZMQ.Socket socket) {
    this(serverURI);
    this.socket = socket;
  }

  @Override
  public void onOpen(ServerHandshake handshakedata) {
    // send("Hello, it is me. Mario :)");
    System.out.println("opened connection");
    // if you plan to refuse connection based on ip or httpfields overload: onWebsocketHandshakeReceivedAsClient
  }

  @Override
  public void onMessage(String message) {
    System.out.println("received: " + message);

    BinanceTradeMsg msg = gson.fromJson(message, BinanceTradeMsg.class);

    byte[] bb = msg.toSBEMessage();

    this.socket.send(bb, 0);
  }

  @Override
  public void onClose(int code, String reason, boolean remote) {
    // The close codes are documented in class org.java_websocket.framing.CloseFrame
    System.out.println(
        "Connection closed by " + (remote ? "remote peer" : "us") + " Code: " + code + " Reason: "
            + reason);
  }

  @Override
  public void onError(Exception ex) {
    ex.printStackTrace();
    // if the error is fatal then onClose will be called additionally
  }

  public static void main(String[] args) throws URISyntaxException {
    BinanceWssClient c = new BinanceWssClient(new URI(
        "ws://localhost:8887")); // more about drafts here: http://github.com/TooTallNate/Java-WebSocket/wiki/Drafts
    c.connect();
  }

}