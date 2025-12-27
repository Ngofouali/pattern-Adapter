package com.icodi.adapter;

import com.icodi.computer.Vga;
import com.icodi.tv.Hdmi;

public class HdmiVgaAdapter implements Vga {

    private Hdmi hdmi;

    @Override
    public void print(String message) {
        System.out.println("--------- Adapter (Composition ---------");
        byte[] data = message.getBytes();
        hdmi.view(data);
        System.out.println("---------------------------------------");

    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
