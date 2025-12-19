package com.rdk.validation.simulator;

public class TVsimulator {

    private boolean isOn = false;
    private boolean isWifiConnected = false;
    private String currentApp = "";

    // Power methods
    public void powerOn() {
        isOn = true;
        System.out.println("TV powered ON");
    }

    public void powerOff() {
        isOn = false;
        currentApp = "";
        System.out.println("TV powered OFF");
    }

    public boolean isOn() {
        return isOn;
    }

    public String getPowerState() {
        return isOn ? "ON" : "OFF";
    }
    // WiFi methods
    public void connectWifi() {
        if (!isOn) {
            System.out.println("Cannot connect WiFi: TV is OFF");
            return;
        }
        isWifiConnected = true;
        System.out.println("WiFi connected");
    }

    public void disconnectWifi() {
        isWifiConnected = false;
        System.out.println("WiFi disconnected");
    }

    public boolean isWifiConnected() {
        return isWifiConnected;
    }

    // App methods
    public void launchApp(String appName) {
        if (!isOn) {
            System.out.println("Cannot launch app: TV is OFF");
            return;
        }
        currentApp = appName;
        System.out.println("App launched: " + appName);
    }

    public String getCurrentApp() {
        return currentApp;
    }
}

