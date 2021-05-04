package ds.tutorials.communication.server;

import ds.tutorial.name.service.NameServiceClient;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class BankServer {

    public static final String NAME_SERVICE_ADDRESS = "http://localhost:2379";

    public static void main (String[] args) throws Exception {
        if (args.length !=1){
            System.out.println("Indicate the server port");
            System.exit(1);
        }
        int serverPort = Integer.parseInt(args[0]);
        Server server = ServerBuilder
                .forPort(serverPort)
                .addService(new BalanceServiceImpl())
                .build();
        server.start();

        NameServiceClient client = new NameServiceClient(NAME_SERVICE_ADDRESS);
        client.registerService("CheckBalanceService", "127.0.0.1", serverPort, "tcp");

        System.out.println("BankServer Started and ready to accept requests on port " + serverPort);
        server.awaitTermination();
    }
}
