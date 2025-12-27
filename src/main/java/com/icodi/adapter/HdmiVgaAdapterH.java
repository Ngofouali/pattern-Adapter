package com.icodi.adapter;

import com.icodi.computer.Vga;
import com.icodi.tv.TV;

public class HdmiVgaAdapterH extends TV implements Vga {
    @Override
    public void print(String message) {
        System.out.println("------- Adapter (Héritage) ------");
        byte[] data = message.getBytes();
        super.view(data);
        System.out.println("---------------------------------");
    }
}
