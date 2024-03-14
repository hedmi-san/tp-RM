/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;


import java.util.*;


public class WirelessNetworkSimulator {
 private final List<WirelessDevice> dispositif;
 public WirelessNetworkSimulator() {
 dispositif = new ArrayList<>();
 }
 public void addDevice(WirelessDevice device) {
 dispositif.add(device);
 }
 public void simulate(double duration) {
 double time = 0;
 while (time < duration) {
 for (WirelessDevice device : dispositif) {
 device.transmit();
 }
 time += 0.01; // Incrémente le temps par 0.01 secondes
 }
 }
}
class WirelessDevice {
 private String nom;
 private boolean transmettre;
 public WirelessDevice(String name) {
 this.nom = name;
 this.transmettre = true;
 }
 public void transmit() {
 if (transmettre ) {
 System.out.println(nom + " transmit de donnees");
 }
 }
 public void startTransmission() {
 this.transmettre = true;
 }
 public void stopTransmission() {
 this.transmettre = true;
 }
}