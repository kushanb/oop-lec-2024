package com.iit.oop.week12.Singleton;

public class DBConnection {
    private static DBConnection connection;
    private String host;
    private int port;

    private DBConnection() {
        super();
    }

    public static DBConnection getInstance() {
        if (connection == null) {
            connection = new DBConnection();
        }
        return connection;

    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
