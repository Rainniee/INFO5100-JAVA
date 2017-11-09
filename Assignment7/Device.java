/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author apple
 */

public class Device {
    public void startup() {
	System.out.println("Device started");
    }
    
    public void shutdown() {
	System.out.println("Device shutting down due to maintenance");
    }
}

public class Controller extends Thread {
	private Device device;
	private Sensor heat;
	private Sensor pressure;

	public Controller(Device device, Sensor heat, Sensor pressure) {
		this.device = device;
		this.heat = heat;
		this.pressure = pressure;
	}

	public void run() {
		device.startup();
		synchronized (device) {		
			while (true) {
				try {
					device.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("heat -> " + heat.getValue() + ", pressure -> " + pressure.getValue());
				if (heat.getValue() > 70 || pressure.getValue() > 100) {
					device.shutdown();
					break;
				}
			}
		}
	}
}